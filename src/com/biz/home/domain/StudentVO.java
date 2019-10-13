package com.biz.home.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVO {

	private String s_num;
	private String s_name;
	private String s_tel;
	private String s_addr;
	private int s_grade;
}
