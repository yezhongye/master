package com.ye.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ye.entity.TbPayRefundLogDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private TbPayRefundLogMapper tbPayRefundLogMapper;
	
	@Test
	public void insertInfo(){
		TbPayRefundLogDto tp = new TbPayRefundLogDto();
		tp.settId(1L);
		tp.setOrderCode("12345");
		tbPayRefundLogMapper.insert(tp);
		System.out.println(1);
	}
	@Test
	public void query(){
		TbPayRefundLogDto tp = tbPayRefundLogMapper.getOne(1L);
		System.out.println(tp.getOrderCode());
		System.out.println(tp.getRefundNo());
	}

}