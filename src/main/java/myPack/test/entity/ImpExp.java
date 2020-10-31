package myPack.test.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="imp_exp")
public class ImpExp implements Serializable{

	@Id
	@Column(name="id")
	private int id;
	@Column(name="date")
	private Date date;
	@Column(name="type")
	private String type;
	@Column(name="name")
	private String name;

	@OneToMany(mappedBy = "imp_exp", orphanRemoval = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE}, fetch = FetchType.LAZY)
	 private List<Order> orders = new ArrayList<>();

	public ImpExp() {}
	
	
	public ImpExp(int id, Date date, String type, String name) {
		super();
		this.id = id;
		this.date = date;
		this.type = type;
		this.name = name;
	}


	public ImpExp(int id, Date date, String type, String name, List<Order> orders) {
		super();
		this.id = id;
		this.date = date;
		this.type = type;
		this.name = name;
		this.orders = orders;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
 public void addOrderList(Order order) {
	 this.orders.add(order);
 }

}