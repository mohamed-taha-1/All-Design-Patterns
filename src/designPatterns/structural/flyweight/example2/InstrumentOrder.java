package designPatterns.structural.flyweight.example2;

public class InstrumentOrder {
	
	private String customerName;
    private String instrumentType;

    public InstrumentOrder(String customerName, String instrumentType) {
        this.customerName = customerName;
        this.instrumentType = instrumentType;
    }

    public void processOrder() {
        InstrumentFlyweight instrument = InstrumentFlyweightFactory.getInstrumentFlyweight(instrumentType);
        instrument.sell(customerName);
    }

}
