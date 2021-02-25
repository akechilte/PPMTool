package io.mbiswas.ppmtool.services;

import io.mbiswas.ppmtool.domain.Project;
import io.mbiswas.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mbiswas on 2/17/21.
 */
@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        // Logic
        return projectRepository.save(project);
    }
}
