package com.Ytzhak.SpringBoot.service.impl;

import com.Ytzhak.SpringBoot.model.Project;
import com.Ytzhak.SpringBoot.repository.ProjectRepository;
import com.Ytzhak.SpringBoot.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project findById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }
}
