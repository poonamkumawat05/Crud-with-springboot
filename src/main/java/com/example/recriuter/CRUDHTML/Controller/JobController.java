package com.example.recriuter.CRUDHTML.Controller;

import com.example.recriuter.CRUDHTML.Entity.JOBS;
import com.example.recriuter.CRUDHTML.Service.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller

public class JobController {
    @Autowired
    private JobServiceImpl service;


    @GetMapping("/")

    public String viewHomePage(Model model) {

        model.addAttribute("allemplist", service.getAllJOBS());

        return "index";

    }


    @GetMapping("/addnew")

    public String addNewJOBS(Model model) {

        JOBS form = new JOBS();

        model.addAttribute("form", form);

        return "newemployee";

    }


    @PostMapping("/save")

    public String saveJOBS(@ModelAttribute("form") JOBS form) {

        service.save(form);

        return "redirect:/";

    }


    @GetMapping("/showFormForUpdate/{id}")

    public String updateForm(@PathVariable(value = "id") int id, Model model) {

        JOBS form = service.getById(id);

        model.addAttribute("form", form);

        return "update";

    }


    @GetMapping("/deleteJOBS/{id}")

    public String deleteThroughId(@PathVariable(value = "id") int id) {

        service.deleteViaId(id);

        return "redirect:/";

    }
}


