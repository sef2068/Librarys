package com.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudyDto {
	
	private int SR_id;
	private int SR_name;
	private int SR_date1;
	private int SR_date2;
	private int SR_date3;
	private int SR_userid;
	private int SR_username;
}