package com.bugtracker.model.domain;

import java.util.List;

public class ProjectUser {
    private String firstName;
    private String lastName;
    private String email;
    private ProjectUserRole role;
    private String password;
    //TO DO: Add social network identities
    private List<Ticket> tickets;
}
