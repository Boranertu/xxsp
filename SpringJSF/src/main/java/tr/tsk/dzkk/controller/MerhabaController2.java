package tr.tsk.dzkk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merhaba")
public class MerhabaController2 {
	@GetMapping
	public String merhaba() {
		return "<html><body><font color=red><b>Merhaba2</b></font></body></html>";
	}

	@GetMapping("/p")
	public String getPersoneller() {
		return "personeller";
	}
}
