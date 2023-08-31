/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resms.Template;

import java.util.ArrayList;
import resms.MyLib.Lot;
import resms.MyLib.Lot_List;

/**
 *
 * @author Buena, Lucas, Lumba, Magana, Paita, Tambagan
 */
public class Reservation implements TransactionProcess{
    
    @Override
    public boolean checkAvailability(String status) {
        boolean def = false;
        
        if (status.equals("For Sale"))
            def = true;
 
        return def;
    }
}



//  Buena, Lucas, Lumba, Magana, Paita, Tambagan
//  CSS123L - BM3 - FINAL PROJECT
//  08/07/2023
