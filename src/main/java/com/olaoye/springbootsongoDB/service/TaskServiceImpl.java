package com.olaoye.springbootsongoDB.service;

import com.olaoye.springbootsongoDB.dto.TaskDto;
import com.olaoye.springbootsongoDB.enums.Status;
import com.olaoye.springbootsongoDB.model.Task;
import com.olaoye.springbootsongoDB.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository repository;


    @Override
    public Task addTask(TaskDto taskDto){
        Task newTask = new Task();
        newTask.setTaskId(UUID.randomUUID().toString().split("-")[0]);
        newTask.setDescription(taskDto.getDescription());
        newTask.setStatus(Status.AWAITING);
        return repository.save(newTask);
    }

    @Override
    public List<Task> findAllTask(){
        return repository.findAll();
    }

    @Override
    public  Task findTaskById(String taskId){
        return repository.findById(taskId).orElseThrow();
    }
}
