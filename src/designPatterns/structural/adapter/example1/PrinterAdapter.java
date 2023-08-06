package designPatterns.structural.adapter.example1;

public class PrinterAdapter implements Printer {
	
	private  LegacyPrinter legacyPrinter;
	
	public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter=legacyPrinter;
    }
	
	
	 @Override
	    public void print(String text) {
		 legacyPrinter.print(text);
	    }

}
