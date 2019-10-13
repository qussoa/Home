package com.biz.home.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.home.domain.StudentVO;

import lombok.Setter;
@Setter
public class StudentViewServiceV1 extends StudentViewServieceABS {

	List<StudentVO> stdList;

	public StudentViewServiceV1() {

		stdList = new ArrayList<StudentVO>();
	}

	@Override
	public void view() {
		this.title();
		for (StudentVO vo : stdList) {
			this.body(vo);
		}
		System.out.println("======================================");
	}

	@Override
	public void title() {

		System.out.println("======================================");
		System.out.println("학생정보");
		System.out.println("======================================");
		System.out.println("학번\t이름\t전화번호\t주소\t학년");
		System.out.println("------------------------------------------------");

	}

	@Override
	public void body(StudentVO vo) {
		System.out.print(vo.getS_num() + "\t");
		System.out.print(vo.getS_name() + "\t");
		System.out.print(vo.getS_tel() + "\t");
		System.out.print(vo.getS_addr() + "\t");
		System.out.print(vo.getS_grade() + "\n");

	}

	@Override
	public void search(String strName) {
		this.title();
		for(StudentVO vo : stdList) {
			if(vo.getS_name().contains(strName)) {
				this.body(vo);
			}
		}
	}

	@Override
	public void search(int grGrade, int lessGrade) {
		this.title();
		for(StudentVO vo : stdList) {
			int grade = vo.getS_grade();
			if(grade >= grGrade && grade<= lessGrade) {
				this.body(vo);
			}
		}

	}

}
