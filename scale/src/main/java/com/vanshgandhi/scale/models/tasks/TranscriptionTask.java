package com.vanshgandhi.scale.models.tasks;

import com.vanshgandhi.scale.models.Urgency;

import java.util.Map;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

public class TranscriptionTask {
    private String              callbackUrl;
    private String              instruction;
    private AttachmentType      attachmentType;
    private String              attachment;
    private Map<String, String> fields;
    private Map<String, String> rowFields;
    private Urgency             urgency;
    private Map<String, String> metadata;
    
    public String getCallbackUrl() {
        return callbackUrl;
    }
    
    public TranscriptionTask setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    
    public String getInstruction() {
        return instruction;
    }
    
    public TranscriptionTask setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    
    public AttachmentType getAttachmentType() {
        return attachmentType;
    }
    
    public TranscriptionTask setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }
    
    public String getAttachment() {
        return attachment;
    }
    
    public TranscriptionTask setAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }
    
    public Map<String, String> getFields() {
        return fields;
    }
    
    public TranscriptionTask setFields(Map<String, String> fields) {
        this.fields = fields;
        return this;
    }
    
    public Map<String, String> getRowFields() {
        return rowFields;
    }
    
    public TranscriptionTask setRowFields(Map<String, String> rowFields) {
        this.rowFields = rowFields;
        return this;
    }
    
    public Urgency getUrgency() {
        return urgency;
    }
    
    public TranscriptionTask setUrgency(Urgency urgency) {
        this.urgency = urgency;
        return this;
    }
    
    public Map<String, String> getMetadata() {
        return metadata;
    }
    
    public TranscriptionTask setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
