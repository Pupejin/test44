package com.dormitory.web;
import com.dormitory.domain.Roomtype;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/roomtypes")
@Controller
@RooWebScaffold(path = "roomtypes", formBackingObject = Roomtype.class)
public class RoomtypeController {
}
