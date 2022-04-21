package com.arias.invoice.dto;

import com.arias.invoice.entity.Producto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties({"hibernate_lazy_initializer", "handler"})

public class InvoiceDto {
	private Long id;
	private String nombreCajero;
	private Long numeroCaja;
	private String tipoDocumento;
	private Long numeroDocumento;
	private String nombrecliente;
	private List<Producto> producto;
}
