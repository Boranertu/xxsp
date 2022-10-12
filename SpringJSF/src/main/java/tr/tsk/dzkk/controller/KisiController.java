package tr.tsk.dzkk.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import tr.tsk.dzkk.entity.Kisi;
import tr.tsk.dzkk.service.KisiService;

@Controller
@ManagedBean
public class KisiController {
	@Inject
	private KisiService kisiService;

	@GetMapping("/kisiler")
	public ModelAndView getKisiler() {
		List<Kisi> kisiler = kisiService.getTumKisiler();
		ModelAndView sonuc = new ModelAndView("/kisiler.xhtml");
		sonuc.addObject("liste", kisiler);
		return sonuc;
	}

	public String getTest() {
		return "deneme";
	}
}
