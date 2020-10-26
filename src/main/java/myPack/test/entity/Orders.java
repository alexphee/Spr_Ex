package myPack.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders implements Serializable{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="barcode")
	private int barcode;
	@Column(name="shelf_id")
	private int shelfId;
	@Column(name="quantity")
	private int quantity;
	
	public Orders() {}

	
	public Orders(int barcode, int shelfId, int quantity) {
		super();
		this.barcode = barcode;
		this.shelfId = shelfId;
		this.quantity = quantity;
	}


	public Orders(int id, int barcode, int shelfId, int quantity) {
		super();
		this.id = id;
		this.barcode = barcode;
		this.shelfId = shelfId;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public int getShelfId() {
		return shelfId;
	}

	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", barcode=" + barcode + ", shelfId=" + shelfId + ", quantity=" + quantity + "]";
	}
	
	
}
