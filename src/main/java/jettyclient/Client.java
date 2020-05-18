package jettyclient;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;

public class Client {
	public static void main(String[] args) {
		HttpClient httpClient = new HttpClient();
		 try {
			httpClient.start();
			// One liner:
			 httpClient.GET("http://localhost:8780/").getStatus();

			 // Building a request with a timeout
			 ContentResponse response = httpClient.newRequest("http://localhost:8780/employees/2")
			         .timeout(5, TimeUnit.SECONDS)
			         .send();
			 int status = response.getStatus();
			 System.out.println(status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
