package com.restful.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restful.restful.model.Task;

/**
 * TaskRepository is an interface that extends JpaRepository to provide CRUD operations for Task entities.
 * 
 * <p>JpaRepository is a JPA (Java Persistence API) specific extension of the Repository interface. 
 * It provides JPA related methods such as flushing the persistence context and delete records in a batch.
 * 
 * <p>CrudRepository is a part of the Spring Data Commons project and provides generic CRUD operation methods 
 * such as save, findAll, findById, and delete. JpaRepository extends CrudRepository and adds JPA-specific methods.
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * @see org.springframework.data.repository.CrudRepository
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}