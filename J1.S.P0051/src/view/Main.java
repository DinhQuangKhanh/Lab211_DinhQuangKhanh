/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Programming;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Normal Calculator","BMI Calculator","Exit"};
        Programming program = new Programming("========= Calculator Program =========", mChon);
        program.run();
    }
}
