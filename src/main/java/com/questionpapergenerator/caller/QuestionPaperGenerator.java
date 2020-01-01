/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.caller;

import com.questionpapergenerator.api.Question;
import com.questionpapergenerator.api.QuestionPaper;
import com.questionpapergenerator.api.Template;
import com.questionpapergenerator.core.ServiceFactory;
import com.questionpapergenerator.core.Services;
import com.questionpapergenerator.memory.MemoryQuestionPaperService;
import com.questionpapergenerator.memory.MemoryQuestionService;
import com.questionpapergenerator.memory.MemoryTemplateService;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * The main class which calls all the functions to generate QuestionPaper
 *
 * @author piya
 */
public class QuestionPaperGenerator {

    Scanner sc = new Scanner(System.in);
    Services services = ServiceFactory.createServices();
    MemoryQuestionService questionService = services.getMemoryQuestionService();
    MemoryQuestionPaperService questionPaperService = services.getMemoryQuestionPaperService();
    MemoryTemplateService templateService = services.getMemoryTemplateService();
    Set<Question> questions = new LinkedHashSet<>();

    public Template createTemplate() {
        System.out.println("Enter total marks: ");
        int totalMarks = sc.nextInt();
        System.out.println("Enter difficulty percent (easy): ");
        int easyLevel = sc.nextInt();
        System.out.println("Enter difficulty percent (medium): ");
        int mediumLevel = sc.nextInt();
        System.out.println("Enter difficulty percent (hard): ");
        int hardLevel = sc.nextInt();
        //Template
        Template template = new Template(totalMarks, easyLevel, mediumLevel, hardLevel);
        templateService.create(template);
        System.out.println(template);
        return template;
    }

    public Collection<Question> createQuestions(Template template) {
        System.out.println("Enter marks of a question: ");
        int marksOfAQueston = sc.nextInt();
        createQuestionsByDifficultyLevel(marksOfAQueston, template.getDifficultyMap().get(Template.EASY_DIFFICULTY), Template.EASY_DIFFICULTY);
        createQuestionsByDifficultyLevel(marksOfAQueston, template.getDifficultyMap().get(Template.MEDIUM_DIFFICULTY), Template.MEDIUM_DIFFICULTY);
        createQuestionsByDifficultyLevel(marksOfAQueston, template.getDifficultyMap().get(Template.HARD_DIFFICULTY), Template.HARD_DIFFICULTY);
        questions.forEach(System.out::println);
        return questions;
    }

    public Collection<Question> createQuestionsByDifficultyLevel(int marksOfAQueston, int totalMarks, String level) {
        int numberOfQuestions = MemoryQuestionService.getNumberOfQuestions(marksOfAQueston, totalMarks);
        for (int i = 0; i < numberOfQuestions; i++) {
            Question question
                    = new Question("21 + 12 = ?", Question.MATHS, level, marksOfAQueston);
            questionService.create(question);
            questions.add(question);
        }
        return questions;
    }

    public void createQuestionPaper(QuestionPaper questionPaper) {
        questionPaperService.create(questionPaper);
    }

    public static void main(String[] args) {
        QuestionPaperGenerator paperGenerator = new QuestionPaperGenerator();
        Template template = paperGenerator.createTemplate();
        Collection<Question> questions = paperGenerator.createQuestions(template);
        paperGenerator.createQuestionPaper(new QuestionPaper(template, questions));
    }
}
