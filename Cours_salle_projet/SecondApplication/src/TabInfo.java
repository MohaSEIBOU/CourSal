/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class TabInfo {
   String [][] names = {{"VOL", "DESTINATION", "PORTE"},
                        {"TWA7401", "ST Louis", "C33"},
                        {"AA431", "Dallas", "D8"},
                        {"DELTA94", "Atlanta", "A12"},
                        {"UNITED 155", "Chicago", "B4"},
                       }; 
   public void affichage(){
      for (String[] tab: names) {
     for (String s: tab) {
         System.out.print(s+"\t");
     }
     System.out.println("\n");
  }  
   }
}

