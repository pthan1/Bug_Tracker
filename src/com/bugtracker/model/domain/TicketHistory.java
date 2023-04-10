package com.bugtracker.model.domain;

import java.time.LocalDateTime;

//for history tracking
public class TicketHistory {
    private String objectChanged;
    private String oldValue;
    private String newValue;
    private LocalDateTime changedAt;

    public TicketHistory(String objectChanged, String oldValue, String newValue, LocalDateTime changedAt) {
        this.objectChanged = objectChanged;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.changedAt = changedAt;
    }

    public String getObjectChanged() {
        return objectChanged;
    }

    public void setObjectChanged(String objectChanged) {
        this.objectChanged = objectChanged;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public LocalDateTime getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(LocalDateTime changedAt) {
        this.changedAt = changedAt;
    }
}
