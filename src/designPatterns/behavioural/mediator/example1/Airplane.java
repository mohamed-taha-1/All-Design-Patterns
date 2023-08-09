package designPatterns.behavioural.mediator.example1;

public class Airplane extends Aircraft {
    public Airplane(AirTrafficControl atc) {
        super(atc);
    }

    @Override
    public void sendWarning(String warning) {
        atc.sendWarning(this, warning);
    }

    @Override
    public void receiveWarning(String warning) {
        System.out.println("Airplane received warning: " + warning);
    }
}
