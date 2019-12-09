package com.hieuboy.entities;
// default package
// Generated Jun 29, 2017 8:24:48 PM by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "mobileworld")
public class Order implements java.io.Serializable {

	private static final long serialVersionUID = 6059651048553827948L;
	
	private Integer id;
	private String customerName;
	private String phoneNumber;
	private String address;
	private long total;
	private Date date;
	private boolean status;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);
	private Set<OrderDetail> orderDetails_1 = new HashSet<OrderDetail>(0);

	public Order() {
	}

	public Order(String customerName, String phoneNumber, String address, long total, Date date, boolean status) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.total = total;
		this.date = date;
		this.status = status;
	}

	public Order(String customerName, String phoneNumber, String address, long total, Date date, boolean status,
			Set<OrderDetail> orderDetails, Set<OrderDetail> orderDetails_1) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.total = total;
		this.date = date;
		this.status = status;
		this.orderDetails = orderDetails;
		this.orderDetails_1 = orderDetails_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "customer_name", nullable = false, length = 50)
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column(name = "phone_number", nullable = false, length = 15)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "address", nullable = false)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "total", nullable = false)
	public long getTotal() {
		return this.total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<OrderDetail> getOrderDetails_1() {
		return this.orderDetails_1;
	}

	public void setOrderDetails_1(Set<OrderDetail> orderDetails_1) {
		this.orderDetails_1 = orderDetails_1;
	}

}
