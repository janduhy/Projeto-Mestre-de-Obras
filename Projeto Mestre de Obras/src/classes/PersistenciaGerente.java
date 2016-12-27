package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class PersistenciaGerente {
	private XStream xstream = new XStream(new DomDriver());
	private File arquivo = new File("gerente.xml");
	public void salvarGerente (Gerente gerente) {

		String xml = xstream.toXML(gerente);
		try {
			arquivo.createNewFile();					
			PrintWriter gravar = new PrintWriter(arquivo);
			gravar.print(xml);
			gravar.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}		
	}
	public Gerente recuperarGerente(){	
		try {
			if(arquivo.exists()){
				FileInputStream fis = new FileInputStream(arquivo);
				return (Gerente) xstream.fromXML(fis);
			} 
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return new Gerente();
	}	
}

