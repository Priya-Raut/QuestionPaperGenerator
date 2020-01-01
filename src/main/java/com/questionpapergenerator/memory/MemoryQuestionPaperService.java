/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.memory;

import com.questionpapergenerator.api.Question;
import com.questionpapergenerator.api.QuestionPaper;
import com.questionpapergenerator.api.QuestionPaperService;
import com.questionpapergenerator.api.Template;
import com.questionpapergenerator.core.AbstractService;
import com.questionpapergenerator.core.Services;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * An implementation of QuestionPaperService that stores all question papers in
 * memory.
 *
 * @author piya
 */
public class MemoryQuestionPaperService extends AbstractService implements QuestionPaperService {

    private static final AtomicInteger QUESTION_PAPER_ID = new AtomicInteger(0);

    Map<Integer, Collection<Question>> questionPapers = new HashMap<>();

    public MemoryQuestionPaperService(Services services) {
        super(services);
    }

    @Override
    public void create(QuestionPaper paper) {
        if (questionPapers.containsKey(paper.getQuestionPaperId())) {
            throw new IllegalArgumentException("Question paper already created");
        } else {
            int paperId = QUESTION_PAPER_ID.incrementAndGet();
            paper.setQuestionPaperId(paperId);
            questionPapers.put(paperId, paper.getQuestions());
        }
    }

    @Override
    public void delete(QuestionPaper paper) {
        if (questionPapers.containsKey(paper.getQuestionPaperId())) {
            questionPapers.remove(paper.getQuestionPaperId());
        } else {
            throw new IllegalArgumentException("Question paper does not exist");
        }
    }

}
