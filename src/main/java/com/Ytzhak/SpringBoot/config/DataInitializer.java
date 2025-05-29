package com.Ytzhak.SpringBoot.config;

import com.Ytzhak.SpringBoot.model.*;
import com.Ytzhak.SpringBoot.service.ProjectService;
import com.Ytzhak.SpringBoot.service.TaskService;
import com.Ytzhak.SpringBoot.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(ProjectService projectService, TaskService taskService, UserService userService) {
        return args -> {
            // Crear usuarios
            User user1 = userService.save(new User("Ana García", "ana@example.com"));
            User user2 = userService.save(new User("Luis Torres", "luis@example.com"));

            // Crear proyecto
            Project project = new Project();
            project.setName("Proyecto Alpha");
            project.setDescription("Implementación de módulo A");
            project.setStartDate(LocalDate.of(2024, 6, 1));
            project.setEndDate(LocalDate.of(2024, 8, 31));
            project.setStatus(ProjectStatus.ACTIVO);
            project.setUsers(List.of(user1, user2));
            project = projectService.save(project);

            // Crear tareas
            Task task1 = new Task("Diseñar base de datos", "Modelar las tablas", Priority.ALTA, Status.EN_PROGRESO, LocalDate.of(2024, 7, 1), user1, project);
            Task task2 = new Task("Desarrollar backend", "Construir los servicios REST", Priority.MEDIA, Status.PENDIENTE, LocalDate.of(2024, 7, 10), user2, project);

            taskService.save(task1);
            taskService.save(task2);
        };
    }
}
