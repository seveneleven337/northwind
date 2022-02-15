package fi.vamk.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(indexes = {
		@Index(columnList = "id"),
		//@Index(columnList = "company"),	
})
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String invoice_date;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String due_date;
	
	private double tax;
	
	private double shipping;
	
	private double amount_due;
	
	@OneToOne
	private Orders orders;
}
