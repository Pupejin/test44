package com.dormitory.web;
import com.dormitory.domain.ReceiveParcelPost;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/receiveparcelposts")
@Controller
@RooWebScaffold(path = "receiveparcelposts", formBackingObject = ReceiveParcelPost.class)
@RooWebFinder
public class ReceiveParcelPostController {
}
