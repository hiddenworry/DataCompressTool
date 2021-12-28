/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ziptool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DeflaterInputStream;

/**
 *
 * @author ADMIN
 */
public class FileCompress extends FileZip {

    private FileInputStream fis;
    private DeflaterInputStream deflater = null;
    private FileOutputStream fos = null;

    public FileCompress(String fileDir) {
        super(fileDir);
        try {
            this.fis = new FileInputStream(fileDir);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileCompress.class.getName()).log(Level.SEVERE, null, ex);
        }
        ;
    }

    public void compressFile(String fileout) {
        try {

            this.deflater = new DeflaterInputStream(fis);
            this.fos = new FileOutputStream(fileout);
            Integer code = 0;
            while ((code = deflater.read()) != -1) {
                fos.write(code);
            }
            fos.close();
            fis.close();
            deflater.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 
}
