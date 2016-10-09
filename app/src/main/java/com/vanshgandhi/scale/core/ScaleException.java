package com.vanshgandhi.scale.core;

/**
 * Created by Vansh Gandhi on 10/9/16.
 * Copyright © 2016
 */

public class ScaleException extends Exception {
    public ScaleException(String message) {
        super(message);
    }

    public static ScaleException fromCode(int code) {
        switch (code) {
            case 200: return new ScaleException(Constants.ERROR_200);
            case 400: return new ScaleException(Constants.ERROR_400);
            case 401: return new ScaleException(Constants.ERROR_401);
            case 404: return new ScaleException(Constants.ERROR_404);
            case 429: return new ScaleException(Constants.ERROR_429);
            case 500: return new ScaleException(Constants.ERROR_500);
            default: return new ScaleException(Constants.ERROR_UKNOWN);
        }
    }
}
