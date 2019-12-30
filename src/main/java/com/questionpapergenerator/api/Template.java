/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.api;

import java.util.HashMap;
import java.util.Map;

/**
 * A class which represents a question paper template
 *
 * @author piya
 */
public class Template {

    private static final String EASY_DIFFICULTY = "Easy";
    private static final String MEDIUM_DIFFICULTY = "Medium";
    private static final String HARD_DIFFICULTY = "Hard";

    private int templateId;
    private final Map<String, Integer> difficultyMap;
    private final int marks;

    public Template(int marks, int easyLevel, int mediumLevel, int hardLevel) {
        this.marks = marks;
        this.difficultyMap = new HashMap<>();
        this.difficultyMap.put(EASY_DIFFICULTY, easyLevel);
        this.difficultyMap.put(MEDIUM_DIFFICULTY, mediumLevel);
        this.difficultyMap.put(HARD_DIFFICULTY, hardLevel);
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public Map<String, Integer> getDifficultyMap() {
        return difficultyMap;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Template{" + "templateId=" + templateId + ", difficultyMap=" + difficultyMap + ", marks=" + marks + '}';
    }
}
