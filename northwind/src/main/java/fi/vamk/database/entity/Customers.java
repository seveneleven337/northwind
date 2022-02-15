package fi.vamk.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(indexes = {
		@Index(columnList = "city"),
		@Index(columnList = "company"),	
		@Index(columnList = "first_name"),
		@Index(columnList = "last_name"),	
		@Index(columnList = "zip_postal_code"),
		@Index(columnList = "state_province"),	
})
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(length = 50)
	private String company;
	
	@Column(length = 50)
	private String last_name;
	
	@Column(length = 50)
	private String first_name;
	
	@Column(length = 50)
	private String email_address;
	
	@Column(length = 50)
	private String job_title;
	
	@Column(length = 25)
	private String business_phone;
	
	@Column(length = 25)
	private String home_phone;
	
	@Column(length = 25)
	private String mobile_phone;
	
	@Column(length = 25)
	private String fax_number;
	
	@Column(length = 512, columnDefinition="LONGTEXT")
	private String adress;
	
	@Column(length = 50)
	private String city;
	
	@Column(length = 50)
	private String state_province;
	
	@Column(length = 15)
	private String zip_postal_code;
	
	@Column(length = 50)
	private String country_region;
	
	@Column(length = 512, columnDefinition="LONGTEXT")
	private String web_page;
	
	@Column(length = 512, columnDefinition="LONGTEXT")
	private String notes;
	
	@Column(length = 512, columnDefinition="LONGBLOB")
	private byte[] attachments;
}
