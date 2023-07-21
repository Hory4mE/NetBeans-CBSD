/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawaneclipse;

import java.util.Scanner;

/**
 *
 * @author pongs
 */
public class Foot {
   private FootShape ft;
   public void getShape(String footshape) {
        switch(footshape) {
            case "Eclipse" : ft = new Eclipse();break;
            case "Rectangle" : ft = new Rectangle();break;
        }
    }
    
        public String drawShape() {
            return ft.draw();
    }
    
    public static void main(String[] args) {
        Foot app = new Foot();
        Scanner inp = new Scanner(System.in);
        System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
        int type = inp.nextInt();
        switch(type) {
            case 1 : app.getShape("Eclipse");break;
            case 2 : app.getShape("Rectangle");break;
        }
        System.out.println(app.drawShape());        
    }
}
