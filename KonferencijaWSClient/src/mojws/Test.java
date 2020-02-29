package mojws;

public class Test {

	public static void main(String[] args) {
		FutureConfService confService=new FutureConfService();
		FutureConf port=confService.getFutureConfPort();
	//	if(port.getFutureConferences("IT").size()==0) {
		//	System.out.println("nema nista");
		//}
		for(Conference c:port.getFutureConferences("IT")) {
			System.out.println(c);
		}

	}

}
