package com.itvdn.controller;

import com.itvdn.model.Task;
import com.itvdn.model.ToDoList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MainController {

    @GetMapping(value = "/")
    public ModelAndView startMain(@ModelAttribute("size") Integer integer, ModelAndView modelAndView) {
        modelAndView.addObject("size", "");
        modelAndView.setViewName("forward:index.jsp");
        return modelAndView;
    }



    @GetMapping(value = "/view-all")
    public ModelAndView viewAll(ModelAndView modelAndView) {
        modelAndView.addObject("tasks", ToDoList.getInstance().getTaskList());
        modelAndView.setViewName("forward:summary.jsp");
        return modelAndView;
    }

    @PostMapping(value = "/add-task")
    public ModelAndView addTask(@ModelAttribute("addTask") Task addTask, ModelAndView modelAndView) {
        modelAndView.addObject("addTask", addTask);
        ToDoList taskList = ToDoList.getInstance();
        taskList.addTask(addTask);
        modelAndView.setViewName("forward:added.jsp");
        System.out.println("Task " + addTask.getTask() + addTask.getTime());
        return modelAndView;
    }

    @GetMapping(value = "/back-to-main")
    public ModelAndView backToMain(@ModelAttribute("taskList") ToDoList taskList, ModelAndView modelAndView) {
        modelAndView.addObject("taskList", ToDoList.getInstance());
        modelAndView.setViewName("forward:/");
        ToDoList.getInstance().getTaskList().forEach(System.out::println);
        System.out.println("size: " + ToDoList.getInstance().getTaskList().size());
        modelAndView.addObject("size", "Number of tasks : "
                + ToDoList.getInstance().getTaskList().size());
        return modelAndView;
    }
}
