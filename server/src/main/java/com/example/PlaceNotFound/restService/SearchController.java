
package com.example.PlaceNotFound.restService;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;


@RestController
public class SearchController {
	
	
	private static final String key = "AIzaSyD8FLJBOrf19BZUNOzkWLX5ec_ip9aS-Qg";
	
    @RequestMapping(path = "/search", method = RequestMethod.GET, produces = "applicaiton/json")
   public String SearchRestaurant(@RequestParam String lati, @RequestParam String longi, @RequestParam String radius) throws IOException {

	   OkHttpClient client = new OkHttpClient().newBuilder()
			   .build();
	   
	   // radius in meters 
       Request request = new Request.Builder()
			   .url("https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
			   		+ "location=" + lati + "%2C" + longi
			   		+ "&radius=" + radius
			   		+ "&type=restaurant"
			   		+ "&key=" + key)
			   .method("GET", null)
			   .build();
	   Response response = client.newCall(request).execute();

	   return response.body().string();

   }
    
    @RequestMapping(path = "/distance", method = RequestMethod.GET, produces = "applicaiton/json")
    public String disatance(@RequestParam String orgLati, @RequestParam String orgLongi, @RequestParam String destLati, @RequestParam String destLongi) throws IOException {
     OkHttpClient client = new OkHttpClient().newBuilder()
       .build();
     Request request = new Request.Builder()
       .url("https://maps.googleapis.com/maps/api/distancematrix/json?"
         + "origins=" + orgLati + "%2C" + orgLongi
         + "&destinations=" + destLati + "%2C" + destLongi 
         + "&key=" + key)
       .method("GET", null)
       .build();
     Response response = client.newCall(request).execute();
     
     return response.body().string();
    }
   
   
   
   
}
