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
		//@Index(columnList = "shipper_id"),
		@Index(columnList = "tax_status_id"),
		@Index(columnList = "ship_zip_postal_code"),	
		@Index(columnList = "status_id"),

})
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private Employees employees;
	
	
	@OneToOne
	private Customers customers;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String order_date;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String shipped_date;
	
	//relation
	//shipper_id
	
	private String ship_name;
	
	@Column(length = 512, columnDefinition="LONGTEXT")
	private String ship_address;
	
	private String ship_city;
	
	private String ship_state_province;
	
	private String ship_zip_postal_code;
	
	private String ship_country_region;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double shipping_fee;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double taxes;
	
	private String payment_type;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String paid_date;
	
	@Column(length = 512, columnDefinition="LONGTEXT")
	private String notes;
	
	@Column(length = 512, columnDefinition="DOUBLE")
	private double tax_rate;
	
	@Column(length = 512, columnDefinition="TINYINT")
	private int tax_status_id;
	
	@Column(length = 512, columnDefinition="TINYINT")
	private int status_id;
	
	
	
	
}
