package vendingmachine.adapter.in.client;

import vendingmachine.application.port.in.VendingUseCase;

public class VendingClient {

    private final VendingUseCase vendingUseCase;

    public VendingClient(VendingUseCase vendingUseCase) {
        this.vendingUseCase = vendingUseCase;
    }

    public void run() {
    }
}
