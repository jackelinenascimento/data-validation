package outputdatavalidation;

public class FakeWebServer {
	
	public String request(String request) {
		
		String htmlResponse = "";
		
		if(request.contains("PageA")) {
			
			htmlResponse = "<html><head> PageA </head><body> Page A </body></html>";
			
		}
		else if(request.contains("PageB")) {
			
			htmlResponse = "<html><head> PageB </head><body> Page B </body></html>";
			
		}
		else {
			htmlResponse = "<html><head> Error </head><body> Resource not found " + request + "</body></html>";
		}
		
		htmlResponse = validateOutput(htmlResponse);
		
		return htmlResponse;
		
	}
	
	private String validateOutput(String output) {
		
		if(output.contains("<script>")) {
			output = "<html> <head> Error </head> <body> Error </body> </html>";
		}
		
		return output;
	}
}
