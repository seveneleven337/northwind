package fi.vamk.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Strings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int string_id;
	
	private String string_data;
}
