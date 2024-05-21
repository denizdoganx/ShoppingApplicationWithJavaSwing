import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IDandPasswords {

	private HashMap<String, String> idAndPasswords;
	private HashMap<String, Customer> idAndCustomer;
	private final String fileName = "CustomerDatabase.txt";

	public IDandPasswords() throws IOException {
		idAndPasswords = new HashMap<String, String>();
		idAndCustomer = new HashMap<String, Customer>();
		fillInTheIdAndPasswords();
	}

	public HashMap<String, String> getIDandPasswords() {
		return idAndPasswords;
	}

	public HashMap<String, Customer> getCustomerInformations() {
		return idAndCustomer;
	}

	private boolean fillInTheIdAndPasswords() throws IOException {

		File file = new File(fileName);
		if (!file.exists()) {
			return false;
		} else {
			FileReader fReader = new FileReader(file, Charset.forName("utf-8"));
			BufferedReader bReader = new BufferedReader(fReader);
			String line;
			String[] splittedInfoForIDAndPasswords = null, splittedInfoForIDAndCustomer= null;
			int index = 0;
			while ((line = bReader.readLine()) != null) {
				if (index % 2 == 0) {
					splittedInfoForIDAndPasswords = line.split(" ");
					idAndPasswords.put(splittedInfoForIDAndPasswords[0], splittedInfoForIDAndPasswords[1]);
				} else {
					splittedInfoForIDAndCustomer = line.split(" ");
					Customer customer =  new Customer(splittedInfoForIDAndCustomer[0], splittedInfoForIDAndCustomer[1], splittedInfoForIDAndCustomer[2], splittedInfoForIDAndCustomer[3], null);
					customer.setUsername(splittedInfoForIDAndPasswords[0]);
					customer.setPassword(splittedInfoForIDAndPasswords[1]);
					idAndCustomer.put(customer.getUsername(), customer);
				}
				index++;
			}
			bReader.close();
			return true;
		}
	}
	public void putInTheDatabase(Customer newCustomer) throws IOException {
		idAndPasswords.put(newCustomer.getUsername(), newCustomer.getPassword());
		idAndCustomer.put(newCustomer.getUsername(), newCustomer);
		updateDatabase();

	}
	public Customer getCustomerInformations(String key) {
		return (Customer)idAndCustomer.get(key);
	}
	
	public void updateDatabase() throws IOException {
		File file = new File(fileName);
		FileWriter fWriter = new FileWriter(file, Charset.forName("utf-8"));
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		Set<String> setOfUserIDs = idAndCustomer.keySet();
		Iterator<String> iteratorOfUserIDsIterator = setOfUserIDs.iterator();
		
		Collection<Customer> collectionOfCustomers = idAndCustomer.values();
		Iterator<Customer> iteratorOfCustomers = collectionOfCustomers.iterator(); 
		
		while(iteratorOfUserIDsIterator.hasNext()) {
			String userID = iteratorOfUserIDsIterator.next();
			Customer temp = iteratorOfCustomers.next();
			bWriter.append(userID);
			bWriter.append(" ");
			bWriter.append(temp.getPassword());
			bWriter.newLine();
			bWriter.append(temp.getName());
			bWriter.append(" ");
			bWriter.append(temp.getSurname());
			bWriter.append(" ");
			bWriter.append(temp.getPhone());
			bWriter.append(" ");
			bWriter.append(temp.getEmail());
			bWriter.newLine();
		}
		bWriter.close();
	}
}
