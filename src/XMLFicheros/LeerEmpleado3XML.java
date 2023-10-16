package XMLFicheros;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeerEmpleado3XML {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder buldier = factory.newDocumentBuilder();
			Document document = (Document) buldier.parse(new File(".\\xmlFichreos\\Empleados.xml"));
			document.getDocumentElement().normalize();
			System.out.printf("elemento raiz: %s %n", document.getDocumentElement().getNodeName());
			  NodeList empleados = document.getElementsByTagName("empleado");
	            System.out.printf("Nodos empleado a recorrer: %d %n", empleados.getLength());

	            for (int i = 0; i < empleados.getLength(); i++) {
	                Node emple = empleados.item(i);

	                if (emple.getNodeType() == Node.ELEMENT_NODE) {
	                    Element ele = (Element) emple;
	                    System.out.printf("ID: %s %n", ele.getAttribute("id"));
	                    System.out.printf("Apellido: %s %n", ele.getElementsByTagName("apellido").item(0).getTextContent());
	                    System.out.printf("Departamento: %s %n", ele.getElementsByTagName("dep").item(0).getTextContent());
	                    System.out.printf("Salario: %s %n", ele.getElementsByTagName("salario").item(0).getTextContent());
	                }
	            }
	        } catch (ParserConfigurationException e) {
	            throw new RuntimeException(e);
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        } catch (SAXException e) {
	            throw new RuntimeException(e);
	        }
	}
}
