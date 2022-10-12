package tr.tsk.dzkk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.tsk.dzkk.entity.Kisi;

public interface KisiRepository extends JpaRepository<Kisi, Integer> {
	List<Kisi> findByAdiContainsOrderById(String adi);

	List<Kisi> findByBirimAdi(String birimAdi);
}
