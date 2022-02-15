package fi.vamk.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Inventory_transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private Inventory_transaction_types transaction_type;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String transaction_created_date;
	
	@Column(length = 512, columnDefinition="DATETIME")
	private String transaction_modified_date;
	
	@OneToOne
	private Products product;
	
	private int quantity;
	
	@OneToOne
	private Purchase_orders purchase_order_id;
	
	@OneToOne
	private Orders customer_order_id;
	
	private String comments;
}
