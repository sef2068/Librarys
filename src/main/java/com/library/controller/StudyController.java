package com.library.controller;

import java.net.URLEncoder;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.service.study.StudyService;



@Controller
public class StudyController {
	
//	@Autowired
//	StudyService studyService;
//	Map<String,Object> map;
	
	
//	@RequestMapping("/ㅡㅡㅡㅡ")
//	public String ㅡㅡㅡㅡ() throws Exception {
// 		return;
//	}
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	@RequestMapping("/study/studyRoom")
	public String studyRoom() {
		return "/study/studyRoom";
	}
}