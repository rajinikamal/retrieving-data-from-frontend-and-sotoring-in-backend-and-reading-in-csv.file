package com.jsoup;

import com.csvreader.CsvWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup; 
import org.jsoup.nodes.Document; 
import org.jsoup.nodes.Element; 
import org.jsoup.select.Elements;

import com.model.Dao;
import com.model.Model; 
 
public class StaplesScraper { 
   public static void main(String[] args){  
	   String html = "https://www.quill.com/hanging-file-folders/cbk/122567.html";
	   
	   try {
		   Document doc = Jsoup.connect(html).get();
		   
		   Elements price = doc.getElementsByClass("price-size");
		   Elements name = doc.getElementsByClass("search-product-name-wrap");
		   Elements Item = doc.getElementsByClass("LEffortFindNum");
		   
		   Elements desc = doc.getElementsByClass("sku-bullet-list");
		   Element cate = doc.getElementById("SearchTerm");
		   
		   
//		   for (Element p : price) {
//		       System.out.println(p.text());
//		   }
//		   
//		   for (Element n : name) {
//		       System.out.println(n.text());
//		   }
//		   for (Element I : Item) {
//		       System.out.println(I.text());
//		   }
//		  
//		   for (Element des : description) {
//			   System.out.println("des :" + des.text());
//		   }
//		   System.out.println("category  :"+ cate.text());
		   
//		   for (int i = 0; i < price.size(); i++)
//		   {
//			   String nameAndmodel = name.get(i).text();
//			   String pprice = price.get(i).text();
//			     String item = Item.get(i).text();
//			    String category = cate.text();
//			    String description = desc.get(i).text();
//			    
//			    Model.insert(nameAndmodel, pprice, item, category, description);
//		   }
		   
		   
		   
		   Model m = new Model();
		   
		   ArrayList<Dao> da = m.select(10);

	    
	        FileWriter writer = new FileWriter("output.csv", false);
	        CsvWriter csvWriter = new CsvWriter(writer, ',');

	        
	        

	        
	        for (Dao d : da) {
	        	csvWriter.write(d.getId());
	            csvWriter.write(d.getPname());
	            csvWriter.write(d.getPprice());
	            csvWriter.write(d.getInum());
	            csvWriter.write(d.getPcate());
	            csvWriter.write(d.getPdes());
	            csvWriter.endRecord();
	        }

	        
	        csvWriter.close();
		   
	        System.out.println("go and see ur output....");
		   
		   
		   
		   
		  
		   	  
	} catch (Exception e) {
		
	}
   }
} 


