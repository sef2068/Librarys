package com.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudyDto {
	
	private int RS_Id;
	private int SR_Id;
	private int RS_Date;
	private int RS_Time;
	private int RS_Minute;
	private int LM_Id;
	private int RS_Info;
}