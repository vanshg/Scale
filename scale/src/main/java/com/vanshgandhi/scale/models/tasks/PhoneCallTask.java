package com.vanshgandhi.scale.models.tasks;

import com.vanshgandhi.scale.models.Urgency;

import java.util.Map;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

public class PhoneCallTask {
    private String              callbackUrl;
    private String              instruction;
    private String              phoneNumber;
    private String              script;
    private String              entityName;
    private Urgency             urgency;
    private AttachmentType      attachmentType;
    private Map<String, String> fields;
    private String[]            choices;
    private Map<String, Object> metadata;
    
    public String getCallbackUrl() {
        return callbackUrl;
    }
    
    public PhoneCallTask setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    
    public String getInstruction() {
        return instruction;
    }
    
    public PhoneCallTask setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public PhoneCallTask setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    public String getScript() {
        return script;
    }
    
    public PhoneCallTask setScript(String script) {
        this.script = script;
        return this;
    }
    
    public String getEntityName() {
        return entityName;
    }
    
    public PhoneCallTask setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    
    public Urgency getUrgency() {
        return urgency;
    }
    
    public PhoneCallTask setUrgency(Urgency urgency) {
        this.urgency = urgency;
        return this;
    }
    
    public AttachmentType getAttachmentType() {
        return attachmentType;
    }
    
    public PhoneCallTask setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }
    
    public Map<String, String> getFields() {
        return fields;
    }
    
    public PhoneCallTask setFields(Map<String, String> fields) {
        this.fields = fields;
        return this;
    }
    
    public String[] getChoices() {
        return choices;
    }
    
    public PhoneCallTask setChoices(String[] choices) {
        this.choices = choices;
        return this;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
    
    public PhoneCallTask setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
}
