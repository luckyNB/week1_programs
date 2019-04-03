package com.bridgelabz.oops;

import java.io.File;


/*********************************************************************
 * @author  :Laxman Bhosale

 * @purpose :Program for creating inventory managent system which contains
 *           wheats,rice,pulses as inventory  with price as per weight 
 *           Price of total inventory is calculated 
 **************************************************************************/

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManagement {
		public static void main(String[] args) {
			String Path="/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/MyJson.json";
			File file=new File(Path);
			
			
			
			ObjectMapper mapper=new ObjectMapper();
			try {
				JsonNode rootNode=mapper.readTree(file);
				JsonNode inventory=rootNode.get("Rice");
				System.out.println("=====ALL TYPES OF RICE ARE=====");
				for(JsonNode node:inventory)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
				JsonNode inventory1=rootNode.get("Pulses");
				
				System.out.println("====ALL TYPES OF PULSES====");
				for(JsonNode node:inventory1)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
				
				JsonNode inventory2=rootNode.get("Wheat");
				System.out.println("====ALL TYPES OF WHEATS ARE====");
				for(JsonNode node:inventory2)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
			
			} catch (IOException e) {
				System.out.println(""+e.getMessage());		
				e.printStackTrace();
			}
		
	}
}

