package com.bridgelabz.oops.commercialdataprocessing;

/***************************************************************************
 * @author : Laxman Bhosale
 * @purpose: Program for storing the symbol which are sold into the stack
 *           using generic stack data structures
 ***************************************************************************/
import com.bridgelabz.data_structure.calendar.Stack;

import java.io.File;

import java.io.IOException;
import java.util.LinkedList;
import java.util.StringJoiner;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
//import java.util.Stack;

//import com.bridgelabz.oops.ComPojo;

public class StoreSymbolPurchasedInStack {
	public static void main(String args[]) throws JsonMappingException, IOException {
		String companyName;
		String symbol;
		String value;
		ObjectMapper mapper = new ObjectMapper();
		Stack<String> stack = new Stack<>(); // create object of stack class
		// read data from file to linked list
		LinkedList<CommercialPOJO> data1 = mapper.readValue(new File(
				"/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/commercialdataprocessing/commercialStockData.json"),
				new TypeReference<LinkedList<CommercialPOJO>>() {
				});
		int i = 0;
		int size = data1.size();
		if (size == 0) // if file is empty
			System.out.println("\nno data found");
		// if file is not empty then print details
		else {
//StringBuffer symbolWithData=null;
			for (i = 0; i < data1.size(); i++) {
				companyName = (String) data1.get(i).getCompanyName().trim();
				symbol = data1.get(i).getSymbol().trim();
				value = data1.get(i).getSymbolValue();
				StringJoiner joiner = new StringJoiner(" ");
				joiner.add(companyName + "    ");
				joiner.add(symbol + "    ");
				joiner.add(value + "    ");
				// System.out.println("SysmbolWithData:"+symbolWithData);
				stack.push(joiner.toString()); // add data to stack
			}
		}
		System.out.println("company\t symbol\tSymbolvalue\n");
		stack.display();
		// System.out.println(str);
	}
}
