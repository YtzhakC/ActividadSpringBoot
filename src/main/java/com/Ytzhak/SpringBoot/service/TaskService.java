package com.Ytzhak.SpringBoot.service;

import com.Ytzhak.SpringBoot.model.Task;
import java.util.List;

public interface TaskService {
    Task save(Task task);
    List<Task> findAll();
    Task findById(Long id);
    void deleteById(Long id);
}
