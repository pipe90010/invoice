package com.arias.invoice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernate_lazy_initializer", "handler"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client {
    @Id
    @Getter
    @Setter
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    Long id;

    @Getter
    @Setter
    @Column(name = "primer_nombre")
    String primerNombre;

    @Getter
    @Setter
    @Column(name = "segundo_nombre")
    String segundoNombre;

    @Getter
    @Setter
    @Column(name = "primer_apellido")
    String primerApellido;

    @Getter
    @Setter
    @Column(name = "segundo_apellido")
    String segundoApellido;

    @Getter
    @Setter
    @Column(name = "tipoDocumento")
    String tipoDocumento;

    @OneToMany(mappedBy = "id")
    private List<Invoice> invoice;

    @Getter
    @Setter
    @Column(name = "numeroDocumento")
    String numeroDocumento;

    @Getter
    @Setter
    @Column(name = "dirección")
    String dirección;
}
