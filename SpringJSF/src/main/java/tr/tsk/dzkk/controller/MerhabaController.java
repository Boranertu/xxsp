package tr.tsk.dzkk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MerhabaController {
	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ResponseBody
	public String merhaba() {
		return "<html><body><font color=red><b>Merhaba</b></font></body></html>";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/p")
	public String getPersoneller() {
		// bu metoddan geriye dönen değer için
		// ne döndürüleceği bulunamadığından hata veriyor.

		return "personeller";
	}

	@GetMapping("/jsf")
	public String jsfTest() {
		return "/ornek.xhtml";
	}
}
