/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.api;

import java.util.Collection;

/**
 * A class which represents a QuestionPaper as a collection of questions which
 * follows rules of a template.
 *
 * @author piya
 */
public class QuestionPaper {

    private int questionPaperId;
    private Collection<Question> questions;
    private Template template;

    public int getQuestionPaperId() {
        return questionPaperId;
    }

    public void setQuestionPaperId(int questionPaperId) {
        this.questionPaperId = questionPaperId;
    }

    public Collection<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Collection<Question> questions) {
        this.questions = questions;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    @Override
    public String toString() {
        return "QuestionPaper{" + "questionPaperId=" + questionPaperId + ", template=" + template + '}';
    }

}
