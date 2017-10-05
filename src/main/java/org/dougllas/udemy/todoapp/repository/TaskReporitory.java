package org.dougllas.udemy.todoapp.repository;

import org.dougllas.udemy.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Criado por dougllas.sousa em 03/10/2017.
 */
public interface TaskReporitory extends JpaRepository<Task, Integer>, JpaSpecificationExecutor<Task>, CrudRepository<Task, Integer> {
}
