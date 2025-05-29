package com.Ytzhak.SpringBoot.repository;

import com.Ytzhak.SpringBoot.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
