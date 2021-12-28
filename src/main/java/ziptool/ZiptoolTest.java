/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ziptool;

/**
 *
 * @author ADMIN
 */
public class ZiptoolTest {
    public static void main(String[] args) {
        FileCompress f = new FileCompress("a.txt");
        f.compressFile("b.zip");
        
        //Decompress
        FileDecompress d = new FileDecompress("b.zip");
        d.decompress("a1.txt");
        
       
        
    }
}
