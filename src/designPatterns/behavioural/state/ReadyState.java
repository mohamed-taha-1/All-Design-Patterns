package designPatterns.behavioural.state;

public class ReadyState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Product selection available.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected. Please dispense.");
    }

    @Override
    public void dispense() {
        System.out.println("No product selected.");
    }
}
