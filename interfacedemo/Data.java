/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author Cristian
 */
public class Data 
{
    public static double average(Measurable[] objects)
    {
        if(objects.length == 0) return 0;
        double sum = 0;
        for(Measurable m : objects)
        {
            sum += m.getMeasure();
        }
        sum = sum / objects.length;
        return sum;
    }
    
    public static Measurable larger(Measurable obj, Measurable obj2)
    {
        if (obj.getMeasure() > obj2.getMeasure()) return obj;
        return obj2;
    }
}