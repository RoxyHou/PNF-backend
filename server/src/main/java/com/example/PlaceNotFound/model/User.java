package com.example.PlaceNotFound.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	private double latitude;
	private double longitude;
	private int radius;
	private List<Restaurant> restaurants = new ArrayList<>();
	
	public User() {
		
	}
	public User(double latitude, double longitude, int radius) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.radius = radius;
	}
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public List<Restaurant> getRestaurants() {
		return restaurants;
	}
	public void addRestaurants(Restaurant r) {
		this.restaurants.add(r);
	}
	
	
}
