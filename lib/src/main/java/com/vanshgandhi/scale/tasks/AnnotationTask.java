package com.vanshgandhi.scale.tasks;

import com.vanshgandhi.scale.Urgency;

import java.util.Map;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

public class AnnotationTask {
    private String              callbackUrl;
    private String[]            objectsToAnnotate;
    private String              attachment;
    private boolean             withLabels;
    private Urgency             urgency;
    private String              instruction;
    private AttachmentType      attachmentType;
    private Map<String, Object> metadata;
    
    public String getCallbackUrl() {
        return callbackUrl;
    }
    
    public AnnotationTask setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    public String[] getObjectsToAnnotate() {
        return objectsToAnnotate;
    }

    public AnnotationTask setObjectsToAnnotate(String[] objectsToAnnotate) {
        this.objectsToAnnotate = objectsToAnnotate;
        return this;
    }

    public String getAttachment() {
        return attachment;
    }

    public AnnotationTask setAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }

    public boolean isWithLabels() {
        return withLabels;
    }

    public AnnotationTask setWithLabels(boolean withLabels) {
        this.withLabels = withLabels;
        return this;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public AnnotationTask setUrgency(Urgency urgency) {
        this.urgency = urgency;
        return this;
    }

    public String getInstruction() {
        return instruction;
    }

    public AnnotationTask setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    public AnnotationTask setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public AnnotationTask setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
}
