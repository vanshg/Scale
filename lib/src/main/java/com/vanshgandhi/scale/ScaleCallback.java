package com.vanshgandhi.scale;

/**
 * Created by Vansh Gandhi on 10/9/16.
 * Copyright © 2016
 */

public interface ScaleCallback<T> {
    void onSuccess(T response);
    void onError(Exception e);
}
