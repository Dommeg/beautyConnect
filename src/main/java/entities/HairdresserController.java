package BeautyConnect;

/*Controller class is responsible for handling requests and responses between the client and the server. 
 * It typically receives requests from the client, processes them using the appropriate service classes, 
 * and then returns responses to the client. 
 * Controllers may perform some validation or conversion of input data before passing it on to services. 
 * In our case, a HairdresserController handles requests to create, update, delete, or retrieve hairdresser 
 * (professionnel) information, and it might convert input data from JSON or XML format to Java objects.
 */

import java.util.List;


public class HairdresserController {
   
	private HairdresserService service = new HairdresserController();

    
    public List<Hairdresser> getAllHairdressers() {
        return hairdresserService.getAllHairdressers();
    }

   
    public Hairdresser getHairdresserById(int id) {
        return hairdresserService.getHairdresserById(id);
    }

   
    public Hairdresser createHairdresser(HairdresserDto hairdresserDto) {
        return hairdresserService.createHairdresser(hairdresserDto);
    }

   
    public Hairdresser updateHairdresser(int id, HairdresserDto hairdresserDto) {
        return hairdresserService.updateHairdresser(id, hairdresserDto);
    }

    
    public void deleteHairdresser(int id) {
        hairdresserService.deleteHairdresser(id);
    }
}
