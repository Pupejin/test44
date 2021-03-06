// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.web;

import com.dormitory.domain.PackageName;
import com.dormitory.web.PackageNameController;
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

privileged aspect PackageNameController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String PackageNameController.create(@Valid PackageName packageName, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, packageName);
            return "packagenames/create";
        }
        uiModel.asMap().clear();
        packageName.persist();
        return "redirect:/packagenames/" + encodeUrlPathSegment(packageName.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String PackageNameController.createForm(Model uiModel) {
        populateEditForm(uiModel, new PackageName());
        return "packagenames/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String PackageNameController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("packagename", PackageName.findPackageName(id));
        uiModel.addAttribute("itemId", id);
        return "packagenames/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String PackageNameController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("packagenames", PackageName.findPackageNameEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) PackageName.countPackageNames() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("packagenames", PackageName.findAllPackageNames(sortFieldName, sortOrder));
        }
        return "packagenames/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String PackageNameController.update(@Valid PackageName packageName, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, packageName);
            return "packagenames/update";
        }
        uiModel.asMap().clear();
        packageName.merge();
        return "redirect:/packagenames/" + encodeUrlPathSegment(packageName.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String PackageNameController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, PackageName.findPackageName(id));
        return "packagenames/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String PackageNameController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        PackageName packageName = PackageName.findPackageName(id);
        packageName.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/packagenames";
    }
    
    void PackageNameController.populateEditForm(Model uiModel, PackageName packageName) {
        uiModel.addAttribute("packageName", packageName);
    }
    
    String PackageNameController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
