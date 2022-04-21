package com.arias.invoice.service;

import com.arias.invoice.entity.Invoice;
import com.arias.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvoiceService {
	@Autowired
    private InvoiceRepository invoiceRepository;

	public Optional<Invoice> getInvoices(Long invoiceId) {
		return Optional.of(invoiceRepository.getById(invoiceId));
	}


}
