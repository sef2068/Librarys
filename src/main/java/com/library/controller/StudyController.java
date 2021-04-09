package com.library.controller;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.library.dto.RoomBookingDto;
import com.library.service.study.StudyService;



@Controller
public class StudyController {
	//<!-- 4월 8일 -->
	
	@Autowired
	StudyService studyService;
	Map<String,Object> map;
	ArrayList list = new ArrayList();
	
	@RequestMapping("/study/mypageRoomList")
	public String mypageRoomList(Model model) {
		list = studyService.RoomBookingList();
		System.out.println("date : "+list);
		model.addAttribute("list",list);
		
		return "/study/mypageRoomList";
	}
	
	@RequestMapping("/study/roomBooking")
	public String roomBooking(RoomBookingDto studyDto) {
		studyService.roomService(studyDto);
		return "/study/mypageRoomList";
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
}
