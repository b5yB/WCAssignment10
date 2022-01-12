package com.coderscampus10.WCAssignment10.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Week {

	@JsonProperty("monday")
	private DayResponse monday;
	@JsonProperty("tuesday")
	private DayResponse tuesday;
	@JsonProperty("wednesday")
	private DayResponse wednesday;
	@JsonProperty("thursday")
	private DayResponse thursday;
	@JsonProperty("friday")
	private DayResponse friday;
	@JsonProperty("saturday")
	private DayResponse saturday;
	@JsonProperty("sunday")
	private DayResponse sunday;
	
	public Week() {
		super();
	}

	public Week(DayResponse monday, DayResponse tuesday, DayResponse wednesday, DayResponse thursday,
			DayResponse friday, DayResponse saturday, DayResponse sunday) {
		super();
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
	}

	public DayResponse getMonday() {
		return monday;
	}

	public void setMonday(DayResponse monday) {
		this.monday = monday;
	}

	public DayResponse getTuesday() {
		return tuesday;
	}

	public void setTuesday(DayResponse tuesday) {
		this.tuesday = tuesday;
	}

	public DayResponse getWednesday() {
		return wednesday;
	}

	public void setWednesday(DayResponse wednesday) {
		this.wednesday = wednesday;
	}

	public DayResponse getThursday() {
		return thursday;
	}

	public void setThursday(DayResponse thursday) {
		this.thursday = thursday;
	}

	public DayResponse getFriday() {
		return friday;
	}

	public void setFriday(DayResponse friday) {
		this.friday = friday;
	}

	public DayResponse getSaturday() {
		return saturday;
	}

	public void setSaturday(DayResponse saturday) {
		this.saturday = saturday;
	}

	public DayResponse getSunday() {
		return sunday;
	}

	public void setSunday(DayResponse sunday) {
		this.sunday = sunday;
	}

	@Override
	public String toString() {
		return "Week [monday=" + monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday=" + thursday
				+ ", friday=" + friday + ", saturday=" + saturday + ", sunday=" + sunday + "]";
	}
	
	
	
	
}
