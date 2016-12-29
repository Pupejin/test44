package com.dormitory.web;
import com.domitory.domain.Maintenances;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/maintenanceses")
@Controller
@RooWebScaffold(path = "maintenanceses", formBackingObject = Maintenances.class)
public class MaintenancesController {
}
