/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganography;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import javax.imageio.ImageIO;


/**
 *
 * @author Hitesh
 */
public class Encryption {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    public static final String fileName = "C:\\Users\\vinay\\Documents\\NetBeansProjects\\Steganography\\src\\steganography\\images.jpg";
    public static final String message = "I am Iron Man.";
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedImage img = ImageIO.read(new File(fileName));
        int[] pixels = img.getRGB(0, 0, img.getWidth(), img.getHeight(), null, 0, img.getWidth());
        
        Color c,nc;
       
        int x=0,y=0;
        for(char ch:message.toCharArray())
        {
            
            c = new Color(img.getRGB(x, y));
            nc = new Color(c.getRed(),(int)ch , c.getBlue());
            img.setRGB(x, y, nc.getRGB());
            x += 10;
            y += 10;
        }
        ImageIO.write(img,"png",new File("C:\\Users\\vinay\\Documents\\NetBeansProjects\\Steganography\\src\\steganography\\encrypted.png"));
        
    }
    
}
