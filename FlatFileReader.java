

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FlatFileReader {
	// This Person ArrayList stores the Person objects 
	private ArrayList<Person> personList = new ArrayList<Person>();
	// This Customer ArrayList stores the Customer objects 
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	// This Customer ArrayList stores the Customer objects 
	private ArrayList<Product> productList = new ArrayList<Product>();

	public ArrayList<Person> readPersons() {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Persons.dat"));
			sc.nextLine(); // reads the number of records from the first line	


			while(sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				if(line.trim().length() > 0){


					String data[] = line.split(";"); // tokenizes the line and stores in a String array 

					// Stores the 4 array elements of each line into strings

					String personCode = data[0];
					String name = data[1];
					String fullAddress = data[2];
					String email = "";
					if(data.length>3){
					email = data[3];
					}

					// Creates an Address object
					String addressStr [] = fullAddress.split(",");
					String street = addressStr[0];
					String city = addressStr[1];
					String state = addressStr[2];
					String zip = addressStr[3];
					String country = addressStr[4];

					Address address = new Address(street,city,state,zip,country);

					// Creates a Person object
					Person person = new Person(personCode, name, address, email);

					// Adds the Person object into Person ArrayList
					personList.add(person);
				}
			}
			sc.close();
			return personList;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}	
	}

	public ArrayList<Customer> readCustomers() {

		Scanner sc = null;

		try {
			sc = new Scanner(new File("data/Customers.dat"));
			sc.nextLine(); // reads the number of records from the first line



			while(sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(";"); // tokenizes the line and stores in a String array 

				// Stores the 5 array elements of each line into strings
				String customerCode = data[0];
				String type = data[1];
				String contact = data[2];
				String name = data[3];
				String fullAddress = " ";
				if(data.length > 4) {
					fullAddress = data[4];
				}

				// Creates an Address object
				Address address = null;
				
				if(fullAddress.equals(" ")) {
					address = new Address("","","","","");
				}
				else {
					String addressStr [] = fullAddress.split(",");
					String street = addressStr[0];
					String city = addressStr[1];
					String state = addressStr[2];
					String zip = addressStr[3];
					String country = addressStr[4];

					address = new Address(street,city,state,zip,country);
				}

				//Finds the person object for contact
				Person contactPerson = null;
				for (int x=0; x < personList.size(); x++) {
					if(personList.get(x).getPersonCode().equals(contact)) {
						contactPerson = personList.get(x);
					}
				}

				// Creates a Customer object
				Customer customer = new Customer(customerCode,type,contactPerson,name,address);

				// Adds the Customer object into Customer ArrayList
				customerList.add(customer);
			}
			sc.close();
			return customerList;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public ArrayList<Product> readProducts(){
		Scanner sc = null;

		Product product = null;
		
		try {
			sc = new Scanner(new File("data/Products.dat"));
			sc.nextLine(); // reads the number of records from the first line	


			while(sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				if(line.trim().length() > 0){


					String data[] = line.split(";"); // tokenizes the line and stores in a String array 

					// Stores the 4 array elements of each line into strings

					String productCode = data[0];
					String type = data[1];
					
					if(type.equals("P")) {
						double parkingFee =  Double.parseDouble(data[2]);
						product = new ParkingPass(productCode, type, parkingFee);
					}
					else if(type.equals("M")) {
						String dateTime =  data[2];
						String movieName = data[3];
						String fullAddress = data[4];
						String screenNo = data[5];
						double pricePerUnit = Double.parseDouble(data[6]);
						
						String addressStr [] = fullAddress.split(",");
						String street = addressStr[0];
						String city = addressStr[1];
						String state = addressStr[2];
						String zip = addressStr[3];
						String country = addressStr[4];

						Address address = new Address(street,city,state,zip,country);
						
						product = new MovieTicket(productCode, type, dateTime, address,movieName, screenNo, pricePerUnit);
					}
					else if(type.equals("R")) {
						String name = data[2];
						double cost = Double.parseDouble(data[3]);
						
						product = new Refreshment(productCode, type, name, cost);
					}
					else if(type.equals("S")) {
						String name = data[2];
						String startDate = data[3];
						String endDate = data[4];
						double cost = Double.parseDouble(data[5]);
						product = new SeasonPass(productCode, type, name, startDate, endDate, cost);
					}
					

					// Adds the Product object into Person ArrayList
					productList.add(product);
				}
			}
			sc.close();
			return productList;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}	
		
	}

}


