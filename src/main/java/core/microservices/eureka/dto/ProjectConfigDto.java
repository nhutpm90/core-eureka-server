package core.microservices.eureka.dto;

import core.microservices.eureka.ProjectConfig;

public class ProjectConfigDto extends ProjectConfig {

	public ProjectConfigDto(ProjectConfig projectConfig) {
		this.setTitle(projectConfig.getTitle());
		this.setLastUpdated(projectConfig.getLastUpdated());
		this.setContacts(projectConfig.getContacts());
		this.setPhones(projectConfig.getPhones());
	}
}
