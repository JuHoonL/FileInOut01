package com.biz.files.exec;

import com.biz.files.service.UserSe01;
import com.biz.files.service.UserSe03;
import com.biz.files.service.UserSe04;
import com.biz.files.service.UserSe05;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserSe01 uS = new UserSe01();
		
		uS.makeId();
		
		String sS = "src/com/biz/files/vo/우리말이름.txt";
		UserSe03 uS3 = new UserSe03(sS);
		uS3.readFile();
		
		UserSe04 uS4 = new UserSe04(sS);
		uS4.readFile();
		
		UserSe05 uS5 = new UserSe05(sS);
		uS5.readFile();
		uS5.view();
	}

}
