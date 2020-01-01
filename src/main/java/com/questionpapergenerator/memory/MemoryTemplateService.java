/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.memory;

import com.questionpapergenerator.api.Template;
import com.questionpapergenerator.api.TemplateService;
import com.questionpapergenerator.core.AbstractService;
import com.questionpapergenerator.core.Services;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * An implementation of TemplateService that stores all questions in memory.
 *
 * @author piya
 */
public class MemoryTemplateService extends AbstractService implements TemplateService {

    private static final AtomicInteger TEMPLATE_ID = new AtomicInteger(0);

    private final Map<Integer, Template> templates = new HashMap<>();

    public MemoryTemplateService(Services services) {
        super(services);
    }

    @Override
    public void create(Template template) {
        if (templates.containsKey(template.getTemplateId())) {
            throw new IllegalArgumentException("Template already created");
        }
        int templateId = TEMPLATE_ID.incrementAndGet();
        template.setTemplateId(templateId);
        templates.put(templateId, template);
    }

    @Override
    public void delete(Template template) {
        if (templates.containsKey(template.getTemplateId())) {
            templates.remove(template.getTemplateId());
        } else {
            throw new IllegalArgumentException("Template does not exist");
        }
    }

}