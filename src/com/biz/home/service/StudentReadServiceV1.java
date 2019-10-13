package com.biz.home.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.home.domain.StudentVO;

import lombok.Getter;
import lombok.Setter;

@Getter
public class StudentReadServiceV1 {

	List<StudentVO> stdList;

	public StudentReadServiceV1() {
		stdList = new ArrayList<StudentVO>();
	}

	public void ReadFile(String fileName) throws IOException {

		FileReader fileReader = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if(reader == null) break;
			String[] stds = reader.split(":");

			stdList.add(StudentVO.builder().s_num(stds[0])
					.s_name(stds[1]).s_tel(stds[2]).s_addr(stds[3])
					.s_grade(Integer.valueOf(stds[4])).build());
		}
		buffer.close();
		fileReader.close();
	}

}
