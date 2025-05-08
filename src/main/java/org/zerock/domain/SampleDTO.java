package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
public class SampleDTO {
	private String name;
	private int age;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dueDate;
}
