package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import projects.dao.ProjectDao;
import projects.entity.Project;
import projects.exception.DbException;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() ->
		new NoSuchElementException("Project with project ID="+projectId+" Does not exist."));
	}

	public void modifyDetails(Project project) {
		if(!projectDao.modifyDetails(project)) {
			throw new DbException("Project with project ID="+project.getProjectId()+" Does not exist.");
		}
	}

	public void deleteProject(Integer deleteId) {
		if(!projectDao.deleteProject(deleteId)) {
			throw new DbException("Project with project ID="+deleteId+" Does not exist.");
		}
	}
} 
