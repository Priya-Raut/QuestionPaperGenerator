/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionpapergenerator.core;

/**
 *
 * @author piya
 */
public abstract class AbstractService {

    protected final Services services;

    protected AbstractService(Services services) {
        this.services = services;
    }

}
