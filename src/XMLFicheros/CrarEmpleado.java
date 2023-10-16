package XMLFicheros;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import javax.naming.spi.DirStateFactory.Result;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CrarEmpleado {
	public static void main(String[] args) throws IOException {
		File fic = new File(".\\xmlFichreos\\AleatorioEmple.dat");
		RandomAccessFile file = new RandomAccessFile(fic, "r");
		int id, dep, posicion = 0;
		Double salario;
		char apellido[] = new char[10], aux;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implemtation = builder.getDOMImplementation();
			Document document = implemtation.createDocument(null, "Empleados", null);
			document.setXmlVersion("1.0");

			for (;;) {
				file.seek(posicion);
				id = file.readInt();
				for (int i = 0; i < apellido.length; i++) {
					aux = file.readChar();
					apellido[i] = aux;
				}
				String apellidos = new String(apellido);
				dep = file.readInt();
				salario = file.readDouble();

				if (id > 0) {
					Element raiz = document.createElement("empleado");
					document.getDocumentElement().appendChild(raiz);

					CrearElemento("id", Integer.toString(id), raiz, document);
					CrearElemento("apellido", apellidos.trim(), raiz, document);
					CrearElemento("dep", Integer.toString(dep), raiz, document);
					CrearElemento("salario", Double.toString(salario), raiz, document);
				}
				posicion = posicion + 36;
				if (file.getFilePointer() == file.length())
					break;
			}
			Source source = new DOMSource(document);
			StreamResult result = new StreamResult(new java.io.File(".\\xmlFichreos\\Empleados.xml"));
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);

		} catch (Exception e) {
			System.err.println("error: " + e);
		}
		file.close();

	}

	private static void CrearElemento(String datoEmple, String valor, Element raiz, Document document) {
		Element elem = document.createElement(datoEmple);
		Text text = document.createTextNode(valor);
		raiz.appendChild(elem);
		elem.appendChild(text);
	}

}
