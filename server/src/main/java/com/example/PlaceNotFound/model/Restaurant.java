package com.example.PlaceNotFound.model;

public class Restaurant {

	private double latitude;
	private double longitude;
	private int priceLevel;
	private float rating;
	private String name;
	private String address;
	private int travelTime;
	private double distance;
	
	
	public Restaurant(double latitude, double longitude, int priceLevel, float rating, String name, String address) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.priceLevel = priceLevel;
		this.rating = rating;
		this.name = name;
		this.address = address;
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
	public int getPriceLevel() {
		return priceLevel;
	}
	public void setPriceLevel(int priceLevel) {
		this.priceLevel = priceLevel;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(int travelTime) {
		this.travelTime = travelTime;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	
}
