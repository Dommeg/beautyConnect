package BeautyConnect;

import java.util.ArrayList;
import java.util.List;

public class Hairdresser {
    private int id;
    private String name;
    private String email;
    private String phone;
    private ArrayList<String> services;
    
 

    public Hairdresser(int id, String name, String email, String phone, ArrayList<String> services) {
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

