package fi.vamk.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sales_reports {

	@Id
	private String group_by;
	
	private String display;
	
	private String title;
	
	@Column(length = 512, columnDefinition="LONGTEXT")
	private String filter_row_source;
	
	@Column(length = 512, columnDefinition="TINYINT")
	private int default1;
}
