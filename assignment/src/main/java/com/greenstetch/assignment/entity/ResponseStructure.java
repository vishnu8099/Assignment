package com.greenstetch.assignment.entity;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class ResponseStructure<K> {
	
	
	private Integer statusCode;
	
	private K data;
	
	private String message;
	
	private LocalDateTime timeStamp;

}
