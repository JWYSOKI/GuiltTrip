package com.guilttrip.model;

//entity = model

// models are representations of my data (or a table in my data base)

// getters and setters are always in models

// models will always look the same


public class Task {
	
	private String activity;
	private String motivation;
	private int reminderTime;
	
	public Task (){};
	
	public Task(String activity, String motivation, int reminderTime) {
		super();
		this.activity = activity;
		this.motivation = motivation;
		this.reminderTime = reminderTime;
	}
	@Override
	public String toString() {
		return "Activity [activity=" + activity + ", motivation=" + motivation + ", reminderTime=" + reminderTime
				+ ", getActivity()=" + getActivity() + ", getMotivation()=" + getMotivation() + ", getReminderTime()="
				+ getReminderTime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getMotivation() {
		return motivation;
	}
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}
	public int getReminderTime() {
		return reminderTime;
	}
	public void setReminderTime(int reminderTime) {
		this.reminderTime = reminderTime;
	}

}
