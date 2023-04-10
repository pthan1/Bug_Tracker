package com.bugtracker.model.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class TicketComment {
    private String message;
    private ProjectUser commenter;
    private LocalDateTime created;

    public TicketComment(String text, String author) {
    }
}
