package com.jbk;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Dom {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document document=builder.parse("D:\\JBK Task\\Dom-Sax\\src\\com\\jbk\\employee.xml");
		
		Element element=document.getDocumentElement();
		System.out.println(element.getNodeName());
		NodeList list=element.getChildNodes();
		for(int i=0;i<list.getLength();i++) {
			Node node=list.item(i);
			if(node.getNodeType()==node.ELEMENT_NODE) {
			System.out.println(node.getNodeName()+"-->"+node.getTextContent());;
			}}
		
		
			
		}catch(ParserConfigurationException|SAXException|IOException e) {
			e.printStackTrace();
	
	}
	}
}
	
