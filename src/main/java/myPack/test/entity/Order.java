package myPack.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order implements Serializable{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="barcode")
	private int barcode;
	@Column(name="shelf_id")
	private int shelfId;
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne
	private ImpExp impexp;
	
	public Order() {}

	public Order(int id, int barcode, int shelfId, 
			int quantity, ImpExp impexp) {
		super();
		this.id = id;
		this.barcode = barcode;
		this.shelfId = shelfId;
		this.quantity = quantity;
		this.impexp = impexp;
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

	public ImpExp getImpexp() {
		return impexp;
	}

	public void setImpexp(ImpExp impexp) {
		this.impexp = impexp;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", barcode=" + barcode + ", shelfId=" + shelfId + ", quantity=" + quantity
				+ ", impexp=" + impexp + "]";
	}

	
	
}
