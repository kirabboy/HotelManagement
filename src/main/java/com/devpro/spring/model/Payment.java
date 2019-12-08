package com.devpro.spring.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "payment_id")
	private Long paymentId;

	@Column(name = "method")
	private String paymentMethod;

	@OneToMany(mappedBy = "payment")
	private Set<Rental> rentals;
}
