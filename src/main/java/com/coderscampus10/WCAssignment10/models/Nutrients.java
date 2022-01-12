package com.coderscampus10.WCAssignment10.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
	
//	"calories": 1735.81,
//    "carbohydrates": 235.17,
//    "fat": 69.22,
//    "protein": 55.43
	
	@JsonProperty("calories")
	private double calories;
	@JsonProperty("carbohydrates")
	private double carbohydrates;
	@JsonProperty("fat")
	private double fat;
	@JsonProperty("protein")
	private double protein;
	
	public Nutrients() {
		super();
	}

	public Nutrients(double calories, double carbohydrates, double fat, double protein) {
		super();
		this.calories = calories;
		this.carbohydrates = carbohydrates;
		this.fat = fat;
		this.protein = protein;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	@Override
	public String toString() {
		return "Nutrients [calories=" + calories + ", carbohydrates=" + carbohydrates + ", fat=" + fat + ", protein="
				+ protein + "]";
	}
	
	

}
