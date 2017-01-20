package com.dormitory.web;
import com.dormitory.domain.Fine;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/fines")
@Controller
@RooWebScaffold(path = "fines", formBackingObject = Fine.class)
public class FineController {
}
