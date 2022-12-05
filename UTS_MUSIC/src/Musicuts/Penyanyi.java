/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musicuts;

/**
 *
 * @author ASUS
 */
public class Penyanyi extends Pop {
    public static void main(String[] args) {
        Pop pop = new Pop ("Balck Pink", "How You Like That");
        Dangdut dangdut = new Dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        String penyanyi = "Joko Candhra";
        penyanyi = dangdut.penyanyi;
        dangdut.song("Kopi Dangdut");
        dangdut.cetakLabel();
    }
    
}
