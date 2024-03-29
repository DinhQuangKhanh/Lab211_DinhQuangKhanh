/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Validation;

/**
 *
 * @author ADMIN
 */
public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> options = new ArrayList<>();
    protected Validation val = new  Validation();
    
    public Menu() {
    }

    public Menu(String title, T[] arr) {
        this.title = title;

        for (T t : arr) {
            options.add(t);
        }
    }
//----------------------------------------------------
    public void display() {
        System.out.println("\n"+title);
        System.out.println("-----------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("-----------------------");
    }
//----------------------------------------------------
    public int getOption() {
        display();
        return val.getIntData("Enter your selection: ", 1, options.size() + 1);
    }
//----------------------------------------------------
    public abstract void excute(int n);
//----------------------------------------------------
    public void run() {
        while (true) {
            int n = getOption();
             if (n >= options.size()) {
                 System.out.println("GoodBye");
                break;
            }
            excute(n);
        }
    }
//----------------------------------------------------
}
