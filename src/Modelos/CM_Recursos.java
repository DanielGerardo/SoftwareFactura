/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author danyj
 */
public class CM_Recursos {
    public static String convertirSHA256(String password) {
	MessageDigest md = null;
	try {
		md = MessageDigest.getInstance("SHA-256");
	} 
	catch (NoSuchAlgorithmException e) {		
		e.printStackTrace();
		return null;
	}
	    
	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();
	    
	for(byte b : hash) {        
		sb.append(String.format("%02x", b));
	}
	    
	return sb.toString();
}
    
    public boolean validador(String validar,String expresion){        
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(expresion);
        //Create instance of matcher   
        Matcher matcher = pattern.matcher(validar);
        
        if(matcher.matches()){
        return true;
        }else{
        return false;    
        }        
    }
    
   
    
    public static byte[] iconByte(JLabel icon)
{      byte[] bytes = {};
    try {
        
        Icon img = icon.getIcon();
        BufferedImage bi = new BufferedImage(img.getIconWidth(), img.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        img.paintIcon(null, g, 0, 0);
        g.setColor(Color.WHITE);
        g.drawString(icon.getText(), 10, 20);
        g.dispose();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(bi, "jpg", os);
        InputStream fis = new ByteArrayInputStream(os.toByteArray());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        for (int readNum; (readNum = fis.read(buf)) != -1;) {
            bos.write(buf, 0, readNum);
            System.out.println("read " + readNum + " bytes,");
            }
        bytes = bos.toByteArray();
        return bytes;
    } catch (IOException d) {
     
    }
    
    return bytes;
}

}
