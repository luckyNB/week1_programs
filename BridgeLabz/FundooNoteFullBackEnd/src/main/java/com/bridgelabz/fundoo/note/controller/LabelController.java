package com.bridgelabz.fundoo.note.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.bridgelabz.fundoo.note.dto.LabelDto;
import com.bridgelabz.fundoo.note.dto.NotesDto;
import com.bridgelabz.fundoo.note.service.ILabelService;
import com.bridgelabz.fundoo.response.Response;



@RestController
@RequestMapping("/user/label")
public class LabelController {
	
	@Autowired
	private ILabelService labelService;
	

	@PostMapping("/create")
	ResponseEntity<Response> createLabel(@RequestBody LabelDto labelDto , @RequestHeader String token) {
		Response statusResponse = labelService.createLabel(labelDto, token);
		return new ResponseEntity<Response>(statusResponse,HttpStatus.ACCEPTED);
	}
	

	@DeleteMapping("/delete")
	ResponseEntity<Response> deleteLabel(@RequestHeader String token , @RequestParam long labelId) {
		Response statusResponse = labelService.deleteLabel(labelId, token);
		return new ResponseEntity<Response>(statusResponse,HttpStatus.OK);
	}
	

	@PutMapping("/update")
	ResponseEntity<Response> updateLabel(@RequestHeader String token , @RequestParam long labelId , @RequestBody LabelDto labelDto){
		Response statusResponse = labelService.updateLabel(labelId, token, labelDto);
		return new ResponseEntity<Response>(statusResponse,HttpStatus.OK);
	}
	

	@GetMapping("/getlabel")
	List<LabelDto> getLabel(@RequestHeader String token){
		List<LabelDto> listLabel = labelService.getAllLabel(token);
		return listLabel;
	}
	

	@PutMapping("/addlebeltonote")
	ResponseEntity<Response> addNoteToLebel(@RequestParam long labelId , @RequestHeader String token , @RequestParam long noteId){
		Response statusResponse = labelService.addLabelToNote(labelId, token, noteId);
		return new ResponseEntity<Response>(statusResponse,HttpStatus.OK);
	}
	

	@GetMapping("/getlebelofnote")
	List<LabelDto> getLebelOfNote(@RequestHeader String token, @RequestParam long noteId){
		List<LabelDto> listLabel = labelService.getLebelsOfNote(token, noteId);
		return listLabel;
	}
	
	
	@PutMapping("/removefromnote")
	ResponseEntity<Response> removeFromNote(@RequestHeader String token, @RequestParam long noteId , @RequestParam long labelId){
		Response statusResponse = labelService.removeLabelFromNote(labelId, token, noteId);
		return new ResponseEntity<Response>(statusResponse,HttpStatus.OK);
	}
	
	
	@GetMapping("/getnotesoflabel")
	List<NotesDto> getNotesOfLabel(@RequestHeader String token , @RequestParam long labelId){
		List<NotesDto> listNotes = labelService.getNotesOfLabel(token, labelId);
		return listNotes;
	}
}
