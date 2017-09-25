package com.java.my.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ThreadLocalTest {
	
	private static ThreadLocal threadLocal = new ThreadLocal();
	@Test
	public void threadLocalCacheTest(){
		setThreadLocalCache();
//		List list = (List)threadLocal.get();
		System.out.println(threadLocal.get().toString());
	}
	
	private static void setThreadLocalCache(){
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		Map<String,String> map = new HashMap<String,String>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		threadLocal.set(list);
//		threadLocal.set(map);
	}
}
