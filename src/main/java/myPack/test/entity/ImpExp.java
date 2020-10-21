package myPack.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="imp_exp")
public class ImpExp implements Serializable{

	@Id
	@Column(name="id")
	private int id;
	@Column(name="date")
	private int date;
	@Column(name="name")
	private String name;
	@Column(name="barcode")
	private int barcode;
	@ManyToOne()
	 private Shelf shelf;
	@ManyToOne()
	private Storage storage;
	@Column(name="action")
	private String action;
	@Column(name="quantity")
	private int quantity;
	
	public ImpExp() {}

	public ImpExp(int id, int date, String name, int barcode, String action, int quantity) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.barcode = barcode;
		this.action = action;
		this.quantity = quantity;
	}

	public ImpExp(int id, int date, String name, int barcode, int shelfId, int storageId, String action,
			int quantity) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.barcode = barcode;
		this.shelf = new Shelf(shelfId, " ");
		this.storage = new Storage(storageId," ");
		this.action = action;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ImpExp [id=" + id + ", date=" + date + ", name=" + name + ", barcode=" + barcode + ", shelf=" + shelf
				+ ", storage=" + storage + ", action=" + action + ", quantity=" + quantity + "]";
	}
	
	
}