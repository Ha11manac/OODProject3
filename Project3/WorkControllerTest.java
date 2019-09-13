/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project3;

/**
 *
 * @author pokem
 */
public class WorkControllerTest {
    public static void main(String[] args){
        Controller c = new Controller();
        
        Sandwich s = new Sandwich();
        Oven o = new Oven();
        
        OvenOn oOn = new OvenOn(o);
        OvenOff oOff = new OvenOff(o);
        
        SandwichCooking sCooking = new SandwichCooking(s);
        SandwichCooked sCooked = new SandwichCooked(s);
        
        c.setWork(oOn);
        c.activated();
        c.setWork(sCooking);
        c.activated();
        c.setWork(sCooked);
        c.activated();
        c.setWork(oOff);
        c.activated();
    }
}
