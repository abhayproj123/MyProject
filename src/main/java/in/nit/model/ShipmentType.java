package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shiptab")
public class ShipmentType {
	
	@Id
	@Column(name="sid")
	private Integer shipId;
	@Column(name="smode")
	private String shipMode;
	@Column(name="scode")
	private String shipCode;
	@Column(name="enabs")
	private String enabShip;
	@Column(name="sgrade")
	private String shipGrade;
	@Column(name="sdesc")
	private String shipDesc;

}
