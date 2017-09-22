

import java.util.List;


public class DataConverter {

	public static void main(String[] args) {
		
		// Create a FlatFileReader object
		FlatFileReader fr = new FlatFileReader();
		
		/* fr Reads data from the flat file;
		 * Creates Person/Customer/Product objects; and
		 * Stores objects in respective ArrayList
		 */
		List<Person> personList = fr.readPersons();
		
		
		List<Customer> customerList = fr.readCustomers();
		
		
		List<Product> productList = fr.readProducts();
		
		
		// Write Person ArrayList into a Json file
		JsonWriter jWriter = new JsonWriter();
		jWriter.jsonPersonConverter(personList);
		jWriter.jsonCustomerConverter(customerList);
		jWriter.jsonProductConverter(productList);
		
		// Write Person ArrayList into an XML file
		 XMLWriter xmlWriter = new XMLWriter();
	     xmlWriter.xmlPersonConverter(personList);
	     xmlWriter.xmlCustomerConverter(customerList);
	     xmlWriter.xmlProductConverter(productList);
	     
	}
}
