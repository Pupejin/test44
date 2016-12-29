package com.dormitory.web;
import com.dormitory.domain.LeaseAgreement;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/leaseagreements")
@Controller
@RooWebScaffold(path = "leaseagreements", formBackingObject = LeaseAgreement.class)
@RooWebFinder
public class LeaseAgreementController {
}
