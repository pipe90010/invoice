package com.arias.invoice.controller;

import com.arias.invoice.dto.InvoiceDto;
import com.arias.invoice.entity.Invoice;
import com.arias.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/v1/invoices")
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;

	@GetMapping("/{id}")
	public ResponseEntity<InvoiceDto> getAllDetails(@PathVariable("id") Long id) {
		return invoiceService.getInvoices(id).map(mapToInvoiceDTO).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	private Function<Invoice, InvoiceDto> mapToInvoiceDTO = i -> InvoiceDto.builder().id(i.getId()).nombreCajero(i.getCajero()).numeroCaja(i.getCaja()).nombrecliente(i.getClient().getPrimerNombre()+i.getClient().getPrimerApellido()).build();

}