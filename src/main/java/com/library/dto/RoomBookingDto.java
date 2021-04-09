package com.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomBookingDto {
	private int RB_Id;
	private int SR_Id;
	private String RB_Date;
	private int RB_Time;
	private int RB_Minute;
	private int LM_Id;
	private String RB_Info;
}