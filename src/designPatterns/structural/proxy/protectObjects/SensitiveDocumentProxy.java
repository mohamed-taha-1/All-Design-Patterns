package designPatterns.structural.proxy.protectObjects;

// Proxy class to protect sensitive document
public class SensitiveDocumentProxy implements SensitiveDocument {
	private SensitiveDocument OfficalDocument;
	private String authorizedUser;

	 public SensitiveDocumentProxy(SensitiveDocument document, String authorizedUser) {
	        this.OfficalDocument = document;
	        this.authorizedUser = authorizedUser;
	    }
	
	
	@Override
	public void readDocument() {
		  if (checkAuthorization()) {
			  OfficalDocument.readDocument();
	        } else {
	            System.out.println("Unauthorized access. Access denied.");
	        }
		

	}
	
	private boolean checkAuthorization() {
		
		return authorizedUser.equals("admin");
	}

}
