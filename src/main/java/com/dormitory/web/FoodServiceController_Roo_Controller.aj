// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.web;

import com.dormitory.domain.Customer;
import com.dormitory.domain.FoodService;
import com.dormitory.domain.Room;
import com.dormitory.web.FoodServiceController;
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

privileged aspect FoodServiceController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String FoodServiceController.create(@Valid FoodService foodService, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, foodService);
            return "foodservices/create";
        }
        uiModel.asMap().clear();
        foodService.persist();
        return "redirect:/foodservices/" + encodeUrlPathSegment(foodService.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String FoodServiceController.createForm(Model uiModel) {
        populateEditForm(uiModel, new FoodService());
        return "foodservices/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String FoodServiceController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("foodservice", FoodService.findFoodService(id));
        uiModel.addAttribute("itemId", id);
        return "foodservices/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String FoodServiceController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("foodservices", FoodService.findFoodServiceEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) FoodService.countFoodServices() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("foodservices", FoodService.findAllFoodServices(sortFieldName, sortOrder));
        }
        addDateTimeFormatPatterns(uiModel);
        return "foodservices/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String FoodServiceController.update(@Valid FoodService foodService, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, foodService);
            return "foodservices/update";
        }
        uiModel.asMap().clear();
        foodService.merge();
        return "redirect:/foodservices/" + encodeUrlPathSegment(foodService.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String FoodServiceController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, FoodService.findFoodService(id));
        return "foodservices/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String FoodServiceController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        FoodService foodService = FoodService.findFoodService(id);
        foodService.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/foodservices";
    }
    
    void FoodServiceController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("foodService_days_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    void FoodServiceController.populateEditForm(Model uiModel, FoodService foodService) {
        uiModel.addAttribute("foodService", foodService);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("customers", Customer.findAllCustomers());
        uiModel.addAttribute("rooms", Room.findAllRooms());
    }
    
    String FoodServiceController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
