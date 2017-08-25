package example.noinjection;

import example.MyService;

public class Client {

    // Internal reference to the service used by this client
    private MyService service;

    // Constructor
    Client() {
        // Specify a specific implementation in the constructor instead of using dependency injection
        service = new ServiceExample();
    }

    // Method within this client that uses the services
    public String greet() {
        return "Hello " + service.getName();
    }
}

class ServiceExample implements MyService {
    public String getName() {
        return "Name from ServiceExample";
    }
}