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
@Table(indexes = @Index(columnList = "id"))
public class Purchase_order_details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int purchase_order_id;
	
	private int product_id;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double quantity;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double unit_cost;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String date_received;
	
	@Column(length = 512, columnDefinition="TINYINT")
	private int posted_to_inventory;

	private int inventory_id;
}
