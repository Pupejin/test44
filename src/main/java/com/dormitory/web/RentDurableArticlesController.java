package com.dormitory.web;
import com.dormitory.domain.RentDurableArticles;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/rentdurablearticleses")
@Controller
@RooWebScaffold(path = "rentdurablearticleses", formBackingObject = RentDurableArticles.class)
@RooWebFinder
public class RentDurableArticlesController {
}
