package com.coderscampus10.WCAssignment10.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {

	@JsonProperty("week")
	private Week meals;
	//@JsonProperty("nutrients")
	//private Nutrients nutrients;
	
	public WeekResponse() {
		super();
	}

	public WeekResponse(Week meals) {
		super();
		this.meals = meals;
	}

	public Week getMeals() {
		return meals;
	}

	public void setMeals(Week meals) {
		this.meals = meals;
	}

//	public Nutrients getNutrients() {
//		return nutrients;
//	}
//
//	public void setNutrients(Nutrients nutrients) {
//		this.nutrients = nutrients;
//	}

	@Override
	public String toString() {
		return "WeekResponse [meals=" + meals + "]";
	}

	
	
}