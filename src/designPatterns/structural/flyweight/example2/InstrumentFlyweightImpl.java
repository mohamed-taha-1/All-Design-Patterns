package designPatterns.structural.flyweight.example2;

public class InstrumentFlyweightImpl implements InstrumentFlyweight {
    private String instrumentType;

    public InstrumentFlyweightImpl(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public void sell(String customerName) {
        System.out.println("Sold " + instrumentType + " to " + customerName);
    }

}
