/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drawaneclipse;


/**
 *
 * @author pongs
 */
public abstract class FootShape {
    public abstract String draw();
    
    public String drawAsEclipse(){
        return "draw Eclipse";
    }
    
    public String drawAsRectangle(){
        return "draw Rectangle";
    }
}
