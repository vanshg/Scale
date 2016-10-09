package com.vanshgandhi.scale.tasks;

import com.vanshgandhi.scale.Urgency;

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
}
