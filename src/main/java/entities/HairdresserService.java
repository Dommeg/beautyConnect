package BeautyConnect;

/*A service class is responsible for implementing the business logic of an application. 
 * It typically receives data from a controller or another service, performs some operations on that data, 
 * and then returns the results to the caller.
 *  Service classes may interact with multiple repositories to retrieve or persist data. 
 *  In our case, a HairdresserService provides methods for creating, updating, and deleting hairdressers
 *  (professionnels), as well as for retrieving information on professionnel.
 */

public class HairdresserService {
	
	private HairdresserRepository repository;
	
	public HairdresserService() {
		this.repository = new HairdresserRepository();
	}
	
	//insert a new hairdresser (as an object) using the HairdresserRepository class:
	public void createHairdresser(Hairdresser hairdresser) {
		Hairdresser hairdresser = new Hairdresser(0, hairdresserDto.getName(), hairdresserDto.getEmail(), hairdresserDto.getPhone(), hairdresserDto.getServices());
		repository.insert(hairdresser);
	}
	
	//delete a hairdresser by its id:
	public void deleteHairdresserById(int id) {
		repository.deleteById(id);
	}

}
