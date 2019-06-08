package curl;

import static org.toilelibre.libe.curl.Curl.curl;

import org.apache.http.HttpResponse;

public class DoCurl {

	public String getGoogleHomepage() {
		
		// -L is passed to follow the redirects
		return curl().lUpperCase().$("https://www.google.com/");
	}
	
	public HttpResponse uploadFile() {
		
		return curl("-X POST -F 'fileToUpload=@/home/julien/test/test.txt' http://localhost/upload.php");
	}

}
