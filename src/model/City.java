package model;

public class City {
	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;
	public int getProvinceId(){
		return provinceId;
	}
	public void setProvinceId(int provinceId){
		this.provinceId=provinceId;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getcityName(){
		return cityName;
		
	}
	public void setcityName(String cityNames){
		this.cityName=cityName;
	}
	public String getcityCode(){
		return cityCode;
	}
	public void setcityCode(String cityCode){
		this.cityCode=cityCode;
	}
}
