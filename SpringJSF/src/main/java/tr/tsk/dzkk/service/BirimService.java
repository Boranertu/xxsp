package tr.tsk.dzkk.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import tr.tsk.dzkk.entity.Birim;
import tr.tsk.dzkk.repository.BirimRepository;

@Named
public class BirimService {
	@Inject
	private BirimRepository birimRepository;

	// spring jpa method name join
	public List<Birim> getBirimlerByKisiAdi(String adi) {
		return birimRepository.findByKisilerAdiContains(adi);
	}

	// jpql join
	public List<Birim> getBirimlerByKisiAdi2(String adi) {
		return birimRepository.getBirimler(adi);
	}

	// native query
	public List<Birim> getBirimlerByKisiAdi3(String adi) {
		return birimRepository.getBirimler2(adi);
	}
}
