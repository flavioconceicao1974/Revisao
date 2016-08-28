/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author flavio-silva
 */
public class NewClass {
    public static void main(String[] args) {
        JogoDaVelha JV = new JogoDaVelha();
        JV.set(0,0,'O');
        JV.set(0,1,'X');
        JV.set(0,2,'O');
        
        JV.set(1,0,'O');
        JV.set(1,1,'O');
        JV.set(1,2,'X');
        
        JV.set(2,0,'X');
        JV.set(2,1,'O');
        JV.set(2,2,'O');
        System.out.println(JV);
        System.out.println(JV.vencedor());
        
        
    }
}
