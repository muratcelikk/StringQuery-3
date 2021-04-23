package com.cal.pro;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("data", dataResult());
		return "home";
	}

	public ArrayList<String> dataResult() { // dönen deðerinin türü dataResult metodunun türü olur.(önemli)

		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Künefe");
		ls.add("Kadayif");
		ls.add("Sütlü Nüriye");
		ls.add("Vezir Parmagi");

		return ls;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String fncHomePost(Model model, @RequestParam String mail, @RequestParam String password) {
		if (mail.equals("")) {
			model.addAttribute("fail", "Lütfen mail adresi giriniz! ");
		} else if (password.equals("")) {
			model.addAttribute("fail", "Lütfen Şifrenizi giriniz!  ");
		} else {
			if (mail.equals("murat@gmail.com") && password.equals("12345")) {
				return "redirect:/detail/murat@gmail.com";
			} else {
				model.addAttribute("fail", "Kullanıcı adı yada Şifre hatalı!! ");
			}
		}
		return "home";
	}
}
