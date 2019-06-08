package curl;

import org.apache.http.HttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCurl {
	
	private DoCurl curl = new DoCurl();
	
	@Test
	public void curlGoogle() {
		
		String sResult = curl.getGoogleHomepage();	
		Assert.assertTrue(sResult.contains("Google"));
	}
	
	@Test
	public void curlUploadFile() {
		
		curl.uploadFile();
	}

}
