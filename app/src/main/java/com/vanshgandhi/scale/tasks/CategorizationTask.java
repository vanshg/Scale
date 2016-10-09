package com.vanshgandhi.scale.tasks;

import com.vanshgandhi.scale.Urgency;

import java.util.Map;

/**
 * Created by Vansh Gandhi on 10/7/16.
 * Copyright © 2016
 */

public class CategorizationTask {
    public String              callbackUrl;
    public String              instruction;
    public AttachmentType      attachmentType;
    public String              attachment;
    public String[]            categories;
    public Urgency             urgency;
    public Map<String, String> categoryIds;
    public boolean             allowMultiple;
    public Map<String, Object> metadata;
}
