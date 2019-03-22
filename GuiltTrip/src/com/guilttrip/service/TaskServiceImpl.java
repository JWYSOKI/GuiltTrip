package com.guilttrip.service;
//package service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.guilttrip.model.Activity;
//
//
//public class ActivityServiceImpl implements ActivityService {
//
//	List<Activity> allActivities = new ArrayList<>();
//	
////method in this service to add to the function, make this list a global variable. 	This is a mock DAO 
//	@Override
//	public List<Activity> findAllActivities() {
//		
//		
//		Activity activity1 = new Activity("Go to bed!", "So I'll feel rested", 9);
//		Activity activity2 = new Activity("Eat more fruit", "For health", 1);
//		Activity activity3 = new Activity("Smile", "So I'll be happier", 3);
//		Activity activity4 = new Activity("Talk a walk", "Better fitness", 4);
//		
//		
//		
//		
//		allActivities.add(activity1);
//		allActivities.add(activity2);
//		allActivities.add(activity3);
//		allActivities.add(activity4);
//		
//		return allActivities;
//	}
//	
//	
//	public List<Activity> addActivitiesToList () {
//		return allActivities;
//	}
//	
//	public Activity save(Activity activity) {
//		
//		// process other logic
//		
//		//normally this is where the Activity savedActivity = dao.save(activity); is
//        		
//		Activity savedActivity = new Activity();
//		
//		return savedActivity;
//	}
//	
//}