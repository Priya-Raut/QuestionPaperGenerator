/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.api;

import java.util.Collection;

/**
 * A service which keeps track of which question paper exists.
 *
 * @author piya
 */
public interface QuestionPaperService {

    /**
     * Create given question paper.
     *
     * @param paper
     */
    void create(QuestionPaper paper);

    /**
     * Delete given question paper.
     *
     * @param paper
     */
    void delete(QuestionPaper paper);

//TO DO: To be added..
//    Collection<Question> getAllQuestions(QuestionPaper questionPaper);
//    
//    Collection<Question> getQuestionsBySubject();
//    
//    Collection<Question> getQuestionsByDifficulty();
//    
//    Collection<Question> getQuestionsByMarks();
}
