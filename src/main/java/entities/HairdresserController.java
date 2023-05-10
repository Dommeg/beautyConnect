package BeautyConnect;

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
