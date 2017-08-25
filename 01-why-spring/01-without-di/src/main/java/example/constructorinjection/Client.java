package example.constructorinjection;

import example.MyService;
import example.ServiceExample;

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
        return "Constructor injection , Hello " + service.getName();
    }

    public static void main(String[] args) {
        final Client client = new Client(new ServiceExample());
        System.out.println(client.greet());
    }
}
