/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.api;

/**
 * A service which keeps track of which template exists
 *
 * @author piya
 */
public interface TemplateService {

    /**
     * Create the given template.
     * 
     * @param template the template to be created
     */
    void create(Template template);

    /**
     * Delete the given template.
     * 
     * @param template the template to be deleted
     */
    void delete(Template template);

}
