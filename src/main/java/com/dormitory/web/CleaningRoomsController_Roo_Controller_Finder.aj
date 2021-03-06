// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.web;

import com.dormitory.domain.CleaningRooms;
import com.dormitory.domain.Customer;
import com.dormitory.web.CleaningRoomsController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect CleaningRoomsController_Roo_Controller_Finder {
    
    @RequestMapping(params = { "find=ByNameEquals", "form" }, method = RequestMethod.GET)
    public String CleaningRoomsController.findCleaningRoomsesByNameEqualsForm(Model uiModel) {
        uiModel.addAttribute("customers", Customer.findAllCustomers());
        return "cleaningroomses/findCleaningRoomsesByNameEquals";
    }
    
    @RequestMapping(params = "find=ByNameEquals", method = RequestMethod.GET)
    public String CleaningRoomsController.findCleaningRoomsesByNameEquals(@RequestParam("name") Customer name, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("cleaningroomses", CleaningRooms.findCleaningRoomsesByNameEquals(name, sortFieldName, sortOrder).setFirstResult(firstResult).setMaxResults(sizeNo).getResultList());
            float nrOfPages = (float) CleaningRooms.countFindCleaningRoomsesByNameEquals(name) / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("cleaningroomses", CleaningRooms.findCleaningRoomsesByNameEquals(name, sortFieldName, sortOrder).getResultList());
        }
        addDateTimeFormatPatterns(uiModel);
        return "cleaningroomses/list";
    }
    
}
