package com.library.service.study;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.dto.RoomBookingDto;
import com.library.mapper.StudyMapper;

@Service
public class StudyServiceImpl implements StudyService{
//<!-- 4월 8일 -->
	@Autowired
	StudyMapper studyMapper;
	
	
	Map<String,Object> map;
	ArrayList list;
	RoomBookingDto studyDto;
	
	@Override
	public void roomService(RoomBookingDto studyDto) {
		studyMapper.insertroomService(studyDto);
	return;	
	}
	
	@Override
	public ArrayList RoomBookingList() {
		
		list =	studyMapper.roomBookingList();
		System.out.println("impl : "+list);
		return list;
	}

}
