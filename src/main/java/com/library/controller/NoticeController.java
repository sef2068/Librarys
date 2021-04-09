package com.library.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.library.service.notice.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	NoticeService noticeService;
	Map<String,Object> map;
	ArrayList list = new ArrayList();
	
	@RequestMapping("/notice/notice_list")
	public String notice_list(Model model) {
		list = noticeService.notice_list();
		System.out.println("date : "+list);
		model.addAttribute("list",list);
		
		return "/notice/notice_list";
	}

}
