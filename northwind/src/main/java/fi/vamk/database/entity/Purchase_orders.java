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
@Table(indexes = @Index(columnList = "id"))
public class Purchase_orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private Suppliers supplier;

	@OneToOne
	private Employees employees;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String submitted_date;

	@Column(length = 512, columnDefinition="DATETIME")
	private String creation_date;
	
	@OneToOne
	private Purchase_order_status status;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String expected_date;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double shipping_fee;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double taxes;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String payment_date;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double payment_amount;
	
	private String payment_method;
	
	@Column(length = 512, columnDefinition="LONGTEXT")
	private String notes;
	
	private int approved_by;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String approved_date;
	
	private int submitted_by;
		
}

