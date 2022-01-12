package com.coderscampus10.WCAssignment10.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meal {
	
//    "id": 655219,
//    "title": "Peanut Butter And Chocolate Oatmeal",
//    "imageType": "jpg",
//    "readyInMinutes": 45,
//    "servings": 1,
//    "sourceUrl": "https://spoonacular.com/recipes/peanut-butter-and-chocolate-oatmeal-655219"
	
	@JsonProperty("id")
    private int id;
	@JsonProperty("title")
    private String title;
	@JsonProperty("imagetype")
    private String imageType;
	@JsonProperty("readyInMinutes")
    private int readyInMinutes;
	@JsonProperty("servings")
    private int servings;
	@JsonProperty("sourceUrl")
    private String sourceUrl;
	
    public Meal() {
		super();
	}

	public Meal(int id, String title, String imageType, int readyInMinutes, int servings, String sourceUrl) {
		super();
		this.id = id;
		this.title = title;
		this.imageType = imageType;
		this.readyInMinutes = readyInMinutes;
		this.servings = servings;
		this.sourceUrl = sourceUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public int getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(int readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	@Override
	public String toString() {
		return "Meal [id=" + id + ", title=" + title + ", imageType=" + imageType + ", readyInMinutes=" + readyInMinutes
				+ ", servings=" + servings + ", sourceUrl=" + sourceUrl + "]";
	}
    
    

}
