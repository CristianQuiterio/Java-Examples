/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacedemo;

import java.util.Arrays;

/**
 *
 * @author Cristian
 */
public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);
        
        double averageBalance = Data.average(accounts);
        System.out.println(averageBalance);
        
        Country[] countries = new Country[3];
        countries[0] = new Country("USA", 176220);
        countries[1] = new Country("France", 40000);
        countries[2] = new Country("Japan", 1760);
        
        averageBalance = Data.average(countries);
        System.out.println(averageBalance);
        
        System.out.println(((Country)Data.larger(countries[0], accounts[1])).getName());
        
        for (BankAccount i: accounts)
        {
            System.out.println(i.getBalance());
        }
        
        Arrays.sort(accounts);
        
        for (BankAccount i: accounts)
        {
            System.out.println(i.getBalance());
        }
    }
    
}
