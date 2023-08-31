/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resms.MyLib;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Buena, Lucas, Lumba, Magana, Paita, Tambagan
 */
public class Lot_List{
    Scanner scan = new Scanner(System.in);

    int i;
    private static ArrayList<Lot> lotList;
    
// ---------------------------- CONSTRUCTORS ---------------------------- //

    public Lot_List(){
        lotList = new ArrayList<>();
        
        lotList.add(new Corner_Lot(101, 20, 1, 1, "For Sale", 20000, "Corner Lot"));
        lotList.add(new Interior_Lot(102, 70, 1, 2, "Sold", 20500, "Interior Lot"));
        lotList.add(new Interior_Lot(103, 90, 1, 3, "For Sale", 80000,"Interior Lot"));
        lotList.add(new Interior_Lot(104, 34, 1, 4, "Sold", 90000,"Interior Lot"));
        lotList.add(new Corner_Lot(105, 23, 1, 5, "For Sale", 30000, "Corner Lot"));
        
        lotList.add(new Corner_Lot(201, 40, 2, 1, "Reserved", 20000, "Corner Lot"));
        lotList.add(new Interior_Lot(202, 70, 2, 2, "Sold", 500000, "Interior Lot"));
        lotList.add(new Interior_Lot(203, 90, 2, 3, "Reserved", 80000, "Interior Lot"));
        lotList.add(new Interior_Lot(204, 34, 2, 4, "For Sale", 900000, "Interior Lot"));
        lotList.add(new Corner_Lot(205, 23, 2, 5, "For Sale", 30000, "Corner Lot"));
        
        lotList.add(new Corner_Lot(301, 20, 3, 1, "For Sale", 20000, "Corner Lot"));
        lotList.add(new Interior_Lot(302, 70, 3, 2, "Sold", 20500, "Interior Lot"));
        lotList.add(new Interior_Lot(303, 197, 3, 3, "For Sale", 80000, "Interior Lot"));
        lotList.add(new Interior_Lot(304, 34, 3, 4, "Sold", 90000, "Interior Lot"));
        lotList.add(new Corner_Lot(305, 23, 3, 5, "For Sale", 30000, "Corner Lot"));
        
        lotList.add(new Corner_Lot(401, 20, 4, 1, "For Sale", 20000, "Corner Lot"));
        lotList.add(new Interior_Lot(402, 70,4, 2, "Sold", 20500, "Interior Lot"));
        lotList.add(new Interior_Lot(103, 90, 1, 3, "Sold", 80000, "Interior Lot"));
        lotList.add(new Interior_Lot(404, 34, 4, 4, "Sold", 90000, "Interior Lot"));
        lotList.add(new Corner_Lot(405, 23, 4, 5, "For Sale", 30000, "Corner Lot"));
        
        lotList.add(new Corner_Lot(501, 20, 5, 1, "For Sale", 20000, "Corner Lot"));
        lotList.add(new Interior_Lot(502, 70, 5, 2, "Reserved", 20500, "Interior Lot"));
        lotList.add(new Interior_Lot(503, 197, 5, 3, "For Sale", 80000, "Interior Lot"));
        lotList.add(new Interior_Lot(504, 34, 5, 4, "Sold", 90000, "Interior Lot"));
        lotList.add(new Corner_Lot(505, 23, 5, 5, "For Sale", 30000, "Corner Lot"));
    }//ends Lot_List constructor
    
    
    
// ----------------------- METHODS ----------------------- //
    public int getListSize(){
        return lotList.size();
    }
    
    public int getLotNum(int i){
        return lotList.get(i).lotNum;
    }
    
    public double getLotSize(int i){
        return lotList.get(i).lotSize;
    }
    
    public int getBlock(int i){
        return lotList.get(i).lotLoc.Block;
    }
    
    public int getLot(int i){
        return lotList.get(i).lotLoc.Lot;
    }
    
    public String getStatus(int i){
        return lotList.get(i).lotStatus;
    }
    
    public double getPrice(int i) {
        return lotList.get(i).lotPrice;
    }
    
    public String getLotType(int i){
        return lotList.get(i).lotType;
    }
       
    public void reserveLot(int lotNum) {
        for (i = 0; i < lotList.size(); i++) {
            if (lotList.get(i).lotNum == lotNum)
                lotList.get(i).reserveLot();
            }//ends for loop
        }
    
    public void buyLot(int lotNum) {
        for (i = 0; i < lotList.size(); i++) {
            if (lotList.get(i).lotNum == lotNum) {
                lotList.get(i).buyLot();
            }
        }//ends for loop
    }
    
}//ends Lot_List class



//  Buena, Lucas, Lumba, Magana, Paita, Tambagan
//  CSS123L - BM3 - FINAL PROJECT
//  08/07/2023
