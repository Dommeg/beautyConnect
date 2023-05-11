package BeautyConnect;

import java.util.ArrayList;
import java.util.List;

/*A DTO (Data Transfer Object) is a class used to transfer data between different layers of an application 
or between different applications. 
-typically used to encapsulate data from a database, web service, or other data source, 
and pass that data to another layer or component of the application. 
DTO classes typically have public fields or getters/setters for each data element they encapsulate. 
In our case a HairdresserDto represents Hairdresser information as it is stored in a database, 
and it might include fields for the hairdresser's ID, name, email address, etc.
*/
public class HairdresserDto {
	private int id;
    private String name;
    private String email;
    private String phone;
    private ArrayList<String> services;
    
    

    public HairdresserDto(int id, String name, String email, String phone, ArrayList<String> services) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.services = new ArrayList<>();
        services.add("Haircut");
        services.add("Coloring");
        services.add("Maquillage");
        services.add("Tattoo");
        services.add("Piercing");
    }

    // getters and setters
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

    public ArrayList<String> getServices() {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }
}

