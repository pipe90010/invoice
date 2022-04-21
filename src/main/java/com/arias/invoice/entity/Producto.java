package com.arias.invoice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernate_lazy_initializer", "handler"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "invoice_productos")
public class Producto {

    @Id
    @Getter
    @Setter
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long productId;

    @Getter
    @Setter
    @Column(name = "nombreProducto")
    private String nombreProducto;

    @Getter
    @Setter
    @Column(name = "ValorUnidad")
    private Long ValorUnidad;

    @Getter
    @Setter
    @Column(name = "estado")
    private Boolean estado;
}
