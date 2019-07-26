package com.jbk;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SAX {
	
	public static void main(String[] args) throws ParserConfigurationException,SAXException,IOException {
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		SAXParser saxParser=saxParserFactory.newSAXParser();
		saxParser.parse("D:\\JBK Task\\Dom-Sax\\src\\com\\jbk\\employee.xml",new EmployeeHandler());
	}

}
