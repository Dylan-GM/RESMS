/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resms.MyLib;

/**
 *
 * @author Buena, Lucas, Lumba, Magana, Paita, Tambagan
 */
public class Location {
    protected int Block;
    protected int Lot;

// ---------------------------- CONSTRUCTORS ---------------------------- //
    
    public Location(int Block, int Lot) {
        this.Block = Block;
        this.Lot = Lot;
    }//ends Location constructor
    
    
    
// ------------------------------ METHODS ------------------------------ //
    
    public String getLocation(){
        String location = "Block " + Block + " Lot " + Lot;
        
        return location;
    }//ends getLocation() method

    public int getBlock() {
        return Block;
    }

    public int getLot() {
        return Lot;
    }
    
    
    
}//ends Location class



//  Buena, Lucas, Lumba, Magana, Paita, Tambagan
//  CSS123L - BM3 - FINAL PROJECT
//  08/07/2023
