package com.library.service.notice;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.dto.NoticeDto;
import com.library.mapper.NoticeMapper;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	NoticeMapper noticeMapper;
	Map<String,Object> map;
	ArrayList list;
	NoticeDto noticeDto;

	@Override
	public ArrayList notice_list() {
		
		list = noticeMapper.notice_list();
		
		return null;
	}

}
