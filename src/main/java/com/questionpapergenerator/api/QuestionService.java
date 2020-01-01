/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.api;

import java.util.Collection;

/**
 * A service which keeps track of which question exists
 *
 * @author piya
 */
public interface QuestionService {

    /**
     * Create the given question.
     *
     * @param question the question to create.
     */
    void create(Question question);

    /**
     * Delete the given question.
     *
     * @param question the question to delete.
     */
    void delete(Question question);
}
