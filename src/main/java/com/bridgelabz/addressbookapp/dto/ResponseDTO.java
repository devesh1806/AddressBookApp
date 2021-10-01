package com.bridgelabz.addressbookapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class ResponseDTO {
	private String message;
	private Object data;
	
	
}
