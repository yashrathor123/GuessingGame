/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author yashr
 */
public class Gui {
    
   /* Centered Frame */
    public static void _centerFrame(JFrame frame) {
        Rectangle rec = frame.getBounds();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((dim.width - rec.width)/2 , (dim.height - rec.height)/2);
    }
    
    public static void _integerOnly(KeyEvent evt){
        char _character = evt.getKeyChar();
        
        if(Character.isDigit(_character) 
                || _character == KeyEvent.VK_SPACE
                || _character == KeyEvent.VK_DELETE
                || _character == KeyEvent.VK_SLASH){
            
        }
        else {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public static void _message(String message, int errorTye){
        switch(errorTye){
            case 0: 
                JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
            case 1: 
                JOptionPane.showMessageDialog(null, message, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2: 
                JOptionPane.showMessageDialog(null, message, "WARNING", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;
            
        }
    }
    
//    private static String patFileBestScore = System.getProperty("user.dir") + "/src/numberguessinggame/bestscore.ini";
//
//    public static int getCurrentBestScore(){
//        int bestScore;
//        String line, newLine = "";
//        try{
//            BufferedReader buff = new BufferedReader(new FileReader(patFileBestScore));
//            while((line = buff.readLine()) != null){
//                newLine = line;
//            }
//        }catch(FileNotFoundException e){ 
//        } catch (IOException ex) {
//            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        bestScore = Integer.parseInt(newLine.substring(newLine.indexOf("[") + 1, newLine.indexOf("]")));
//        return bestScore;
//    }
}
