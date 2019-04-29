package com.bridgelabz.fundoo.note.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.fundoo.note.dto.LabelDto;
import com.bridgelabz.fundoo.note.dto.NotesDto;
import com.bridgelabz.fundoo.response.Response;




@Service
public interface ILabelService {
	
	

	public Response createLabel(LabelDto labelDto , String token);
	
	

	public Response deleteLabel(long labelId ,String token);
	
	

	public Response updateLabel(long labelId , String token , LabelDto labelDto);
	

	public List<LabelDto> getAllLabel(String token);
	

	public Response addLabelToNote(long labelId ,String token , long noteId);
	

	public List<LabelDto> getLebelsOfNote(String token , long noteId);
	

	public Response removeLabelFromNote(long labelId ,String token , long noteId);

	public List<NotesDto> getNotesOfLabel(String token , long labelId );
}
