package com.bridgelabz.fundoo.note.model;

import java.time.LocalDateTime;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity

public class Label {

	@Id
	@Column(name = "labelId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long labelId;

	@Column(name = "labelName")
	@NotNull(message = "Label name can not be null")
	@NotEmpty(message = "Label name can not be empty")
	private String labelName;

	@Column(name = "createdDate")
	private LocalDateTime createdDate;

	@Column(name = "modifiedDate")
	private LocalDateTime modifiedDate;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Note> notes;

	@Column(name = "userId")
	private long userId;
}