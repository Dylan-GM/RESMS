/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resms.MyLib;

/**
 *
 * @author Buena, Lucas, Lumba, Magana, Paita, Tambagan
 */
public class Lot {
    protected int lotNum;
    protected double lotSize;
    protected Location lotLoc;
    protected String lotStatus;
    protected double lotPrice;
    protected String lotType;

// ---------------------------- CONSTRUCTORS ---------------------------- //  
    public Lot(int lotNum, double lotSize, int Block, int Lot, String lotStatus, double lotPrice) {
        this.lotNum = lotNum;
        this.lotSize = lotSize;
        Location lotLocation = new Location(Block, Lot);
        this.lotLoc = lotLocation;
        this.lotStatus = lotStatus;
        this.lotPrice = lotPrice;

    }//ends Lot constructor
    
    
    
// ------------------------------ METHODS ------------------------------ //

    public void reserveLot() {
        lotStatus = "Reserved";
    }//ends reserveLot() method
    
    
    public void buyLot() {
        lotStatus = "Sold";
    }//ends buyLot() method
    
}//ends Lot class



//  Buena, Lucas, Lumba, Magana, Paita, Tambagan
//  CSS123L - BM3 - FINAL PROJECT
//  08/07/2023
