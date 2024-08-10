package com.frameworks.projects.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworks.projects.model.Task;
import com.frameworks.projects.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService 
{
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() 
    {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getTaskById(Long id) 
    {
        return taskRepository.findById(id);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task task) 
    {
        if (taskRepository.existsById(id)) 
        {
            task.setId(id);
            return taskRepository.save(task);
        }
        return null;
    }

    @Override
    public void deleteTask(Long id) 
    {
        taskRepository.deleteById(id);
    }
}
