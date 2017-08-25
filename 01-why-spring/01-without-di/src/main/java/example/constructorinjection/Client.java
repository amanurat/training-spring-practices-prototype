package example.constructorinjection;

import example.MyService;

public class Client {

    // Internal reference to the service used by this client
    private MyService service;

    // Constructor
    Client(MyService service) {
        // The service is given through a constructor argument
        this.service = service;
    }

    // Method within this client that uses the services
    public String greet() {
        return "Hello " + service.getName();
    }
}
