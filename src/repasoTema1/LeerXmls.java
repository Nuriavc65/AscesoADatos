package repasoTema1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LeerXmls {

	public static void main(String[] args) {
		//clase que nos proporciona herramientas para el xml
		DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
		
		try {
			DocumentBuilder constructorXml = factory.newDocumentBuilder();
			//almacenamos el documento
			Document document = (Document) constructorXml.parse(new File(".\\xmlFichreos\\Empleados.xml"));
			document.getDocumentElement().normalize();
			
			// alamacenamos todos los elementos que se llamen <empleado>
			NodeList empleados = document.getElementsByTagName("empleado");
			
			// con el for recorro la lista de empleados y lo almaceno en elemento de Node 
			for(int i =0;i<empleados.getLength();i++) {
				Node elemento = empleados.item(i); 
				//se asegura que el tipo de Nodo es un Tag < >
				if(elemento.getNodeType() == Node.ELEMENT_NODE){
					Element empleado = (Element) elemento; // para meter <empleado> en element
					//imprimir los contenidos de empleado
                    System.out.printf("ID: %s %n", empleado.getElementsByTagName("id").item(0).getTextContent());
                    System.out.printf("Apellido: %s %n", empleado.getElementsByTagName("apellido").item(0).getTextContent());
                    System.out.printf("Departamento: %s %n", empleado.getElementsByTagName("dep").item(0).getTextContent());
                    System.out.printf("Salario: %s %n", empleado.getElementsByTagName("salario").item(0).getTextContent());

				}
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	

}
