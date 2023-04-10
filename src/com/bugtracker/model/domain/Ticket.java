package com.bugtracker.model.domain;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private String title;
    private ProjectUser submitter;
    private List<ProjectUser> assignedTo;
    private TicketStatus status;
    private LocalDateTime created;
    private LocalDateTime updated;
    private TicketPriority priority;
    private TicketType type;

    private List<TicketHistory> history;
    private List<TicketComment> comments;
    private List<TicketAttachment> attachments;

    public Ticket() {}
    public Ticket(String title, ProjectUser submitter, TicketStatus status, LocalDateTime created, TicketPriority priority, TicketType type) {
        this.title = title;
        this.submitter = submitter;
        this.status = status;
        this.created = created;
        this.priority = priority;
        this.type = type;
        this.assignedTo = new ArrayList<>();
        this.history = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.attachments = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProjectUser getSubmitter() {
        return submitter;
    }

    public void setSubmitter(ProjectUser submitter) {
        this.submitter = submitter;
    }

    public List<ProjectUser> getAssignedTo() {
        return assignedTo;
    }

    public void addAssignedTo(ProjectUser assignedTo) {
        this.assignedTo.add(assignedTo);
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public TicketPriority getPriority() {
        return priority;
    }

    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public List<TicketHistory> getHistory() {
        return history;
    }

    public void addTicketHistoryHistory(TicketHistory ticketHistory) {
        this.history.add(ticketHistory);
    }

    public void addTicketHistoriesHistories(List<TicketHistory> ticketHistory) {
        this.history.addAll(ticketHistory);
    }

    public List<TicketComment> getComments() {
        return comments;
    }

    public void setComments(List<TicketComment> comments) {
        this.comments = comments;
    }

    public void addComment(TicketComment comment) {
        this.comments.add(comment);
    }

    public List<TicketAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<TicketAttachment> attachments) {
        this.attachments = attachments;
    }

    public void addAttachment(TicketAttachment attachment) {
        this.attachments.add(attachment);
    }

    //TO DO: update ticket fn

}
