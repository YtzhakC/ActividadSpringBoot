package com.Ytzhak.SpringBoot.service;

import com.Ytzhak.SpringBoot.model.Project;
import java.util.List;

public interface ProjectService {
    Project save(Project project);
    List<Project> findAll();
    Project findById(Long id);
    void deleteById(Long id);
}
