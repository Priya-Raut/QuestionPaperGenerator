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
 * An interface which gives access to all the services
 * 
 * @author piya
 */
public interface Services {
    MemoryQuestionService getMemoryQuestionService();
    MemoryQuestionPaperService getMemoryQuestionPaperService();
    MemoryTemplateService getMemoryTemplateService();
}
