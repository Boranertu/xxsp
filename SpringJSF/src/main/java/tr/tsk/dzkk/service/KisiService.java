package tr.tsk.dzkk.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import tr.tsk.dzkk.entity.Kisi;
import tr.tsk.dzkk.repository.KisiRepository;

@Named
public class KisiService {
	@Inject
	private KisiRepository kisiRepository;

	public List<Kisi> getTumKisiler() {
		return kisiRepository.findAll();
	}

	public List<Kisi> getKisiler(String isim) {
		return kisiRepository.findByAdiContainsOrderById(isim);
	}

	public Optional<Kisi> getKisi(int id) {
		return kisiRepository.findById(id);
	}

	public List<Kisi> getKisilerByBirimAdi(String birimAdi) {
		return kisiRepository.findByBirimAdi(birimAdi);
	}
}
