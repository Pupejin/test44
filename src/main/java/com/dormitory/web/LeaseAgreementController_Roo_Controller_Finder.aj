// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.web;

import com.dormitory.domain.LeaseAgreement;
import com.dormitory.domain.Room;
import com.dormitory.web.LeaseAgreementController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect LeaseAgreementController_Roo_Controller_Finder {
    
    @RequestMapping(params = { "find=ByRoomnumber", "form" }, method = RequestMethod.GET)
    public String LeaseAgreementController.findLeaseAgreementsByRoomnumberForm(Model uiModel) {
        uiModel.addAttribute("rooms", Room.findAllRooms());
        return "leaseagreements/findLeaseAgreementsByRoomnumber";
    }
    
    @RequestMapping(params = "find=ByRoomnumber", method = RequestMethod.GET)
    public String LeaseAgreementController.findLeaseAgreementsByRoomnumber(@RequestParam("roomnumber") Room roomnumber, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("leaseagreements", LeaseAgreement.findLeaseAgreementsByRoomnumber(roomnumber, sortFieldName, sortOrder).setFirstResult(firstResult).setMaxResults(sizeNo).getResultList());
            float nrOfPages = (float) LeaseAgreement.countFindLeaseAgreementsByRoomnumber(roomnumber) / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("leaseagreements", LeaseAgreement.findLeaseAgreementsByRoomnumber(roomnumber, sortFieldName, sortOrder).getResultList());
        }
        addDateTimeFormatPatterns(uiModel);
        return "leaseagreements/list";
    }
    
}
