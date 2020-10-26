package myPack.test.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product implements Serializable{

 @Id
 @Column(name="barcode")
 private int barcode;
 @Column(name="product_name")
 private String productName;
 @Column(name="unit")
 private String unit;
@ManyToOne()
 private Shelf shelf;
 
 public Product() {
}

 public Product(int barcode, String productName, String unit) {
	this.barcode = barcode;
	this.productName = productName;
	this.unit = unit;
}

public Product(int barcode, String productName, String unit, int shelfId) {
	this.barcode = barcode;
	this.productName = productName;
	this.unit=unit;
	this.shelf = new Shelf(shelfId," ");
}

public int getBarcode() {
	return barcode;
}

public void setBarcode(int barcode) {
	this.barcode = barcode;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public Shelf getShelf() {
	return shelf;
}

public void setShelf(Shelf shelf) {
	this.shelf = shelf;
}

public String getUnit() {
	return unit;
}


public void setUnit(String unit) {
	this.unit = unit;
}


@Override
public String toString() {
	return "Product [barcode=" + barcode + ", productName=" + productName +  "]";
}

}