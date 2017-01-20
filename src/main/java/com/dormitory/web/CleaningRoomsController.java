package com.dormitory.web;
import com.dormitory.domain.CleaningRooms;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/cleaningroomses")
@Controller
@RooWebScaffold(path = "cleaningroomses", formBackingObject = CleaningRooms.class)
@RooWebFinder
public class CleaningRoomsController {
}
