package XMLFicheros;

import java.util.jar.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HandlerTelefonoPersona extends DefaultHandler {
	private StringBuilder value;

	public HandlerTelefonoPersona() {
		this.value = new StringBuilder();

	}

	public void startDocument() {
		System.out.println("comienzo de persoterl.xml");
	}

	public void endDocument() {
		System.out.println("Final personatls.xml");
	}

	public void startElement(String Uri, String localName, String qName, Attributes atribbutes) throws SAXException {
		this.value.setLength(0);
		if (qName.equals("persona")) {
			String tfno = atribbutes.getValue("telefono");
			System.out.println("atributo telefon: " + tfno);
		}
	}

	public void characters (char ch[],int start, int length) throws SAXException{
		this.value.append(ch,start,length);
	}
	public void endElement(String uri, String localName, String qName) throws SAXException{
		switch(qName) {
		case "persona":
			System.out.println("");
			break;
		case "nombre":
			System.out.println("Nombre: " +this.value.toString());
			break;
		case "edad":
			System.out.println("edad: " +this.value.toString());
			break;
		}
	}
		
	}


