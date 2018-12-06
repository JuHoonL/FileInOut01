package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSe02 {

	List<String> strList ;
	String strFileName ;
	
	public UserSe02(String strName) {
		strList = new ArrayList();
		strFileName = strName;
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(strFileName);
			br = new BufferedReader(fr);
			while(true) {
				String strR = br.readLine();
				if(strR == null) break;
				strList.add(strR);
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
}
