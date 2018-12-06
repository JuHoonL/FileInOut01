package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.vo.UserVO;

public class UserSe04 {

	List<UserVO> uList ;
	String strFileName ;
	
	public UserSe04(String strN) {
		uList = new ArrayList();
		strFileName = strN;
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
