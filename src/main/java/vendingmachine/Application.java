package vendingmachine;

import vendingmachine.adapter.in.client.VendingClient;
import vendingmachine.application.VendingService;

public class Application {

    public static void main(String[] args) {
        VendingClient vendingClient = new VendingClient(new VendingService());
        vendingClient.run();
    }
}
