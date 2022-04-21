package com.arias.invoice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernate_lazy_initializer", "handler"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Invoice  {

	@Id
	@Getter
	@Setter
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;

	@Getter
	@Setter
	@Column(name = "invoice_number")
	private String invoiceNumber;

	@Getter
	@Setter
	@Column(name = "cajero")
	private String cajero;

	@Getter
	@Setter
	@OneToOne
	@JoinColumn(name = "id")
	private Client client;

	@Getter
	@Setter
	@Column(name = "caja")
	private Long caja;

	@Getter
	@Setter
	@OneToMany(mappedBy="productId")
	private Set<Producto> productos;

}