package com.coderscampus10.WCAssignment10.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus10.WCAssignment10.models.DayResponse;
import com.coderscampus10.WCAssignment10.models.Week;
import com.coderscampus10.WCAssignment10.models.WeekResponse;
import com.coderscampus10.WCAssignment10.services.MealPlanService;

@RestController
@CrossOrigin(origins = "*")
public class MealPlanController {
	
	private MealPlanService mPServ;
	
	@Autowired
	public MealPlanController (MealPlanService mP) {
		this.mPServ = mP;
	}
	
	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals (Optional<String> numCalories, Optional<String> diet, Optional<String> exclusions) {
		
		return mPServ.getWeek(numCalories, diet, exclusions);
	}
	
	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals (Optional<String> numCalories, Optional<String> diet, Optional<String> exclusions) {
		
		return mPServ.getDay(numCalories, diet, exclusions);
	}
}
