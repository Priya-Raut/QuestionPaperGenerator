/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.api;

/**
 * A class that represents a question
 * 
 * @author piya
 */
public class Question {
    public static final String ENGLISH = "English";
    public static final String MATHS = "Maths";
    public static final String HISTORY = "History";

    private int questionId;
    private String text;
    private String subject;
    private String difficulty;
    private int marks;

    public Question(String text, String subject, String difficulty, int marks) {
        this.text = text;
        this.subject = subject;
        this.difficulty = difficulty;
        this.marks = marks;
    }
    
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Question{" + "questionId=" + questionId + ", text=" + text + ", subject=" + subject + ", difficulty=" + difficulty + ", marks=" + marks + '}';
    }
}
