package com.library.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {

	ArrayList notice_list();

}
