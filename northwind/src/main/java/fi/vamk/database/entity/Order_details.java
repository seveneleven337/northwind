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
		@Index(columnList = "inventory_id"),
		@Index(columnList = "purchase_order_id")	
})
public class Order_details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private Orders order;
	
	@OneToOne
	private Products product;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double quantity;
	
	@Column(length = 512, columnDefinition="DECIMAL")
	private double unit_price;
	
	@Column(length = 512, columnDefinition="DOUBLE")
	private double discount;
	
	@OneToOne
	private Order_details_status status;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String date_allocated;
	
	private int purchase_order_id;
	
	private int inventory_id;
	
}
