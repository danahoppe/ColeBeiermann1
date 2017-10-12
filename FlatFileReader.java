
public class FlatFileReader {

  	public static List<Customer> parseDataFile(){
		List<Customer> result = new ArrayList<Customer>();
		try {
			File f = new File("data/Customers.dat");
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Customer customer0 = null;
					String Etokens[] = line.split(";");
					String customerCode = Etokens[1];
					String customerType = Etokens[2];
					String primaryContact = Etokens [3];
					String addressTokens[] = Etokens[4].split(",");
						String street = addressTokens[0];
						String city = addressTokens[1];
						String state = addressTokens[2];
						int zip = Integer.parseInt(addressTokens[3]);
						String country = addressTokens[4];
					Address address0 = new Address(street, city, state, zip, country);
					
					customer0 = new Customer(customerCode, customerType, primaryContact, address0);
							
					result.add(customer0);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
		
	public static List<Person> parseDataFile(){
		List<Person> result = new ArrayList<Person>();
		try {
			File f = new File("data/Persons.dat");
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Person person0 = null;
					String Ptokens[] = line.split(";");
					String nameTokens[] = Ptokens[1].split(",");
						String lastName = nameTokens[0];
						String firstName = nameTokens[1];
					String addressTokens[] = Ptokens[2].split(",");
						String street = addressTokens[0];
						String city = addressTokens[1];
						String state = addressTokens[2];
						int zip = Integer.parseInt(addressTokens[3]);
						String country = addressTokens[4];
					Address address0 = new Address(street, city, state, zip, country);
					String email[] = Ptokens[3].split(",");
					
					person0 = new Person(lastName, firstName, address0, email[]);
					
					result.add(person0);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public static List<Product> parseDataFile() {
		List<Product> result = new ArrayList<Product>();
		try {
			File f = new File("data/Products.dat");
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Product product0 = null;
					String Ptokens[] = line.split(";");
					String productCode = Ptokens[0];
					String productType = Ptokens[1];
					if(productType == "M") {
						String dateTime = Ptokens[2];
						String name = Ptokens[3];
						String addressTokens[] = Ptokens[4].split(",");
							String street = addressTokens[0];
							String city = addressTokens[1];
							String state = addressTokens[2];
							int zip = Integer.parseInt(addressTokens[3]);
							String country = addressTokens[4];
						Address address0 = new Address(street, city, state, zip, country);
						String screenNo = Ptokens[5];
						double pricePerUnit = Double.parseDouble(Ptokens[6]);
					}
					else if(productType == "S") {
						String name = Ptokens[2];
						String startDate = Ptokens[3];
						String endDate = Ptokens[4];
						double cost = Double.parseDouble(Ptokens[5]);
					}
					else if(productType == "P") {
						double parkingFee = Double.parseDouble(Ptokens[2]);
					}
					else if(productType == "R") {
						String name = Ptokens[2];
						double cost = Double.parseDouble(Ptokens[3]);
					}
					
					product0 = new Person(productType, name, address0, screenNo, pricePerUnit, dateTime, startDate, endDate, cost);
		
					result.add(product0);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
		
	}
	
	
	//Fix issues in code. Need proper class files.
	
	
	public static void main(String args[]) {
		
	//Add output code
	
	}
	
	

	
  
  
  
}
