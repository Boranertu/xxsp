package tr.tsk.dzkk.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(exclude = "birim")
@ToString(exclude = "birim")
public class Kisi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adi;
	private String eposta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "birim_id")
	private Birim birim;

}
