/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class CarDb {
    private String manufacturer;
    private int Year;
    private int minSeat;
    private long modelNum;
    private String city;

    public String getManufacturer() {
        return manufacturer;
      
            
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
       
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
        
    }

    public int getMinSeat() {
        return minSeat;
    }

    public void setMinSeat(int minSeat) {
        this.minSeat = minSeat;
    }

    public long getModelNum() {
        return modelNum;
    }

    public void setModelNum(long modelNum) {
        this.modelNum = modelNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getHistory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
