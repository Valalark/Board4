package com.example.demo.domain;

import java.time.LocalDateTime;

import com.example.demo.paging.Criteria;
import com.example.demo.paging.PaginationInfo;

import lombok.Data;

@Data
public class CommonDTO extends Criteria {

	private PaginationInfo paginationInfo;
	private String deleteYn;
	private LocalDateTime insertTime;
	private LocalDateTime updateTime;
	private LocalDateTime deleteTime;	
}
