/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.caller;

import com.questionpapergenerator.api.Question;
import com.questionpapergenerator.api.Template;
import com.questionpapergenerator.core.ServiceFactory;
import com.questionpapergenerator.core.Services;
import com.questionpapergenerator.memory.MemoryQuestionService;
import com.questionpapergenerator.memory.MemoryTemplateService;

/**
 * The main class which calls all the functions to generate QuestionPaper
 *
 * @author piya
 */
public class QuestionPaperGenerator {

    public static void main(String[] args) {
        Services services = ServiceFactory.createServices();
        MemoryTemplateService templateService = services.getMemoryTemplateService();
        MemoryQuestionService questionService = services.getMemoryQuestionService();
        Template template = new Template(100, 30, 50, 20);
        templateService.create(template);
        Question question = new Question("21 + 12 = ?", "Maths", Template.EASY_DIFFICULTY, 2);
        questionService.create(question);
        System.out.println(template);
        System.out.println(question);

    }
}
