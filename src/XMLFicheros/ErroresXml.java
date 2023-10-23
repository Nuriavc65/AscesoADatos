package XMLFicheros;

import java.io.IOException;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class ErroresXml {

	public static void main(String[] args) throws ParserConfigurationException {
		String ruta ="\"C:\\Users\\nuria\\OneDrive\\Escritorio\\xml.txt\"";
		if(args.length != 1) {
			System.out.println("Debe pasar un parametro(El fichero)");
		}
		String fichero = ruta +args[0];
		System.out.println("Analizado: " +fichero + "\n");
		try {
			SAXParserFactory sFactory = SAXParserFactory.newInstance(); //instancia del analizador
			SAXParser parse = sFactory.newSAXParser(); //analiza el documento
		
			XMLReader xmlparser = parse.getXMLReader();
			xmlparser.parse(new InputSource(fichero));
			System.out.println("fin del analisis");
			
		}catch (IOException e) {
			System.out.println(e);
		}catch (SAXException e) {
			System.out.println(e);
		}
	}

}
