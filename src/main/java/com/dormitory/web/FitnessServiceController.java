package com.dormitory.web;
import com.dormitory.domain.FitnessService;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/fitnessservices")
@Controller
@RooWebScaffold(path = "fitnessservices", formBackingObject = FitnessService.class)
@RooWebFinder
public class FitnessServiceController {
}
