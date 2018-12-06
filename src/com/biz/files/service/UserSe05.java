package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.vo.UserVO;

public class UserSe05 {

	List<UserVO> uList ;
	String strFileName ;
	
	public UserSe05(String strN) {
		uList = new ArrayList();
		strFileName = strN;
	}
	
	public int makeId() {
		return (int)(Math.random() * (200-100+1))+100;
	}
	
	public int makePassword() {
		return (int)(Math.random() * (10000 - 1000 + 1)) + 1000 ;
	}
	
	public void readFile() {
		FileReader fr ;
		BufferedReader br ;
		try {
			fr = new FileReader(strFileName);
			br = new BufferedReader(fr);
			while(true){
				String strKor = br.readLine();
				if(strKor == null) break;
				String[] splitK = strKor.split(":");
				UserVO vo = new UserVO();
				vo.setStrName(splitK[0]);
				vo.setStrId(""+makeId());
				vo.setStrPassword(""+makePassword());
				uList.add(vo);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void view() {
		for(UserVO s : uList) {
			System.out.println(s);
		}
	}
}
