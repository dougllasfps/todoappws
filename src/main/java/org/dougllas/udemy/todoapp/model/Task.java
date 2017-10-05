package org.dougllas.udemy.todoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Criado por dougllas.sousa em 03/10/2017.
 */

@Entity
public class Task implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    private Boolean done;

    private LocalDate createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (getId() != null ? !getId().equals(task.getId()) : task.getId() != null) return false;
        if (getDescription() != null ? !getDescription().equals(task.getDescription()) : task.getDescription() != null)
            return false;
        if (getDone() != null ? !getDone().equals(task.getDone()) : task.getDone() != null) return false;
        return getCreatedAt() != null ? getCreatedAt().equals(task.getCreatedAt()) : task.getCreatedAt() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getDone() != null ? getDone().hashCode() : 0);
        result = 31 * result + (getCreatedAt() != null ? getCreatedAt().hashCode() : 0);
        return result;
    }
}