package com.example.coolweather;

public class Country {
	private int id;
	private String countryName;
	private String countryCode;
	private int cityId;
	public int getCityId(){
		return cityId;
	}
	public void setCityId(int cityId){
		this.cityId=cityId;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getcountryName(){
		return countryName;
		
	}
	public void setcountryName(String countryName){
		this.countryName=countryName;
	}
	public String getcountryCode(){
		return countryCode;
	}
	public void setcountryCode(String countryCode){
		this.countryCode=countryCode;
	}
}
