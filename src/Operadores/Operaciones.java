
package Operadores;

import Excepciones.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


public class Operaciones {
    
    private Operaciones(){}
    
    @SuppressWarnings("UseSpecificCatch")
    public static boolean copiarArchivo(File archivo,File destino) throws ExFormatoDireccionNoValida1, ExErrorIOCopiarArchivos{
        if (!archivo.isFile()||!destino.isDirectory()){
            throw new ExFormatoDireccionNoValida1();
        }
        FileInputStream inPut;
        FileOutputStream outPut;
        BufferedInputStream lector;
        BufferedOutputStream escritor;
        int b;
        try {
            inPut=new FileInputStream(archivo);
            outPut=new FileOutputStream(destino.getPath()+File.separatorChar+archivo.getName());
            lector=new BufferedInputStream(inPut);
            escritor=new BufferedOutputStream(outPut);
            b=lector.read();
            while (b!=-1){
                escritor.write(b);
                b=lector.read();
            }
            escritor.close();
            lector.close();
            return true;
        } catch (Exception ex) {
            throw new ExErrorIOCopiarArchivos();
        }
    }
    
    public static boolean renombrarArchivo(File fl,String nombre){
        return fl.renameTo(new File (fl.getParent()+File.separatorChar+nombre));
    }
    
    public static boolean eliminarArchivo(File fl){
        return fl.delete();
    }
    
    public static boolean crearArchivoTXT(File fl,String nombre) throws IOException, ExFormatoDireccionNoValida2{ 
        File nueva;
        if (!fl.isDirectory()){
            throw new ExFormatoDireccionNoValida2();
        }
        else{
            nueva=new File(fl.getPath()+File.separatorChar+nombre+".txt");
            return nueva.createNewFile();
        }
    }
    
    public static boolean crearDirectorio(File fl,String nombre) throws ExFormatoDireccionNoValida2 { 
        File nueva;
        if (!fl.isDirectory()){
            throw new ExFormatoDireccionNoValida2();
        }
        nueva=new File(fl.getPath()+File.separatorChar+nombre);
        return nueva.mkdir();
    }
    
//    @SuppressWarnings("UseSpecificCatch")
//    public static boolean copiarArchivo(File fila1,File fila2) throws ExFormatoDireccionNoValida1, ExErrorIOCopiarArchivos{
//        FileInputStream reader;
//        FileOutputStream writer;
//        if (!fila1.isFile()||!fila2.isDirectory()){
//            throw new ExFormatoDireccionNoValida1();
//        }
//        else{
//            try{
//                reader=new FileInputStream(fila1);
//                writer=new FileOutputStream(fila2.getPath()+File.separatorChar+fila1.getName());
//                int b=reader.read();
//                while (b!=-1){
//                    writer.write(b);
//                    b=reader.read();
//                }
//                writer.close();
//                reader.close();
//                return true;
//            }catch(Exception e){
//                throw new ExErrorIOCopiarArchivos();
//            }
//        }
//    }
    
    public static boolean ejecutarArchivoTexto(File fl) throws IOException{ 
        if (obtenerExtension(fl).equals("txt")) {
            Desktop.getDesktop().open(fl);
            return true;
        }
        else{
            return false;
        }
    }
    
    private static String obtenerExtension(File fl){
        String nombre=fl.getName();
        String ext="";
        int punto=nombre.lastIndexOf(".");
        if (punto==-1){
            ext="SIN EXTENSION";
        }
        else{
            for (int i=nombre.length()-1;i>punto;i--){
                ext=nombre.charAt(i)+ext;
            }
        }
        return ext;
    }
    
    public static String obtenerInfo(File fl){
        GregorianCalendar grego=new GregorianCalendar();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String nombre,tamaño,fechaMod,oculto,carpeta, readOnly;
        
        nombre = fl.getName();
        grego.setTimeInMillis(fl.lastModified());
        fechaMod = sdf.format(grego.getTime());
        oculto= (fl.isHidden()) ? "SI":"NO";
        readOnly= (fl.canWrite()) ? "SI":"NO";
        if (fl.isDirectory()){
            carpeta="SI";
            return "NOMBRE: "+nombre+"\nFECHA MOD: "+fechaMod+"\nOCULTO: "+oculto+"\nCARPETA: "+carpeta+"\nREAD ONLY: "+readOnly;
        }
        else{
            carpeta="NO";
            tamaño=String.valueOf(fl.length());
            return "NOMBRE: "+nombre+"\nTAMAÑO: "+tamaño+"\nFECHA MOD: "+fechaMod+"\nOCULTO: "+oculto+"\nCARPETA: "+carpeta+"\nREAD ONLY: "+readOnly;
        }
    }
}
