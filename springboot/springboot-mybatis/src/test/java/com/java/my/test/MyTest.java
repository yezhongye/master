package com.java.my.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class MyTest {
	
	@Test
	public void java8Test(){
		Map<String,String> maps = new HashMap<String,String>();
		maps.putIfAbsent("a", "aa");
		maps.put("b", "bb");
		maps.put("c", "cc");
		maps.put("d", "dd");
		maps.forEach((id,val) -> {
			if("b".equals(id)){
				maps.remove(id);
				System.out.println("修改");
			}
			System.out.println(id+":"+val);
			});
		System.out.println(maps.get("f"));
	}
	
}
