package com.biz.home.service;

import com.biz.home.domain.StudentVO;

public abstract class StudentViewServieceABS {

	public abstract void view();
	public abstract void title();
	public abstract void body(StudentVO vo);
	public abstract void search(String strName);
	public abstract void search(int grGrade, int lessGrade);
	
	
}
