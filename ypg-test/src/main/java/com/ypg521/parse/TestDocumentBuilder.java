package com.ypg521.parse;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试  javax.xml.parsers 解析xml
 */
public class TestDocumentBuilder {

	@Test
	public void testRead() throws ParserConfigurationException, IOException, SAXException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbf.newDocumentBuilder();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("parse/student.xml");
		Assert.assertTrue(inputStream != null && inputStream.available() > 0);
		Document document = builder.parse(inputStream);
		Element rootElement = document.getDocumentElement();
		Assert.assertTrue(rootElement != null);
		NodeList nodeList = rootElement.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);




		}


	}


}
