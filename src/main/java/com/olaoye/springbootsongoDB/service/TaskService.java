package com.olaoye.springbootsongoDB.service;

import com.olaoye.springbootsongoDB.dto.TaskDto;
import com.olaoye.springbootsongoDB.model.Task;

import java.util.List;

public interface TaskService {
    Task addTask(TaskDto taskDto);

    List<Task> findAllTask();

    Task findTaskById(String taskId);
}
