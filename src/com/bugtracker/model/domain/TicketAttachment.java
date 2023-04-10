package com.bugtracker.model.domain;

import javax.swing.*;
import java.time.LocalDateTime;

public class TicketAttachment {
    private String name;
    private ProjectUser uploader;
    private String note;
    private LocalDateTime created;
}
