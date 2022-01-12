package com.coderscampus10.WCAssignment10.services;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus10.WCAssignment10.models.DayResponse;
import com.coderscampus10.WCAssignment10.models.Week;
import com.coderscampus10.WCAssignment10.models.WeekResponse;

@Service
public class MealPlanService {
	
	//Got this to work! 
	@Value("${spoon.url.MP}")
	private String spoonUrl;
	
	@Value("${spoon.key}")
	private String spoonKey;
	
	RestTemplate rt = new RestTemplate();
	
	public ResponseEntity<WeekResponse> getWeek (Optional<String> numCalories, Optional<String> diet, Optional<String> exclusions){
		
		//API params = ?targetCalories=2000&diet=vegetarian&exclude=shellfish
		//APP params = ?numCalories=2000&diet=vegetarian&exclusions=shellfish
		
		URI uri = UriComponentsBuilder.fromHttpUrl(spoonUrl)
									  .queryParam("timeFrame", "Week")
									  .queryParamIfPresent("targetCalories", numCalories)
									  .queryParamIfPresent("diet", diet)
									  .queryParamIfPresent("exclude", exclusions)
									  .queryParam("apiKey", spoonKey)
									  .build()
									  .toUri();
									  
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		
		return response;
	}
	
	public ResponseEntity<DayResponse> getDay (Optional<String> numCalories, Optional<String> diet, Optional<String> exclusions){
		
		System.out.println("in the MPService");
		
		URI uri = UriComponentsBuilder.fromHttpUrl(spoonUrl)
									  .queryParam("timeFrame", "Day")
									  .queryParamIfPresent("targetCalories", numCalories)
									  .queryParamIfPresent("diet", diet)
									  .queryParamIfPresent("exclude", exclusions)
									  .queryParam("apiKey", spoonKey)
									  .build()
									  .toUri();
				  
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);

		return response;
	}
	

}
