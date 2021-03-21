package com.example.demo.domain;

import lombok.Data;

@Data
public class BoardDTO extends CommonDTO {

	private Long idx;
	private String title;
	private String content;
	private String writer;
	private int viewCnt;
	private String noticeYn;
	private String secretYn;
}
