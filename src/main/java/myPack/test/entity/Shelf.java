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
 @ManyToOne()
 private Storage storage;
 
 public Shelf() {
}

 
public Shelf(int id, String shelfName) {
	this.id = id;
	this.shelfName = shelfName;
}



public Shelf(int id, String shelfName, int storageId) {
	super();
	this.id = id;
	this.shelfName = shelfName;
	this.storage = new Storage(storageId," ");
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


public Storage getStorage() {
	return storage;
}


public void setStorage(Storage storage) {
	this.storage = storage;
}


@Override
public String toString() {
	return "Shelf [id=" + id + ", shelfName=" + shelfName + "]";
}
 



}