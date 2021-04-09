package com.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeDto {

	private int NT_num;
	private String NT_title;
	private String NT_content;
	private String NT_date;
	private int NT_hit;

}
