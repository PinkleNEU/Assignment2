/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class carDbHistory {
    private ArrayList<CarDb> history;
    
    public carDbHistory(){
    this.history = new ArrayList<CarDb>();  
    }

    public ArrayList<CarDb> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarDb> history) {
        this.history = history;
    }
    
  public CarDb addNewData()
  {
    CarDb newdata= new CarDb();
    history.add(newdata);
    return newdata;
  }
}
