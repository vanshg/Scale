package com.vanshgandhi.scale.models.tasks;

import com.vanshgandhi.scale.models.Urgency;

import java.util.Map;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

public class ComparisonTask {
    private String              callbackUrl;
    private String              instruction;
    private AttachmentType      attachmentType;
    private String[]            attachments;
    private Urgency             urgency;
    private Map<String, String> fields;
    private String[]            choices;
    private Map<String, Object> metadata;
}
