package com.itvdn.model;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Data
public class ToDoList {

    @Getter
    ArrayList<Task> taskList = new ArrayList<>();
    private static ToDoList instance;

    public void addTask(Task task) {
        this.taskList.add(task);
    }


    public static ToDoList getInstance() {
        if (instance == null) {
            instance = new ToDoList();
        }
        return instance;
    }

}
