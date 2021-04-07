package com.library.controller;

import java.net.URLEncoder;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.library.dto.StudyDto;
import com.library.service.study.StudyService;



@Controller
public class StudyController {
	
	@Autowired
	StudyService studyService;
	Map<String,Object> map;
	
	@RequestMapping("/study/inroom")
	public String write(StudyDto  studyDto) {
		studyService.roomService(studyDto);
		return "redirect:/study/mypageRoomService";
	}

	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	@RequestMapping("/study/studyRoom")
	public String studyRoom() {
		return "/study/studyRoom";
	}	
	@RequestMapping("/study/roomTime")
	public String roomTime() {
		return "/study/roomTime";
	}
	@RequestMapping("/study/mypageRoomService")
	public String mypageRoomService() {
		return "/study/mypageRoomService";
	}
	
	
}
