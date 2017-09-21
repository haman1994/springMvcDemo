package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ShowInfoService {
	
	public List<String> show(String name, String address){
		List<String> strList = new ArrayList();
		
		for(int i = 0; i < 4; i++){
			String tmp = "kkk"+ i;
			strList.add(tmp);
		}
		
		return strList;
	}
}
