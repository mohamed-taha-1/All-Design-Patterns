package designPatterns.behavioural.chain_of_resposability;

import designPatterns.behavioural.chain_of_resposability.example1.Approver;
import designPatterns.behavioural.chain_of_resposability.example1.CEO;
import designPatterns.behavioural.chain_of_resposability.example1.Director;
import designPatterns.behavioural.chain_of_resposability.example1.Manager;
import designPatterns.behavioural.chain_of_resposability.example1.Request;
import designPatterns.behavioural.chain_of_resposability.example2.ConsoleLogger;
import designPatterns.behavioural.chain_of_resposability.example2.EmailLogger;
import designPatterns.behavioural.chain_of_resposability.example2.FileLogger;
import designPatterns.behavioural.chain_of_resposability.example2.LogLevel;
import designPatterns.behavioural.chain_of_resposability.example2.Logger;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> It allows us to process single request by multiple handlers.
		 * 
		 * 
		 * <T> we build handlers( create a chain of objects ) in the chain, a where each
		 * object in the chain has the potential to handle a request or pass it along to
		 * the next object in the chain.
		 * 
		 * 
		 * <T> It providing an elegant way to handle and process requests through a
		 * sequence of objects.
		 **/

		Approver manager = new Manager();
		Approver director = new Director();
		Approver ceo = new CEO();

		manager.setNextApprover(director);
		director.setNextApprover(ceo);

		Request request1 = new Request(800);
		Request request2 = new Request(4500);
		Request request3 = new Request(12000);

		manager.approveRequest(request1);
		manager.approveRequest(request2);
		manager.approveRequest(request3);
		
		/*
		 * ----------------------- EXAMPLE 2 ----------------------------- 
		 */
		
		System.out.println("---------------- *********** --------------");
		Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);
        Logger fileLogger = new FileLogger(LogLevel.WARNING);
        Logger emailLogger = new EmailLogger(LogLevel.ERROR);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(emailLogger);

        consoleLogger.logMessage(LogLevel.INFO, "This is an information message.");
        consoleLogger.logMessage(LogLevel.WARNING, "This is a warning message.");
        consoleLogger.logMessage(LogLevel.ERROR, "This is an error message.");

	}

}
