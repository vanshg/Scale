package com.vanshgandhi.scale.core;

import android.support.annotation.Nullable;
import android.util.Base64;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vanshgandhi.scale.models.ScaleCallback;
import com.vanshgandhi.scale.models.tasks.AnnotationTask;
import com.vanshgandhi.scale.models.tasks.CategorizationTask;
import com.vanshgandhi.scale.models.tasks.ComparisonTask;
import com.vanshgandhi.scale.models.tasks.PhoneCallTask;
import com.vanshgandhi.scale.models.tasks.Task;
import com.vanshgandhi.scale.models.tasks.TranscriptionTask;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

public class Scale {

    private static ScaleService service;

    private Scale() {
    }

    public static void init(final String apiKey) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                request = request.newBuilder().header("Authorization", encodedApi(apiKey)).build();
                return chain.proceed(request);
            }
        }).addInterceptor(logging).build();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
//                .enableComplexMapKeySerialization()
                .create();
        Retrofit retrofit = new Retrofit.Builder().client(client)
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        service = retrofit.create(ScaleService.class);
    }

    private static String encodedApi(String apiKey) {
        String username = apiKey + ":";
        return "Basic " + Base64.encodeToString(username.getBytes(), Base64.NO_WRAP);
    }

    public static void getTask(String id, @Nullable ScaleCallback<Task> callback) {
        service.getTask(id).enqueue(new RetrofitCallback<>(callback));
    }

    public static void cancelTask(String id, @Nullable ScaleCallback<Task> callback) {
        service.cancelTask(id).enqueue(new RetrofitCallback<>(callback));
    }

    public static void getAllTasks(@Nullable ScaleCallback<List<Task>> callback) {
        service.getAllTasks().enqueue(new RetrofitCallback<>(callback));
    }

    public static void createCategorizationTask(CategorizationTask task, @Nullable ScaleCallback<Task> callback) {
        service.createCategorizationTask(task).enqueue(new RetrofitCallback<>(callback));
    }

    public static void createTranscriptionTask(TranscriptionTask task, @Nullable ScaleCallback<Task> callback) {
        service.createTranscriptionTask(task).enqueue(new RetrofitCallback<>(callback));
    }

    public static void createPhoneTask(PhoneCallTask task, @Nullable ScaleCallback<Task> callback) {
        service.createPhoneTask(task).enqueue(new RetrofitCallback<>(callback));
    }

    public static void createComparisonTask(ComparisonTask task, @Nullable ScaleCallback<Task> callback) {
        service.createComparisonTask(task).enqueue(new RetrofitCallback<>(callback));
    }

    public static void createAnnotationTask(AnnotationTask task, @Nullable ScaleCallback<Task> callback) {
        service.createAnnotationTask(task).enqueue(new RetrofitCallback<>(callback));
    }
}
