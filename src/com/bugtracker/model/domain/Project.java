package com.bugtracker.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String description;
    private List<ProjectUser> users;
    private List<Ticket> tickets;

    public Project(String name) {
        this.users = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
}
