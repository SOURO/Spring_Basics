package org.SpringAutoWireAutoDetect;  
  
public class country {  
  
    String countryName;  
    Capital capital; 
    public country(String countryName, Capital capital){
    	super();
    	this.countryName=countryName;
    	this.capital=capital;
    }
    public String getCountryName() {  
        return countryName;  
    }  
    public void setCountryName(String countryName) {  
        this.countryName = countryName;  
    }  
    public Capital getCapital() {  
        return capital;  
    }    
}  