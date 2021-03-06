// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.web;

import com.dormitory.domain.DurableArticles;
import com.dormitory.domain.Fine;
import com.dormitory.domain.Room;
import com.dormitory.web.FineController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect FineController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String FineController.create(@Valid Fine fine, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, fine);
            return "fines/create";
        }
        uiModel.asMap().clear();
        fine.persist();
        return "redirect:/fines/" + encodeUrlPathSegment(fine.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String FineController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Fine());
        return "fines/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String FineController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("fine", Fine.findFine(id));
        uiModel.addAttribute("itemId", id);
        return "fines/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String FineController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("fines", Fine.findFineEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Fine.countFines() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("fines", Fine.findAllFines(sortFieldName, sortOrder));
        }
        return "fines/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String FineController.update(@Valid Fine fine, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, fine);
            return "fines/update";
        }
        uiModel.asMap().clear();
        fine.merge();
        return "redirect:/fines/" + encodeUrlPathSegment(fine.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String FineController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Fine.findFine(id));
        return "fines/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String FineController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Fine fine = Fine.findFine(id);
        fine.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/fines";
    }
    
    void FineController.populateEditForm(Model uiModel, Fine fine) {
        uiModel.addAttribute("fine", fine);
        uiModel.addAttribute("durablearticleses", DurableArticles.findAllDurableArticleses());
        uiModel.addAttribute("rooms", Room.findAllRooms());
    }
    
    String FineController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
