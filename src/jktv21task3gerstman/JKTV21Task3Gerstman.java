/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task3gerstman;


import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JKTV21Task3Gerstman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        String personalCode, name, lastname;
        String year, month, day;
        String[] months = {"Янаваря", "Февраля", "Марта", "Апреля", "Мая", "Июня",
            "Июля", "Августа", "Сентября", "Октября", "Ноября", "Декабря"};
        
        System.out.println("Your name: ");
        name = scn.nextLine();
        
        System.out.println("Your lastname: ");
        lastname = scn.nextLine();
        
        System.out.println("Your personal code: ");
        personalCode = scn.nextLine();
        
        year = personalCode.substring(1,3);
        month = personalCode.substring(3,5);
        day = personalCode.substring(5,7);
        
        if((personalCode.charAt(0) + "").contains("3")){
            System.out.println(name + " " + lastname + " родился " + day + " " + months[Integer.parseInt(month)-1] + " 19" + year + " года");
        }
        else if((personalCode.charAt(0) + "").contains("5")){
            System.out.println(name + " " + lastname + " родился " + day + " " + months[Integer.parseInt(month)-1] + " 20" + year + " года");
        }
        else if((personalCode.charAt(0) + "").contains("4")){
            System.out.println(name + " " + lastname + " родилась " + day + " " + months[Integer.parseInt(month)-1] + " 19" + year + " года");
        }
        else if((personalCode.charAt(0) + "").contains("6")){
            System.out.println(name + " " + lastname + " родилась " + day + " " + months[Integer.parseInt(month)-1] + " 20" + year + " года");
        }
    }
    
}
