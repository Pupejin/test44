package com.dormitory.web;
import com.dormitory.domain.PackageName;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/packagenames")
@Controller
@RooWebScaffold(path = "packagenames", formBackingObject = PackageName.class)
public class PackageNameController {
}
