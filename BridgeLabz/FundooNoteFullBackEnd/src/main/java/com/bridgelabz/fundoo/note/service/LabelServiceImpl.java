package com.bridgelabz.fundoo.note.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.bridgelabz.fundoo.exception.UserException;
import com.bridgelabz.fundoo.note.dto.LabelDto;
import com.bridgelabz.fundoo.note.dto.NotesDto;
import com.bridgelabz.fundoo.note.model.Label;
import com.bridgelabz.fundoo.note.model.Note;
import com.bridgelabz.fundoo.note.repository.INotesRepository;
import com.bridgelabz.fundoo.note.repository.LabelRepository;
import com.bridgelabz.fundoo.response.Response;
import com.bridgelabz.fundoo.user.model.User;
import com.bridgelabz.fundoo.user.repository.UserRepo;
import com.bridgelabz.fundoo.utility.ResponseHelper;
import com.bridgelabz.fundoo.utility.TokenUtil;

@Service("labelService")
@PropertySource("classpath:message.properties")
public class LabelServiceImpl implements ILabelService{

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private LabelRepository labelRepository;
	
	@Autowired
	private UserRepo userRepository;
	
	@Autowired
	private INotesRepository notesRepository;
	
	@Autowired
	private TokenUtil userToken;
	
	@Autowired
	private Environment environment;
	

	@Override
	public Response createLabel(LabelDto labelDto, String token) {
		long userId = userToken.decodeToken(token);
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			throw new UserException(-6, "Invalid input");
		}
		if(labelDto.getLabelName().isEmpty()) {
			throw new UserException(-6, "Label has no name");
		}
		Optional<Label> labelAvailability = labelRepository.findByUserIdAndLabelName(userId, labelDto.getLabelName());
		if(labelAvailability.isPresent()) {
			throw new UserException(-6, "Label already exist");
		}
		
		Label label = modelMapper.map(labelDto,Label.class);
		
		label.setLabelName(labelDto.getLabelName());
		label.setUserId(userId);
		label.setCreatedDate(LocalDateTime.now());
		label.setModifiedDate(LocalDateTime.now());
		labelRepository.save(label);
		user.get().getLabel().add(label);
		userRepository.save(user.get());
		Response response=ResponseHelper.statusResponse(100, environment.getProperty("status.label.created"));
	return response;
	}


	@Override
	public Response deleteLabel(long labelId, String token) {
		long userId = userToken.decodeToken(token);
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			throw new UserException(-6, "Invalid input");
		}
		Label label = labelRepository.findByLabelIdAndUserId(labelId, userId);
		if(label == null) {
			throw new UserException(-6, "Invalid input");
		}
		labelRepository.delete(label);
		Response response=ResponseHelper.statusResponse(100, environment.getProperty("status.label.deleted"));
	return response;
	
	

	}


	@Override
	public Response updateLabel(long labelId , String token ,LabelDto labelDto) {
		long userId = userToken.decodeToken(token);
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			throw new UserException(-6, "Invalid input");
		}
		Label label = labelRepository.findByLabelIdAndUserId(labelId, userId);
		if(label == null ) {
			throw new UserException(-6, "No label exist");
		}
		if(labelDto.getLabelName().isEmpty()) {
			throw new UserException(-6, "Label has no name");
		}
		Optional<Label> labelAvailability = labelRepository.findByUserIdAndLabelName(userId, labelDto.getLabelName());
		if(labelAvailability.isPresent()) {
			throw new UserException(-6, "Label already exist");
		}
		label.setLabelName(labelDto.getLabelName());
		label.setModifiedDate(LocalDateTime.now());
		labelRepository.save(label);
		Response response=ResponseHelper.statusResponse(100, environment.getProperty("status.label.updated"));
		return response;
		
		
	}


	@Override
	public List<LabelDto> getAllLabel(String token) {
		long userId = userToken.decodeToken(token);
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			throw new UserException("Invalid input");
		}
		
		List<Label> labels = labelRepository.findByUserId(userId);
		List<LabelDto> listLabel = new ArrayList<>();
		for(Label noteLabel : labels) {
			LabelDto labelDto = modelMapper.map(noteLabel, LabelDto.class);
			listLabel.add(labelDto);
		}
		return listLabel;
	}


	@Override
	public Response addLabelToNote(long labelId, String token , long noteId) {
		long userId = userToken.decodeToken(token);
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			throw new UserException(-6, "Invalid input");
		}
		Label label = labelRepository.findByLabelIdAndUserId(labelId, userId);
		if(label == null) {
			throw new UserException(-6, "No such lebel exist");
		}
		Note note =  notesRepository.findByIdAndUserId(noteId, userId);
		if(note == null) {
			throw new UserException(-6, "No such note exist");
		}
		label.setModifiedDate(LocalDateTime.now());
		label.getNotes().add(note);
		note.getListLabel().add(label);
		note.setModified(LocalDateTime.now());
		labelRepository.save(label);
		notesRepository.save(note);
		
		
		Response response=ResponseHelper.statusResponse(100, environment.getProperty("status.label.addedtonote"));
		return response;
		
		
		
	
	}

	


	@Override
	public Response removeLabelFromNote(long labelId ,String token , long noteId) {
		long userId = userToken.decodeToken(token);
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			throw new UserException(-6, "Invalid input");
		}
		Label label = labelRepository.findByLabelIdAndUserId(labelId , userId);
		if(label == null) {
			throw new UserException(-6, "No such lebel exist");
		}
		Note note =  notesRepository.findByIdAndUserId(noteId, userId);
		if(note == null) {
			throw new UserException(-6, "No such note exist");
		}
		label.setModifiedDate(LocalDateTime.now());
		note.getListLabel().remove(label);
		note.setModified(LocalDateTime.now());
		labelRepository.save(label);
		notesRepository.save(note);
		
		Response response=ResponseHelper.statusResponse(100, environment.getProperty("status.label.removedfromnote"));
		return response;
		
		

	}

	@Override
	public List<LabelDto> getLebelsOfNote(String token, long noteId) {
		long userId = userToken.decodeToken(token);
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			throw new UserException(-6, "User does not exist");
		}
		Optional<Note> note = notesRepository.findById(noteId);
		if(!note.isPresent()) {
			throw new UserException(-6, "Note does not exist");
		}
		List<Label> lebel = note.get().getListLabel();
		
		List<LabelDto> listLabel = new ArrayList<>();
		for(Label noteLabel : lebel) {
			LabelDto labelDto = modelMapper.map(noteLabel, LabelDto.class);
			listLabel.add(labelDto);
		}
		return listLabel;
		
	}
	
	
	@Override
	public List<NotesDto> getNotesOfLabel(String token, long labelId) {
		long userId = userToken.decodeToken(token);
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()) {
			throw new UserException(-6, "Invalid input");
		}
		Optional<Label> label = labelRepository.findById(labelId);
		if(!label.isPresent()) {
			throw new UserException(-6, "No lebel exist");
		}
		List<Note> notes = label.get().getNotes();
		List<NotesDto> listNotes = new ArrayList<>();
		for (Note usernotes : notes) {
			NotesDto noteDto = modelMapper.map(usernotes, NotesDto.class);
			listNotes.add(noteDto);
		}
		return listNotes;
	}
	
	
}
