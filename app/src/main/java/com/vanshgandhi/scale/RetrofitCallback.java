package com.vanshgandhi.scale;

import com.vanshgandhi.scale.core.ScaleException;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by Vansh Gandhi on 10/9/16.
 * Copyright © 2016
 */

public class RetrofitCallback<T> implements Callback<T> {
    private ScaleCallback<T> scaleCallback;

    public RetrofitCallback(ScaleCallback<T> scaleCallback) {
        this.scaleCallback = scaleCallback;
    }

    @Override
    public void onResponse(Call<T> call, retrofit2.Response<T> response) {
        if (scaleCallback == null) {
            return;
        }
        if (!response.isSuccessful()) {
            try {
                System.out.println(new String(response.errorBody().bytes()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            scaleCallback.onError(ScaleException.fromCode(response.code()));
            return;
        }
        scaleCallback.onSuccess(response.body());
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        if (scaleCallback != null) {
            scaleCallback.onError(new Exception(t));
        }
    }
}
