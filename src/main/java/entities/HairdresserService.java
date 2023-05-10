package BeautyConnect;

public class HairdresserService {
	
	private HairdresserRepository repository = new HairdresserRepository();
	
	public void createHairdresser(HairdresserDto hairDresserDto) {
		Hairdresser hairdresser = new Hairdresser(0, null, null, null, null);
		repository.insert(hairdresser);
	}

}
