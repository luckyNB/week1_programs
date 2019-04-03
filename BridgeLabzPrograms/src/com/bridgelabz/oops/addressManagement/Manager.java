package com.bridgelabz.oops.addressManagement;

import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;

public interface Manager {
	// methods of addressbook
		void save1(PersonDetails person, String addressBook) throws JsonMappingException, IOException;
		void add() throws JsonMappingException, IOException;
		void delete(String name, String addressBook) throws JsonMappingException, IOException;
		void sortByName(String bookName) throws JsonMappingException, IOException;
		void sortByZip(String bookName) throws JsonMappingException, IOException;
		void print(String bookName, String name) throws JsonMappingException, IOException;
		

}
