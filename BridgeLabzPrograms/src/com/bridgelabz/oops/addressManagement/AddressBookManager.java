package com.bridgelabz.oops.addressManagement;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.Utility;


class AddressBookManager implements Manager {
	static ObjectMapper mapper = new ObjectMapper(); //mapper to translate data
	static String firstName;
	static String lastName;
	static String bookName;

	// create new address book
	public static boolean createAddressBook(String name) throws IOException, Exception {
		// create file with user provided name
		File file = new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + name + ".json");

		// check file created or not
		boolean result = file.createNewFile();

		return result;

	}

	// add person in address book
	public static void addPersonInAddressBook(String addressBook, String firstName, String lastName)
			throws JsonMappingException, IOException {

		if (new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook)
				.exists() == false) {
			System.out.println("invalid address book");
			return;
		}

		PersonDetails person = new PersonDetails();
		Address address = new Address();
		PhoneNumber phone = new PhoneNumber();
		System.out.println("Enter street:");
		String street = Utility.inputStringValue();
		System.out.println("Enter city:");
		String city = Utility.inputStringValue();
		System.out.println("Enter State:");
		String state = Utility.inputStringValue();
		System.out.println("Enter zip");
		int zip = Utility.getInt();
		System.out.println("Enter mobile number:");
		long phoneNumber = Utility.getLong();
		phone.setMobileNumber(phoneNumber);
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setPhoneNumber(phone);
		AddressBookManager manager = new AddressBookManager();
		manager.save1(person, addressBook);
	}

	// to edit person details
	public static void editPerson(String name, String addressBook) throws JsonMappingException, IOException {
		int count = 0;
		int tempCount = 0;
		String temp = "";
		int stop = 0;
		//read data from file and store it in linked list
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		for (PersonDetails person : details) {
			if (person.getFirstName().equals(name)) { //check if entered name is present or not
				tempCount = count;
			}
			count++;
		}
		while (stop != 2) {
			System.out.println("1. for edit first name");
			System.out.println("2. for edit last name");
			System.out.println("3. for edit address and phone number");
			count = Utility.getInt();
			switch (count) {
			case 1:
				//change first name
				System.out.println("Enter new first name :");
				firstName = Utility.inputStringValue();
				details.get(tempCount).setFirstName(firstName);  //set new name
				break;
			case 2:
				//change last name
				System.out.println("Enter new last name :");
				lastName = Utility.inputStringValue();
				details.get(tempCount).setLastName(lastName); //set new last name
				break;
			case 3:
				//edit address
				System.out.println("press \n 1. for edit street");
				System.out.println("2. for edit city");
				System.out.println("3. for edit state");
				System.out.println("4 . for edit zip code");
				System.out.println("5 . for edit phone number");
				int choice = Utility.getInt();
				if (choice == 1) {
					System.out.println("Enter street:");
					temp = Utility.inputStringValue();
					details.get(tempCount).getAddress().setStreet(temp); //change street name
				}
				if (choice == 2) {
					System.out.println("Enter city:");
					temp = Utility.inputStringValue();
					details.get(tempCount).getAddress().setCity(temp); //change city name

				}
				if (choice == 3) {
					System.out.println("Enter state:");
					temp = Utility.inputStringValue();
					details.get(tempCount).getAddress().setState(temp); //change city name

				}
				if (choice == 4) {
					System.out.println("Enter zip:");
					int zip = Utility.getInt();
					details.get(tempCount).getAddress().setZip(zip);//change zip
					;

				}
				if (choice == 5) {
					System.out.println("Enter mobile number:");
					Long phoneNumber = Utility.getLong();
					details.get(tempCount).getPhoneNumber().setMobileNumber(phoneNumber); //change mobile number

				}
			}
			System.out.println("for stop press 2. or for continue press any number");
			stop = Utility.getInt();
		}
		if (stop == 2) {
			//write data to file
			mapper.writeValue(
					new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
					details);
		}
	}

	// save details after entering all data into file
	public void save1(PersonDetails person, String addressBook) throws JsonMappingException, IOException {

		if (new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook)
				.length() == 0) {
			LinkedList<PersonDetails> newPerson = new LinkedList<>();
			newPerson.add(person);
			// System.out.println(newPerson);
			mapper.writeValue(
					new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
					newPerson);
			if (new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook)
					.length() != 0) {
				System.out.println("data added successfully");
			} else {
				System.out.println("unsuccessful");
			}
		} else {
			long preFileLength = new File(
					"/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook).length();
			LinkedList<PersonDetails> multiple = mapper.readValue(
					new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
					new TypeReference<LinkedList<PersonDetails>>() {
					});
			multiple.add(person);
			mapper.writeValue(
					new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
					multiple);
			long afterWriteLength = new File(
					"/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook).length();
			if (preFileLength < afterWriteLength) {
				System.out.println("data added successfully");
			} else {
				System.out.println("data not fill in file");
			}
		}
	}

	
	//to add new data
	public void add() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter person first name:");
		firstName = Utility.getString();
		System.out.println("Enter last name");
		lastName = Utility.getString();
		System.out.println("Enter address book name");
		bookName = Utility.getString();
		addPersonInAddressBook(bookName, firstName, lastName);
	}

	// delete person from address book
	public void delete(String name, String addressBook) throws JsonMappingException, IOException {
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		int count = 0;
		boolean result = true;
		// to remove the given person
		for (PersonDetails person : details) {
			if (person.getFirstName().equals(name)) { //if name is present then delete
				details.remove(count);
				System.out.println("person successfully removed");
				mapper.writeValue(
						new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
						details);
			}
			count++;
		}
	// to check whether the person is removed or not
		for (PersonDetails person : details) {
			if (person.getFirstName().equals(name)) {
				result = false;
			}
		}
		if (result == true) {
			System.out.println("person successfully remove");
		}
	}

	//sort data by name
	public void sortByName(String addressBook) throws JsonMappingException, IOException {

		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		LinkedList<String> name = new LinkedList<>();
		int count = 0;
		for (PersonDetails person : details) {
			name.add(person.getFirstName());

		}
		// string array to store named for sorting purpose
		String names[] = new String[name.size()];

		// loop for store linked list object in an array
		for (String value : name) {
			names[count] = value;
			count++;
		}
		Arrays.sort(names);

		System.out.println("sort by first name");

		// loop to print sorted data by name
		// count = 0;
		for (String s : names) {
			int count2 = 0;
			while (count2 < details.size()) {
				if (details.get(count2).getFirstName().equals(s)) {
					System.out.println(details.get(count2));
				}
				count2++;
			}

		}
	}
//sort data by zip
	public void sortByZip(String addressBook) throws JsonMappingException, IOException {
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		LinkedList<Integer> zip = new LinkedList<>();
		int count = 0;
		for (PersonDetails person : details) {
			zip.add(person.getAddress().getZip());

		}
		int zipArray[] = new int[zip.size()];
		for (int value : zip) {
			zipArray[count] = value;
			count++;
		}
		Arrays.sort(zipArray);

		System.out.println("sort by zip");
		// count = 0;

		for (int s : zipArray) {
			int count2 = 0;
			while (count2 < details.size()) {
				if (details.get(count2).getAddress().getZip() == s) {
					System.out.println(details.get(count2));
				}
				count2++;
			}

		}

	}

	// print person details
	public void print(String addressBook, String name) throws JsonMappingException, IOException {
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressBook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		for (PersonDetails person : details) {
			if (person.getFirstName().equals(name)) {
				System.out.println(person);
			}
		}
	}

	// to see list of address book in folder
	public static File[] openFile() {
		File folder = new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/");
		return folder.listFiles();
	}
	
	//print all file names
	public static void printFileNames()
	{
		File file[] = openFile(); // store file names from given location by calling openFile method
		System.out.println("\ngot following json files at mentioned location...\nplz select proper one:");
		for (File file1 : file) {
			String name = file1.getName();
			if (name.contains(".json")) //to print only json files
				System.out.println(name); // display files at that location
		}
		System.out.println();
	}
	
//print details
	public static void openAddressbook(String addressbook) throws JsonMappingException, IOException {
		LinkedList<PersonDetails> details = mapper.readValue(
				new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/addressManagement/" + addressbook),
				new TypeReference<LinkedList<PersonDetails>>() {
				});
		System.out.println(details);

	}

}
