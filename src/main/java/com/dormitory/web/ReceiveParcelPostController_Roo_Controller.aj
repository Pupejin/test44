// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.web;

import com.dormitory.domain.Customer;
import com.dormitory.domain.ReceiveParcelPost;
import com.dormitory.domain.Room;
import com.dormitory.web.ReceiveParcelPostController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect ReceiveParcelPostController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String ReceiveParcelPostController.create(@Valid ReceiveParcelPost receiveParcelPost, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, receiveParcelPost);
            return "receiveparcelposts/create";
        }
        uiModel.asMap().clear();
        receiveParcelPost.persist();
        return "redirect:/receiveparcelposts/" + encodeUrlPathSegment(receiveParcelPost.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String ReceiveParcelPostController.createForm(Model uiModel) {
        populateEditForm(uiModel, new ReceiveParcelPost());
        return "receiveparcelposts/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String ReceiveParcelPostController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("receiveparcelpost", ReceiveParcelPost.findReceiveParcelPost(id));
        uiModel.addAttribute("itemId", id);
        return "receiveparcelposts/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String ReceiveParcelPostController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("receiveparcelposts", ReceiveParcelPost.findReceiveParcelPostEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) ReceiveParcelPost.countReceiveParcelPosts() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("receiveparcelposts", ReceiveParcelPost.findAllReceiveParcelPosts(sortFieldName, sortOrder));
        }
        addDateTimeFormatPatterns(uiModel);
        return "receiveparcelposts/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String ReceiveParcelPostController.update(@Valid ReceiveParcelPost receiveParcelPost, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, receiveParcelPost);
            return "receiveparcelposts/update";
        }
        uiModel.asMap().clear();
        receiveParcelPost.merge();
        return "redirect:/receiveparcelposts/" + encodeUrlPathSegment(receiveParcelPost.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String ReceiveParcelPostController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, ReceiveParcelPost.findReceiveParcelPost(id));
        return "receiveparcelposts/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String ReceiveParcelPostController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        ReceiveParcelPost receiveParcelPost = ReceiveParcelPost.findReceiveParcelPost(id);
        receiveParcelPost.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/receiveparcelposts";
    }
    
    void ReceiveParcelPostController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("receiveParcelPost_receiveparcelpostdate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    void ReceiveParcelPostController.populateEditForm(Model uiModel, ReceiveParcelPost receiveParcelPost) {
        uiModel.addAttribute("receiveParcelPost", receiveParcelPost);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("customers", Customer.findAllCustomers());
        uiModel.addAttribute("rooms", Room.findAllRooms());
    }
    
    String ReceiveParcelPostController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
