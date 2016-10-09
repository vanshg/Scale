package com.vanshgandhi.scale.tasks;

import com.vanshgandhi.scale.Status;
import com.vanshgandhi.scale.TaskType;
import com.vanshgandhi.scale.Urgency;

import java.util.Date;
import java.util.Map;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * © Copyright 2016
 */

public class Task {
    public String              taskId;
    public TaskType            type;
    public String              instruction;
    public Object              params;
    public Urgency             urgency;
    public Object              response;
    public String              callbackUrl;
    public Status              status;
    public Date                createdAt;
    public Date                completedAt;
    public Map<String, Object> metadata;
}
