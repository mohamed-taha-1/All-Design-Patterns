package designPatterns.behavioural.state;

public class VendingMachine {
	private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new ReadyState();
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispense() {
        currentState.dispense();
    }

}
