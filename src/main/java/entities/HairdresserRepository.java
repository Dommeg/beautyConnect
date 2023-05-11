package BeautyConnect;

/*Repository class is responsible for interacting with a data store, such as a database, 
 * to retrieve or persist data. 
 * It provides a layer of abstraction between the data store and the rest of the application, 
 * so that the application can be more easily switched to a different data store or data access technology. 
 * Repository classes typically provide methods for creating, updating, deleting, and retrieving data 
 * from the store. 
 * In our case, a HairdresserRepository provides methods for querying hairdressers (professionnels) by ID, 
 * name, or email address.
 */

import java.util.List;

public class HairdresserRepository {
	
	    public Hairdresser findById(int id) {
		
	    return new Hairdresser(id, "name", "email", "phone", List<String>services);
	}


	        
	    public void save(Hairdresser hairdresser) {
			//;
		}
	    public void update(Hairdresser hairdresser) {
	    	//;
	    	
		}
	    
	    //method that inserts a Hairdresser (as an object) into a data store
	    public void insert(Hairdresser hairdresser) {
	    	//JDBC;
	    	
		}
	    
	    public void deleteById(int id){
	//;

	    }
}
