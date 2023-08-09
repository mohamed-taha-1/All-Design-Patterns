package designPatterns.behavioural.state;


//State interface
public interface VendingMachineState {
	void insertCoin();

	void selectProduct();

	void dispense();
}
