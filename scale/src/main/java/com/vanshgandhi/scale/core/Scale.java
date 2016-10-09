package com.vanshgandhi.scale.core;

import android.support.annotation.NonNull;
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
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

public class Scale {

    private static ScaleApi api;

    /**
     * Private constructor
     */
    private Scale() {
    }

    /**
     * Initialize the SDK. This should be the first method you call
     *
     * @param apiKey Your Scale API Key
     * @see <a href="https://dashboard.scaleapi.com">https://dashboard.scaleapi.com</a>
     */
    public static void init(@NonNull final String apiKey) {
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request(); //Add the Authorization Header to every request
                request = request.newBuilder().header("Authorization", encodedApi(apiKey)).build();
                return chain.proceed(request);
            }
        }).build();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) //Camel case to proper JSON format
                .create();
        Retrofit retrofit = new Retrofit.Builder().client(client)
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        api = retrofit.create(ScaleApi.class);
    }

    /**
     * Encode the API Key in Base 64
     *
     * @param apiKey The API Key to encode
     * @return the Encoded API Key for usage in an Authorization Header
     */
    private static String encodedApi(@NonNull String apiKey) {
        String username = apiKey + ":";
        return "Basic " + Base64.encodeToString(username.getBytes(), Base64.NO_WRAP);
    }

    /**
     * Get a Task by its ID
     *
     * @param id       The ID of the task to get
     * @param callback The callback that is invoked on success or error
     */
    public static void getTask(@NonNull String id, @Nullable ScaleCallback<Task> callback) {
        api.getTask(id).enqueue(new RetrofitCallback<>(callback));
    }

    /**
     * Cancel a pending task, so that it is not completed
     * You will get a 500 error if you attempt to cancel a completed task
     *
     * @param id       The ID of the task to cancel
     * @param callback The callback that is invoked on success or error
     */
    public static void cancelTask(@NonNull String id, @Nullable ScaleCallback<Task> callback) {
        api.cancelTask(id).enqueue(new RetrofitCallback<>(callback));
    }

    /**
     * Get a list of all your tasks
     *
     * @param callback The callback that is invoked on success or error
     */
    public static void getAllTasks(@Nullable ScaleCallback<List<Task>> callback) {
        api.getAllTasks().enqueue(new RetrofitCallback<>(callback));
    }

    /**
     * Create a categorization task
     *
     * @param task     A categorization task
     * @param callback The callback that is invoked on success or error
     */
    public static void createCategorizationTask(@NonNull CategorizationTask task,
                                                @Nullable ScaleCallback<Task> callback) {
        api.createCategorizationTask(task).enqueue(new RetrofitCallback<>(callback));
    }

    /**
     * Create a transcription task
     *
     * @param task     A transcription task
     * @param callback The callback that is invoked on success or error
     */
    public static void createTranscriptionTask(@NonNull TranscriptionTask task,
                                               @Nullable ScaleCallback<Task> callback) {
        api.createTranscriptionTask(task).enqueue(new RetrofitCallback<>(callback));
    }

    /**
     * Create a phone call task
     *
     * @param task     A phone call task
     * @param callback The callback that is invoked on success or error
     */
    public static void createPhoneTask(@NonNull PhoneCallTask task,
                                       @Nullable ScaleCallback<Task> callback) {
        api.createPhoneTask(task).enqueue(new RetrofitCallback<>(callback));
    }

    /**
     * Create a comparison task
     *
     * @param task     A comparison task
     * @param callback The callback that is invoked on success or error
     */
    public static void createComparisonTask(@NonNull ComparisonTask task,
                                            @Nullable ScaleCallback<Task> callback) {
        api.createComparisonTask(task).enqueue(new RetrofitCallback<>(callback));
    }

    /**
     * Create an annotation task
     *
     * @param task     An annotation task
     * @param callback The callback that is invoked on success or error
     */
    public static void createAnnotationTask(@NonNull AnnotationTask task,
                                            @Nullable ScaleCallback<Task> callback) {
        api.createAnnotationTask(task).enqueue(new RetrofitCallback<>(callback));
    }
}
