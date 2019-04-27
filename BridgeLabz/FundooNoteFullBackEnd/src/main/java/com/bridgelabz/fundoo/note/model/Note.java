package com.bridgelabz.fundoo.note.model;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity

public class Note implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "noteId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "userId")
	private long userId;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "isPin")
	private boolean isPin;

	@Column(name = "isArchive")
	private boolean isArchive;

	@Column(name = "isTrash")
	private boolean isTrash;

	@Column(name = "created")
	private LocalDateTime created;

	@Column(name = "modified")
	private LocalDateTime modified;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Label> listLabel;
}