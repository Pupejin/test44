package com.dormitory.web;
import com.dormitory.domain.Maintenance;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/maintenances")
@Controller
@RooWebScaffold(path = "maintenances", formBackingObject = Maintenance.class)
@RooWebFinder
public class MaintenanceController {
}
