package myPack.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "storages")
public class Storage implements Serializable{

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id")
 private int id;
 @Column(name="storage_name")
 private String storageName;


 public Storage() {
}
 
public Storage(int id, String storageName) {
	this.id = id;
	this.storageName = storageName;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getStorageName() {
	return storageName;
}

public void setStorageName(String storageName) {
	this.storageName = storageName;
}

@Override
public String toString() {
	return "Storage [id=" + id + ", storageName=" + storageName + "]";
}



}