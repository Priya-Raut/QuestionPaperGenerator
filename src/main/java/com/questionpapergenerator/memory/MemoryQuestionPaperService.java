/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.memory;

import com.questionpapergenerator.api.QuestionPaper;
import com.questionpapergenerator.api.QuestionPaperService;
import com.questionpapergenerator.core.AbstractService;
import com.questionpapergenerator.core.Services;

/**
 * An implementation of QuestionPaperService that stores all question papers in
 * memory.
 *
 * @author piya
 */
public class MemoryQuestionPaperService extends AbstractService implements QuestionPaperService {
    
    public MemoryQuestionPaperService(Services services){
        super(services);
    }

    @Override
    public void create(QuestionPaper questionPaper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(QuestionPaper questionPaper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
