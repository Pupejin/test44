package com.dormitory.web;
import com.dormitory.domain.Inform;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/informs")
@Controller
@RooWebScaffold(path = "informs", formBackingObject = Inform.class)
@RooWebFinder
public class InformController {
}
