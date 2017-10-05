package org.dougllas.udemy.todoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * Criado por dougllas.sousa em 03/10/2017.
 */

@RestController
@RequestMapping("/task")
public class TaskController implements Serializable{

    @RequestMapping("/teste")
    @ResponseBody
    public String teste(){
        return "hello";
    }
}