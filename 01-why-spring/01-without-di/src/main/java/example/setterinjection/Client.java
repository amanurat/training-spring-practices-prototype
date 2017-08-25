package example.setterinjection;

import example.MyService;
import example.ServiceExample;

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
        return "Setter injection, Hello " + service.getName();
    }

    public static void main(String[] args) {
        final Client client = new Client();

        final ServiceExample serviceExample = new ServiceExample();
        client.setService(serviceExample);

        System.out.println(client.greet());
    }
}
