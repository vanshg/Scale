package com.vanshgandhi.scale.models.tasks;

import com.vanshgandhi.scale.models.Urgency;

import java.util.Map;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

public class CategorizationTask {
    private String              callbackUrl;
    private String              instruction;
    private AttachmentType      attachmentType;
    private String              attachment;
    private String[]            categories;
    private Urgency             urgency;
    private Map<String, String> categoryIds;
    private boolean             allowMultiple;
    private Map<String, Object> metadata;
    
    public String getCallbackUrl() {
        return callbackUrl;
    }
    
    public CategorizationTask setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    
    public String getInstruction() {
        return instruction;
    }
    
    public CategorizationTask setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    
    public AttachmentType getAttachmentType() {
        return attachmentType;
    }
    
    public CategorizationTask setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }
    
    public String getAttachment() {
        return attachment;
    }
    
    public CategorizationTask setAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }
    
    public String[] getCategories() {
        return categories;
    }
    
    public CategorizationTask setCategories(String[] categories) {
        this.categories = categories;
        return this;
    }
    
    public Urgency getUrgency() {
        return urgency;
    }
    
    public CategorizationTask setUrgency(Urgency urgency) {
        this.urgency = urgency;
        return this;
    }
    
    public Map<String, String> getCategoryIds() {
        return categoryIds;
    }
    
    public CategorizationTask setCategoryIds(Map<String, String> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    
    public boolean isAllowMultiple() {
        return allowMultiple;
    }
    
    public CategorizationTask setAllowMultiple(boolean allowMultiple) {
        this.allowMultiple = allowMultiple;
        return this;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
    public CategorizationTask setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
}
