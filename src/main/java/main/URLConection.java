package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLConection {
	private String url;
	private URL obj;
	private HttpURLConnection con;
	
	public URLConection(String find) {
		url = "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="+find;
	}

	public int connect() throws IOException {
        obj = new URL(url);
        con = (HttpURLConnection) obj.openConnection();
        int responseCode = con.getResponseCode();
        
        System.out.println("Sending 'GET' to URL: " + url);
        System.out.println("Response code: " + responseCode);
        
        return responseCode;
	}

	public String getGETMethod() {
		String result = "";
		String response = "";
		
		try {
			BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));			
			while((result = in.readLine()) != null) {
				response += (result);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response.toString();
	}

}
