package com.coderscampus10.WCAssignment10.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {

	@JsonProperty("meals")
	private ArrayList<Meal> meals;
	@JsonProperty("nutrients")
	private Nutrients nutrients;
	
	public DayResponse() {
		super();
	}

	public DayResponse(ArrayList<Meal> meals, Nutrients nutrients) {
		super();
		this.meals = meals;
		this.nutrients = nutrients;
	}

	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(ArrayList<Meal> meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public String toString() {
		return "DayResponse [meals=" + meals + ", nutrients=" + nutrients + "]";
	}
	
	
	
}
