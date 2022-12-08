package com.springorg.LABTEST14.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter


@Entity
public class Student {
	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	private String contact;

}
