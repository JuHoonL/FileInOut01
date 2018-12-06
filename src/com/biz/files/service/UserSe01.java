package com.biz.files.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.UserVO;

public class UserSe01 {

	List<UserVO> uList ;
	
	public UserSe01() {
		uList = new ArrayList();
	}
	
	public void makeId() {
		for(int i = 0 ; i < 10 ; i++) {
			UserVO vo = new UserVO();
			int intScore = (int)(Math.random()*(200-100+1))+100;
			vo.setStrId(String.valueOf(intScore));
			uList.add(vo);
		}
	}
	
	public void view() {
		for(UserVO v : uList) {
			System.out.println(v);
		}
	}
}
