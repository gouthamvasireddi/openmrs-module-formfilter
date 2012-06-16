package org.openmrs.module.formfilter.web.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.FormService;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EditFormFilterController  {

	protected final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/module/formfilter/editformfilter", method = RequestMethod.GET)
	public void editFormFilter(ModelMap model,@RequestParam("formId") Integer formId) {
		System.out.println("\n\n============form id :"+formId);
		FormService formService = Context.getFormService();
		model.addAttribute("form",formService.getForm(formId));
		
		
	}
	
	
	

	
}