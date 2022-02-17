package com.apipothi.propertiesreader.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service	
public class Bookservice {
	
	/*If the data comming from application.properties 
	*file is equala to "apipothi" then output will be
	*"My apipothi" else "OUR APIPOTHI"*/
	
	//@Value("${apipothi.bookdescription: My Default API POTHI VALUE}")
	
	@Value("${apipothi.bookdescription}'==' ?'my apipothi' : 'your apipothi'}")
	
	private String defaultbookDescription;
	
	@Value("${apipothi.bookid : 11,12,13,14,15,16,17}")
	private int[] bookid;
	
	@Value("${apipothi.bookprice : 100 , 200 , 300 , 400, 500}")
	private List<Integer> bookprice;
	
	@Value("${apipothi.booksname : APIPOHIJAVA , APIPOTHIJAVA9 , APIPOTHIREST , APIPTHJISPRING, APIPOHIPYTHON	}")
	private Set<String> bookname;
	
	@Value("#{${apipothi.bookswitchprice :{APIPOHIJAVA: '90',APIPOTHIJAVA9: '91',APIPOTHIREST: '92',APIPTHJISPRING: '93',APIPOHIPYTHON}}}")
	Map<String,Integer> bookswitchprice;
	
	
	@Value("${apipothi.booknotabalable : false}")
	private boolean <Integer> booknotabalable;
	
	
	

	
	
	public void getDefaultDataFormPropertie() {
	
 System.out.println("START***-Bookservice-getDefaultDataFromProperties() -***");
 
 System.out.println("Book Description As String " +defaultbookDescription);
 
 System.out.println("Book Id As int Array -> " + Arrays.toString(bookid));
 
 System.out.println("Book Price As int List -> " +bookprice);
 
 System.out.println("Book Price As int set -> " +bookname);
 
 System.out.println("Book Name with price As  Map -> " +bookswitchprice);
 
 System.out.println("Book is there as Boolean -> " + booknotabalable);
 System.out.println("END***-Bookservice-getDefaultDataFromProperties() -***");
 
		
		// TODO Auto-generated method stub
		
	}

}
