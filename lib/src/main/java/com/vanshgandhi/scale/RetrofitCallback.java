package com.vanshgandhi.scale;

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
        if (scaleCallback != null) {
            if (response.isSuccessful()) {
                scaleCallback.onSuccess(response.body());
            } else {
                try {
                    scaleCallback.onError(new Exception(new String(response.errorBody().bytes())));
                } catch (IOException e) {
                    scaleCallback.onError(e);
                }
            }
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        if (scaleCallback != null) {
            scaleCallback.onError(new Exception(t));
        }
    }
}
