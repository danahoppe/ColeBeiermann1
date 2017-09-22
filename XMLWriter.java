

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class XMLWriter {
	
	private XStream xstream = null;
	
	public XMLWriter() {
		this.xstream = new XStream();
		xstream.alias("person", Person.class);
		xstream.alias("email", String.class);
	}


	public void xmlPersonConverter(List<Person> persons) {
        File xmlOutput = new File("data/Persons.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		//xstream.alias("person", Person.class); 
		for(Person aPerson : persons) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(aPerson);
			xmlPrintWriter.write(personOutput);
		}
		xmlPrintWriter.close();	
	}
	
	public void xmlCustomerConverter(List<Customer> customers) {
        File xmlOutput = new File("data/Customers.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		//xstream.alias("customer", Customer.class); 
		for(Customer aCustomer : customers) {
			// Use toXML method to convert Customer object into a String
			String customerOutput = xstream.toXML(aCustomer);
			xmlPrintWriter.write(customerOutput);
		}
		xmlPrintWriter.close();	
	}
	
	public void xmlProductConverter(List<Product> products) {
        File xmlOutput = new File("data/Products.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		//xstream.alias("product", Product.class); 
		for(Product aProduct : products) {
			// Use toXML method to convert Product object into a String
			String productOutput = xstream.toXML(aProduct);
			xmlPrintWriter.write(productOutput);
		}
		xmlPrintWriter.close();	
	}
}
