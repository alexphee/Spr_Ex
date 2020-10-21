package myPack.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shelves")
public class Shelf implements Serializable{

 @Id
 @Column(name="id")
 private int id;
 @Column(name="shelf_name")
 private String shelfName;

 public Shelf() {
}

 
public Shelf(int id, String shelfName) {
	this.id = id;
	this.shelfName = shelfName;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getShelfName() {
	return shelfName;
}

public void setShelfName(String shelfName) {
	this.shelfName = shelfName;
}

@Override
public String toString() {
	return "Shelf [id=" + id + ", shelfName=" + shelfName + "]";
}
 



}