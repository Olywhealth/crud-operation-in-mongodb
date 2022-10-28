package com.olaoye.springbootsongoDB.repository;

import com.olaoye.springbootsongoDB.enums.Status;
import com.olaoye.springbootsongoDB.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {
    @Query("{status: ?0}")
    List<Task> findTasksByStatus(Status status);
}
