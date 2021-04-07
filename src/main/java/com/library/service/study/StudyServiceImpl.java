package com.library.service.study;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.library.dto.StudyDto;
import com.library.mapper.StudyMapper;

public class StudyServiceImpl implements StudyService{

	@Autowired
	StudyMapper studyMapper;
	@Autowired
	Map<String,Object> map;
	List<StudyDto> list;
	StudyDto studyDto;
	
	@Override
	public void roomService(StudyDto studyDto) {

		studyMapper.insertroomService(studyDto);
    
	return;	
	}

}
