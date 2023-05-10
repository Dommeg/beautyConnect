package BeautyConnect;

import java.util.List;

public class HairdresserDto {
	private int id;
    private String name;
    private String email;
    private String phone;
    private List<String> services;
    
    
    
	public HairdresserDto(int id, String name, String email, String phone, List<String> services) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.services = services;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<String> getServices() {
		return services;
	}
	public void setServices(List<String> services) {
		this.services = services;
	}
    
    

}
