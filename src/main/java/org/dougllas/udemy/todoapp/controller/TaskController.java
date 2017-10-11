package org.dougllas.udemy.todoapp.controller;

import org.dougllas.udemy.todoapp.model.Task;
import org.dougllas.udemy.todoapp.repository.TaskReporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * Criado por dougllas.sousa em 03/10/2017.
 */

@RestController
@RequestMapping("/tasks")
public class TaskController implements Serializable{

    @Autowired
    private TaskReporitory reporitory;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Task>> list(){
        return new ResponseEntity<List<Task>>(reporitory.findAll(), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Task> add(@RequestBody Task task){
        reporitory.save(task);
        return new ResponseEntity<Task>(task, HttpStatus.CREATED);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Integer> add(@RequestParam("id") Integer id){
        reporitory.delete(id);
        return new ResponseEntity<Integer>(id, HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity update(@RequestParam("id") Integer id, @RequestBody Task task){
        if(id == null){
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
        task.setId(id);
        reporitory.save(task);
        return new ResponseEntity(task, HttpStatus.OK);
    }
}