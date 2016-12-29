package com.dormitory.web;
import com.dormitory.domain.Color;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/colors")
@Controller
@RooWebScaffold(path = "colors", formBackingObject = Color.class)
public class ColorController {
}
