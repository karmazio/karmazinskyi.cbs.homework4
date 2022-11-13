package com.itvdn.model;

import lombok.Data;

@Data
public class Task {
    private String task;
    private String time;

    public Task(String task, String time) {
        this.task = task;
        this.time = time;
    }

    public Task(){

    }

    public String getTask() {
        return task;
    }

    public String getTime() {
        return time;
    }
}
