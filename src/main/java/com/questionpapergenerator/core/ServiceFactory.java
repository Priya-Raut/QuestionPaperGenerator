/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.core;

import com.questionpapergenerator.memory.MemoryQuestionPaperService;
import com.questionpapergenerator.memory.MemoryQuestionService;
import com.questionpapergenerator.memory.MemoryTemplateService;

/**
 * Factory for building new memory based services.
 * 
 * @author piya
 */
public class ServiceFactory implements Services{
    
    private final MemoryQuestionService memoryQuestionService;
    private final MemoryQuestionPaperService memoryQuestionPaperService;
    private final MemoryTemplateService memoryTemplateService;
    
    public static Services createServices(){
        return new ServiceFactory();
    }
    
    private ServiceFactory(){
        memoryQuestionService = new MemoryQuestionService(this);
        memoryQuestionPaperService = new MemoryQuestionPaperService(this);
        memoryTemplateService = new MemoryTemplateService(this);
    }

    @Override
    public MemoryQuestionService getMemoryQuestionService() {
        return memoryQuestionService;
    }

    @Override
    public MemoryQuestionPaperService getMemoryQuestionPaperService() {
        return memoryQuestionPaperService;
    }

    @Override
    public MemoryTemplateService getMemoryTemplateService() {
        return memoryTemplateService;
    }
}
