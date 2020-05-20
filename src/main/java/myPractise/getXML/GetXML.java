package myPractise.getXML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GetXML {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String path0 = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String path = GetXML.class.getResource("").getPath()+"xml.xml";
		System.out.println(path);
		File file = new File(path);
//		System.out.println(file.isFile());
//		try(InputStreamReader  w = new InputStreamReader(new FileInputStream(file));BufferedReader br = new BufferedReader(w)){
//			String size = null;
//			while((size = br.readLine()) != null){
//				System.out.println(size);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();   
		 DocumentBuilder builder = factory.newDocumentBuilder();   
		 Document doc = builder.parse(file);   
		 NodeList nl = doc.getElementsByTagName("VALUE"); 
		 for (int i = 0; i < nl.getLength(); i++) {
			 System.out.println(doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
			 System.out.println(doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
		}
	}
}
