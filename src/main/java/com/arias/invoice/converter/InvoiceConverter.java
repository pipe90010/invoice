package com.arias.invoice.converter;

import com.arias.invoice.dto.InvoiceDto;
import com.arias.invoice.entity.Invoice;
import org.modelmapper.ModelMapper;

public class InvoiceConverter {
	private static final ModelMapper modelMapper = new ModelMapper();
	
	public static Invoice convertDtoToEntity(InvoiceDto invoiceDto) {
		return modelMapper.map(invoiceDto, Invoice.class);
	}
	
	public static InvoiceDto convertEntityToDto(Invoice invoice) {
		return modelMapper.map(invoice, InvoiceDto.class);
	}
}
