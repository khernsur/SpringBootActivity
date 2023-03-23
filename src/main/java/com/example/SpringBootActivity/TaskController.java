package com.example.SpringBootActivity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private  TaskService taskService;



    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listTask",taskService.getAllTask());
        return "index";
    }

    @GetMapping("/showNewTask")
    public String showNewTask(Model model){
        Task task = new Task();
        model.addAttribute("task",task);
        return "new_task";
    }

    @PostMapping("/saveTask")
   public String saveTask(@ModelAttribute("task")Task task){
        taskService.saveTask(task);
        return "redirect:/";
    }

    @GetMapping("/showTaskForUpdate/{id}")
    public String showTaskForUpdate(@PathVariable(value ="id") long id, Model model) {
        Task task = taskService.getTaskById(id);
        model.addAttribute("task",task);
        return "update_task";
    }

    @GetMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable(value = "id") long id){
        this.taskService.deleteTaskById(id);
        return "redirect:/";
    }

}
