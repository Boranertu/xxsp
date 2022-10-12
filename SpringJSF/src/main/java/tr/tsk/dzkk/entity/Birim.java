package tr.tsk.dzkk.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(exclude = "kisiler")
@ToString(exclude = "kisiler")
public class Birim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adi;
	@OneToMany(mappedBy = "birim")
	private Set<Kisi> kisiler;

}
