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
    private String              taskId;
    private TaskType            type;
    private String              instruction;
    private Object              params;
    private Urgency             urgency;
    private Object              response;
    private String              callbackUrl;
    private Status              status;
    private Date                createdAt;
    private Date                completedAt;
    private Map<String, Object> metadata;
    
    public String getTaskId() {
        return taskId;
    }
    
    public Task setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    
    public TaskType getType() {
        return type;
    }
    
    public Task setType(TaskType type) {
        this.type = type;
        return this;
    }
    
    public String getInstruction() {
        return instruction;
    }
    
    public Task setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    
    public Object getParams() {
        return params;
    }
    
    public Task setParams(Object params) {
        this.params = params;
        return this;
    }
    
    public Urgency getUrgency() {
        return urgency;
    }
    
    public Task setUrgency(Urgency urgency) {
        this.urgency = urgency;
        return this;
    }
    
    public Object getResponse() {
        return response;
    }
    
    public Task setResponse(Object response) {
        this.response = response;
        return this;
    }
    
    public String getCallbackUrl() {
        return callbackUrl;
    }
    
    public Task setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    
    public Status getStatus() {
        return status;
    }
    
    public Task setStatus(Status status) {
        this.status = status;
        return this;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public Task setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    public Date getCompletedAt() {
        return completedAt;
    }
    
    public Task setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
    public Task setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
}
