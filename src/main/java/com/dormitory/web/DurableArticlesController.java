package com.dormitory.web;
import com.dormitory.domain.DurableArticles;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/durablearticleses")
@Controller
@RooWebScaffold(path = "durablearticleses", formBackingObject = DurableArticles.class)
public class DurableArticlesController {
}
