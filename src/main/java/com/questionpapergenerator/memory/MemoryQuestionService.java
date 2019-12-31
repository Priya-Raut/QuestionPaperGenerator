/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.memory;

import com.questionpapergenerator.api.Question;
import com.questionpapergenerator.api.QuestionService;
import com.questionpapergenerator.core.AbstractService;
import com.questionpapergenerator.core.Services;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * An implementation of QuestionService that stores all questions in memory.
 *
 * @author piya
 */
public class MemoryQuestionService extends AbstractService implements QuestionService {

    private static final AtomicInteger QUESTION_ID = new AtomicInteger(0);

    private final Map<Integer, Question> questions = new HashMap<>();

    public MemoryQuestionService(Services services) {
        super(services);
    }

    @Override
    public void create(Question question) {
        if (questions.containsKey(question.getQuestionId())) {
            throw new IllegalArgumentException("Question already created");
        }
        int questionId = QUESTION_ID.incrementAndGet();
        question.setQuestionId(questionId);
        questions.put(questionId, question);
    }

    @Override
    public void delete(Question question) {
        if (questions.containsKey(question.getQuestionId())) {
            questions.remove(question.getQuestionId());
        }
        else{
            throw new IllegalArgumentException("Question does not exist");
        }
    }

}
