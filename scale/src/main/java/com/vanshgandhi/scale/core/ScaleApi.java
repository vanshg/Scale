package com.vanshgandhi.scale.core;

import com.vanshgandhi.scale.models.tasks.AnnotationTask;
import com.vanshgandhi.scale.models.tasks.CategorizationTask;
import com.vanshgandhi.scale.models.tasks.ComparisonTask;
import com.vanshgandhi.scale.models.tasks.PhoneCallTask;
import com.vanshgandhi.scale.models.tasks.Task;
import com.vanshgandhi.scale.models.tasks.TranscriptionTask;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

interface ScaleApi {
    @GET("task/{id}")
    Call<Task> getTask(@Path("id") String id);

    @GET("task/{id}/cancel")
    Call<Task> cancelTask(@Path("id") String id);

    @GET("tasks")
    Call<List<Task>> getAllTasks();

    @POST("task/categorize")
    Call<Task> createCategorizationTask(@Body CategorizationTask task);

    @POST("task/transcription")
    Call<Task> createTranscriptionTask(@Body TranscriptionTask task);

    @POST("task/phonecall")
    Call<Task> createPhoneTask(@Body PhoneCallTask task);

    @POST("task/comparison")
    Call<Task> createComparisonTask(@Body ComparisonTask task);

    @POST("task/annotation")
    Call<Task> createAnnotationTask(@Body AnnotationTask task);
}
