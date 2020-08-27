package outputdatavalidation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FakeWebServer server = new FakeWebServer();
		
		String pageA = server.request("PageA");
		System.out.println(pageA);
		
		String pageB = server.request("PageB");
		System.out.println(pageB);
		
		String malicious = server.request("<script> Script will execute when it gets back to client </script>");
		System.out.println(malicious);
		
	}

}
