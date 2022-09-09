package com.sonata.streamapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class sortMapStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map =new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("one", 1);
		Set< Map.Entry<String,Integer>> st=map.entrySet();
		for (Map.Entry<String,Integer>me:st)
		{
			System.out.println(me.getKey()+":"+me.getValue());
			
			
		}

	}

}
