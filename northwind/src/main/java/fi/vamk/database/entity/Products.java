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
@Table(indexes = @Index(columnList = "product_code"))
public class Products {

	@Column(length = 512, columnDefinition="LONGTEXT")
	private String supplier_ids;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String product_code;
	
	private String product_name;
	
	@Column(length = 512, columnDefinition="LONGTEXT")
	private String description;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double standard_cost;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double list_price;
	
	private int reorder_level;
	
	private int target_level;
	
	private String quantity_per_unit;
	
	@Column(length = 512, columnDefinition="TINYINT")
	private int discontinued;
	
	private int minimum_reorder_quantity;
	
	private String category;
	
	@Column(length = 512, columnDefinition="LONGBLOB")
	private byte[] attachments;
}
