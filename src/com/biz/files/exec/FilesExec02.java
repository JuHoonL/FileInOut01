package com.biz.files.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilesExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strKor = "src/com/biz/files/vo/우리말이름.txt";
		List<String> strK = new ArrayList();
		
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strKor);
			br = new BufferedReader(fr);
			
			while(true) {
				String kList = br.readLine();
				if(kList == null) break;
					strK.add(kList);
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

		for (String s : strK) {
			System.out.println(s);
		}
	}

}
