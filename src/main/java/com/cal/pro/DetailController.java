package com.cal.pro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Murat Çelik 02:47:34 18 Nis 2021
 *
 */
@Controller
public class DetailController {
	
	@RequestMapping(value = "/detail/{param}", method = RequestMethod.GET)
	public String fncDetail(@PathVariable String param, Model model) {
		System.out.println("p: "+ param);
		model.addAttribute("title", param);
		return "detail";
	}
}
