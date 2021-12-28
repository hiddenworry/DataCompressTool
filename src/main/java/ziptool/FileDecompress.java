/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ziptool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.InflaterInputStream;

/**
 *
 * @author ADMIN
 */
public class FileDecompress extends FileZip{
    FileInputStream fis = null;
    FileOutputStream fos = null;
    InflaterInputStream iis = null;
    public FileDecompress(String fileDir) {
        super(fileDir);
        try {
            this.fis = new FileInputStream(fileDir);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileDecompress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void decompress(String fileout){
        try {
            fos = new FileOutputStream(fileout);
            iis = new InflaterInputStream(fis);
            int code = 0;
            while ((code = iis.read() )!= -1){
                fos.write(code);
                System.out.println(code);
            }
            fos.close();
            iis.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileDecompress.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileDecompress.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    }
    
}
