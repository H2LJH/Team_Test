package com.biz.dripbag.mapper;

import org.apache.ibatis.annotations.Param;

import com.biz.dripbag.model.NoticeVO;

public interface NoticeDAO extends GenericDAO<NoticeVO, Long>
{
	public long hit();
	public long updatehit(@Param("hit") long hit, @Param("seq") long seq);
}
