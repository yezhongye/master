package com.ye.mapper;


import com.ye.entity.TbPayRefundLogDto;

public interface TbPayRefundLogMapper {
	
	void insert(TbPayRefundLogDto record);
	
	TbPayRefundLogDto getOne(Long tId);

}
