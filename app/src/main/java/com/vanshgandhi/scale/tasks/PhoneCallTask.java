package com.vanshgandhi.scale.tasks;

import com.vanshgandhi.scale.Urgency;

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
}
