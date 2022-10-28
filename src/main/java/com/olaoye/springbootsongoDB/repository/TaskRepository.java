package com.olaoye.springbootsongoDB.repository;

import com.olaoye.springbootsongoDB.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
