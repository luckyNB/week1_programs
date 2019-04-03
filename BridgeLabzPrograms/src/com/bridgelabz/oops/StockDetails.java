package com.bridgelabz.oops;
/***************************************************************************
 * @author : Laxman Bhosale.
 * @purpose: Program for reading stock names,Number of shares and share price
 *            total price of particular share is calculated using formula
 ****************************************************************************/



import java.io.File;



import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockDetails {

static int count=0;
	public static void main(String[] args) {
//	Scanner scanner=new Scanner(System.in);
		String Path="/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/stock.json";
		
		File file=new File(Path);
		ObjectMapper mapper=new ObjectMapper();
		try {
			JsonNode rootNode=mapper.readTree(file);
			JsonNode inventory=rootNode.get("Stock");
			System.out.println("======Stocks Details=======");
			for(JsonNode node:inventory) {
				String name=node.path("Stock_Name").asText();
				int  share=node.path("Number_of_shares").asInt();
				int price=node.path("Share_Prize").asInt();
System.out.println("********************************************");
				System.out.println(++count+")"+"Name:"+name+"\nPrice: "+price+"\nShare: "+share);
				System.out.println("total: "+price*share+" Rs"+"\n");	
			
			}
			System.out.println("********************************************");

		}catch(IOException e) {
			System.out.println(" "+e.getMessage());
			e.printStackTrace();
		}
		

	}
}