package tr.tsk.dzkk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tr.tsk.dzkk.entity.Birim;

public interface BirimRepository extends JpaRepository<Birim, Integer> {
	List<Birim> findByKisilerAdiContains(String adi);

	@Query("select b from Birim b left join b.kisiler k where k.adi like %:kAdi%")
	List<Birim> getBirimler(@Param("kAdi") String kisiAdi);

	@Query(value = "select b.* from xxsp.birim b left join xxsp.kisi k on k.birim_id = b.id where k.adi like %:kAdi%", nativeQuery = true)
	List<Birim> getBirimler2(@Param("kAdi") String kisiAdi);
}
