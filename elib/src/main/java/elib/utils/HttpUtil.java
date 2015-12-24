package elib.utils;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class HttpUtil {
	public static String cookieName = "";
	public static String cookieValue = "";
	public static String hostBase = "";
	private static OkHttpClient client = new OkHttpClient();
	public static String getHtmlString(String url) {
	    try {
			Request request = new Request.Builder()
					.url(url)
					.build();

			Response response = client.newCall(request).execute();
			return response.body().string();
	    } catch (Exception e) {
	    	
	    	XLog.d("win", "lllll" + e.toString());
	        return "";  
	    }  
	} 


}
