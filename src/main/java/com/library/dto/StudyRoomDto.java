package com.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudyRoomDto {
	//<!-- 4월 8일 -->
	private int SR_Id;
	private String SR_Name;
	private String SR_Info;
	private int SR_Situation;
}