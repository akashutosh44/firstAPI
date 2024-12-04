package com.example.firstAPI.Entity;

import java.time.LocalDateTime;

public class ErrorClass {
    private int status;
    private String trace;
    private LocalDateTime timeStamp;

    public ErrorClass(int status, String trace) {
        this.status = status;
        this.trace = trace;
        this.timeStamp = LocalDateTime.now();
    }

    public int getStatus() {
        return status;
    }

    public String getTrace() {
        return trace;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
