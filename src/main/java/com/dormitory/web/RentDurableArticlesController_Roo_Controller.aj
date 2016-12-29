// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.web;

import com.dormitory.domain.DurableArticles;
import com.dormitory.domain.RentDurableArticles;
import com.dormitory.domain.Room;
import com.dormitory.web.RentDurableArticlesController;
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

privileged aspect RentDurableArticlesController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String RentDurableArticlesController.create(@Valid RentDurableArticles rentDurableArticles, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, rentDurableArticles);
            return "rentdurablearticleses/create";
        }
        uiModel.asMap().clear();
        rentDurableArticles.persist();
        return "redirect:/rentdurablearticleses/" + encodeUrlPathSegment(rentDurableArticles.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String RentDurableArticlesController.createForm(Model uiModel) {
        populateEditForm(uiModel, new RentDurableArticles());
        return "rentdurablearticleses/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String RentDurableArticlesController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("rentdurablearticles", RentDurableArticles.findRentDurableArticles(id));
        uiModel.addAttribute("itemId", id);
        return "rentdurablearticleses/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String RentDurableArticlesController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("rentdurablearticleses", RentDurableArticles.findRentDurableArticlesEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) RentDurableArticles.countRentDurableArticleses() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("rentdurablearticleses", RentDurableArticles.findAllRentDurableArticleses(sortFieldName, sortOrder));
        }
        addDateTimeFormatPatterns(uiModel);
        return "rentdurablearticleses/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String RentDurableArticlesController.update(@Valid RentDurableArticles rentDurableArticles, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, rentDurableArticles);
            return "rentdurablearticleses/update";
        }
        uiModel.asMap().clear();
        rentDurableArticles.merge();
        return "redirect:/rentdurablearticleses/" + encodeUrlPathSegment(rentDurableArticles.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String RentDurableArticlesController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, RentDurableArticles.findRentDurableArticles(id));
        return "rentdurablearticleses/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String RentDurableArticlesController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        RentDurableArticles rentDurableArticles = RentDurableArticles.findRentDurableArticles(id);
        rentDurableArticles.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/rentdurablearticleses";
    }
    
    void RentDurableArticlesController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("rentDurableArticles_durablearticlesdate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    void RentDurableArticlesController.populateEditForm(Model uiModel, RentDurableArticles rentDurableArticles) {
        uiModel.addAttribute("rentDurableArticles", rentDurableArticles);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("durablearticleses", DurableArticles.findAllDurableArticleses());
        uiModel.addAttribute("rooms", Room.findAllRooms());
    }
    
    String RentDurableArticlesController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
