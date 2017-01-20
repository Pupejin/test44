package com.dormitory.web;
import com.dormitory.domain.FitnessPackages;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/fitnesspackageses")
@Controller
@RooWebScaffold(path = "fitnesspackageses", formBackingObject = FitnessPackages.class)
public class FitnessPackagesController {
}
