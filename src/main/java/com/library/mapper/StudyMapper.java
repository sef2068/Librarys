package com.library.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.library.dto.RoomBookingDto;
@Mapper
public interface StudyMapper {
//<!-- 4월 8일 -->
	
	ArrayList roomBookingList();
	
	void insertroomService(RoomBookingDto studyDto);
}
