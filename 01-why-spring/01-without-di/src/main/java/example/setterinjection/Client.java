package example.setterinjection;

import example.MyService;

public class Client {

    // Internal reference to the service used by this client
    private MyService service;

    // Constructor
    Client() { }

    // Setter method
    public void setService(MyService service) {
        // Save the reference to the passed-in service inside this client
        this.service = service;
    }

    // Method within this client that uses the services
    public String greet() {
        return "Hello " + service.getName();
    }
}
