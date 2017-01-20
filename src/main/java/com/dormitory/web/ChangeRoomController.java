package com.dormitory.web;
import com.dormitory.domain.ChangeRoom;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/changerooms")
@Controller
@RooWebScaffold(path = "changerooms", formBackingObject = ChangeRoom.class)
public class ChangeRoomController {
}
