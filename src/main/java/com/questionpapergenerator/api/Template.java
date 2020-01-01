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

    public static final String EASY_DIFFICULTY = "Easy";
    public static final String MEDIUM_DIFFICULTY = "Medium";
    public static final String HARD_DIFFICULTY = "Hard";

    private int templateId;
    private final Map<String, Integer> difficultyMap;
    private final int totalMarks;

    public Template(int totalMarks, int easyLevel, int mediumLevel, int hardLevel) {
        if(easyLevel + mediumLevel + hardLevel != 100){
            throw new IllegalArgumentException("Sum of difficulty level percent should be 100.");
        }
        this.totalMarks = totalMarks;
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
        return totalMarks;
    }

    @Override
    public String toString() {
        return "Template{" + "templateId=" + templateId + ", difficultyMap=" + difficultyMap + ", totalMarks=" + totalMarks + '}';
    }
}
