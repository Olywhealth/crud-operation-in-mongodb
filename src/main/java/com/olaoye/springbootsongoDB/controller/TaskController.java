package com.olaoye.springbootsongoDB.controller;

import com.olaoye.springbootsongoDB.dto.TaskDto;
import com.olaoye.springbootsongoDB.model.Task;
import com.olaoye.springbootsongoDB.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;
    //Note field injection is not recommended.

    @PostMapping("create")
    public Task createTask(@RequestBody TaskDto taskDto) {
        return taskService.addTask(taskDto);
    }

    @GetMapping("all-tasks")
    public List<Task> getTasks() {
        return taskService.findAllTask();
    }

    @GetMapping("{taskId}")
    public  Task getTaskById(@PathVariable String taskId) {
        return taskService.findTaskById(taskId);
    }

    @PutMapping("{taskId}")
    public Task updateTask(@PathVariable String taskId) {
        return taskService.moveTask(taskId);
    }

    @DeleteMapping("{taskId}/delete")
    public String deleteTask(@PathVariable String taskId) {
        return taskService.deleteTask(taskId);
    }
}
