package com.dormitory.web;
import com.dormitory.domain.Trainer;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/trainers")
@Controller
@RooWebScaffold(path = "trainers", formBackingObject = Trainer.class)
public class TrainerController {
}
