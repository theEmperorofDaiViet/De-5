package De5.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class House {

	@Id
	private String id;
	
	private String address;
	
	private int area;
	
	private String type;
	
	private int approved;
	
	public House(){
	}
	
	public House(String id, String address, int area, String type, int approved) {
		this.id = id;
		this.address = address;
		this.area = area;
		this.type = type;
		this.approved = approved;
	}
}
