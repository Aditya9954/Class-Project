package com.jbk;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmployeeHandler extends DefaultHandler {

	public void startDocument()throws SAXException{
		System.out.println("Start Document");
	}
	public void endDocument()throws SAXException{
		System.out.println("end Document");
		}
	public void startElement(String uri,String localName,String qName,Attributes attributes )throws SAXException{
		if(attributes.getLength()>0) {
			System.out.println("</"+qName+">");
			for(int i=0;i<attributes.getLength();i++) {
				System.out.println(attributes.getQName(i));
				System.out.println("="+"\""+attributes.getValue(i)+"\"");
			}
			System.out.println(">");
			
		}else {
			System.out.println("<+qName>");
		}
	}
	public void endElement(String uri,String localName,String qName )throws SAXException{
	System.out.println("</"+qName+">");
	}
	
	public void characters(char[]ch,int start,int length)throws SAXException{
	System.out.print( ch);
	System.out.println(start);
	System.out.println(length);
	}
	}