package com.bugtracker.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Project> projects;
    private List<ProjectUser> users;
    private List<ProjectUserRole> roles;

    public Company(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
        this.users = new ArrayList<>();
        this.roles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        this.projects = projects;
    }

    public List<ProjectUser> getUsers() {
        return users;
    }

    public void setUsers(List<ProjectUser> users) {
        this.users = users;
    }

    public void addUser(ProjectUser user) {
        this.users.add(user);
    }

    public List<ProjectUserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<ProjectUserRole> roles) {
        this.roles = roles;
    }


}
