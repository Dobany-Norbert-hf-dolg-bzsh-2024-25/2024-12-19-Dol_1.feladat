/*
* File: App.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*
* Refactorer: Dobány Norbert
* Group: Szoft II/1/N
* Date: 2025-01-09
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        printHeader();

        Store userData = getUserInput();

        if(writeToFile(userData)) 
        { 
            System.out.println("Ok. A kiírás sikeres.");  
        }
        else 
        {  
            System.out.println("Hiba! A kiírás sikertelen"); 
        }
    }

    public static void printHeader() 
    {
        System.out.println("Nagy János");
        System.out.println("Jelszavak");
        System.out.println("Verzió: 0.0.1");
    }

    public static Store getUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Felhasználónév: ");
        String username = scanner.nextLine();
        System.out.print("Jelszó: ");
        String password = scanner.nextLine();
        System.out.print("Hely: ");
        String place = scanner.nextLine();

        scanner.close();

        return new Store(username,password,place);
    }

    public static boolean writeToFile(Store userData)
    {
        try 
        {   
            FileWriter fileWriter = new FileWriter("passwords.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(userData.getUsername());
            if(!userData.isPasswordEmpty()) 
            { 
                printWriter.print(userData.getPassword()); 
            }
            printWriter.print(userData.getPlace());
            printWriter.close();
            return true;
            
        } 
        catch (IOException e) 
        {
            System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
            System.err.println(e.getMessage());
            return false;
        }
    }
}
