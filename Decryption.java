/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganography;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Hitesh
 */
public class Decryption {

    /**
     * @param args the command line arguments
     */
    
    public static final String fileName = "C:\\Users\\vinay\\Documents\\NetBeansProjects\\Steganography\\src\\steganography\\encrypted.png";
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         BufferedImage img = ImageIO.read(new File(fileName));
        int x=0,y=0;
        System.out.print("Message is : ");
        while(true)
        {
            Color c = new Color(img.getRGB(x, y));
            System.out.print((char)(c.getGreen()));
            if((char)(c.getGreen()) == '.')
                break;
            x += 10;
            y += 10;
        }
    }
}
