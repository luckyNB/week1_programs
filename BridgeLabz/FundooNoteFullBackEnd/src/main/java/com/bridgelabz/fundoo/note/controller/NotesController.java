package com.bridgelabz.fundoo.note.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoo.note.dto.NotesDto;
import com.bridgelabz.fundoo.note.service.INotesService;
import com.bridgelabz.fundoo.response.Response;




@RestController

@RequestMapping("/user/note")

//annotation for set environment file 
@PropertySource("classpath:message.properties")
public class NotesController {
	
	Logger logger = LoggerFactory.getLogger(NotesController.class);
	
	@Autowired
	private INotesService noteService;
	

	@PostMapping("/create")
	public ResponseEntity<Response> creatingNote(@RequestBody NotesDto notesDto , @RequestHeader String token){
		logger.info(notesDto.toString());
		Response responseStatus = noteService.createNote(notesDto, token);
		return new ResponseEntity<Response>(responseStatus,HttpStatus.OK);
	}
	

	@PutMapping("/update")
	public ResponseEntity<Response> updatingNote(@RequestBody NotesDto notesDto , @RequestHeader String token , @RequestParam long noteId){
		logger.info(notesDto.toString());
		Response responseStatus = noteService.updateNote(notesDto, token , noteId);
		return new ResponseEntity<Response> (responseStatus,HttpStatus.ACCEPTED);
	}
	

	@PutMapping("/delete")
	public ResponseEntity<Response> deletingNote(@RequestHeader String token ,@RequestParam long noteId){
		Response responseStatus = noteService.delete(token, noteId);
		return new ResponseEntity<Response> (responseStatus,HttpStatus.OK);
	}


	@GetMapping("/getallnotes")
	public List<NotesDto>  getAllNotes(@RequestHeader String token) {
		List<NotesDto> listnotes = noteService.getAllNotes(token);
		return listnotes;
	}
	

	@PutMapping("/pin")
	public ResponseEntity<Response> pinNote(@RequestHeader String token , @RequestParam long noteId){
		Response responseStatus = noteService.pinAndUnPin(token, noteId);
		return new ResponseEntity<Response> (responseStatus,HttpStatus.OK);
	}
	

	@PutMapping("/archive")
	public ResponseEntity<Response> archiveNote(@RequestHeader String token , @RequestParam long noteId){
		Response responseStatus = noteService.archiveAndUnArchive(token, noteId);
		return new ResponseEntity<Response> (responseStatus,HttpStatus.OK);
	}
	

	@PutMapping("/trash")
	public ResponseEntity<Response> trashNote(@RequestHeader String token, @RequestParam long noteId){
		Response responseStatus = noteService.trashAndUnTrash(token, noteId);
		return new ResponseEntity<Response> (responseStatus,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Response> deleteNote(@RequestHeader String token, @RequestParam long noteId){
		Response responseStatus = noteService.deletePermanently(token, noteId);
		return new ResponseEntity<Response> (responseStatus,HttpStatus.OK);
	}

	
	@GetMapping("/getarchivenotes")
	public List<NotesDto>  getArchiveNotes(@RequestHeader String token) {
		List<NotesDto> listnotes = noteService.getArchiveNotes(token);
		return listnotes;
	}
	

	@GetMapping("/gettrashnotes")
	public List<NotesDto>  getTrashNotes(@RequestHeader String token) {
		List<NotesDto> listnotes = noteService.getTrashNotes(token);
		return listnotes;
	}
}
