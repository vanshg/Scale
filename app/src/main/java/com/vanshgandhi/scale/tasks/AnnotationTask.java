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
}
