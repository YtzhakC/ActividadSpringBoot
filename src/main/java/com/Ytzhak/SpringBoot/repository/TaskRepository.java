package com.Ytzhak.SpringBoot.repository;

import com.Ytzhak.SpringBoot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
