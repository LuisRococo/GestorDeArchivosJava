
package Operadores;

import Excepciones.ExIndexNoEncontrado;
import java.io.File;


public class OperadorModeloTabla {
    
    private ModeloTablaMod modelo;
    private final GenericaGuardarObjetos<File> listaArchivos;
    private final GenericaGuardarObjetos<File> listaDirectorios;
    public OperadorModeloTabla (){
        modelo=new ModeloTablaMod();
        listaArchivos=new GenericaGuardarObjetos<>();
        listaDirectorios=new GenericaGuardarObjetos<>();
    }
    
    public boolean abrirDirectorio(String direccion){
        File fl=new File (direccion);
        if (fl.isDirectory()){
            reiniciar();
            guardarArchivosDirectorios(fl);
            generarModeloTabla();
            return true;
        }
        else{
            return false;
        }
    }
    
    public File regresarFilePorIndex(int index) throws ExIndexNoEncontrado{
        return modelo.regresarArchivoFila(index);
    }
    
    private void guardarArchivosDirectorios(File fl) {
        File filas[] = fl.listFiles();
        if (filas != null) {
            for (File fila : filas) {
                if (fila.isDirectory()) {
                    listaDirectorios.guardarObjeto(fila);
                } else if (fila.isFile()) {
                    listaArchivos.guardarObjeto(fila);
                }
            }
        }
    }
    
    public void reiniciar(){
        listaArchivos.reiniciarLista();
        listaDirectorios.reiniciarLista();
        modelo=new ModeloTablaMod();
    }
    
    public ModeloTablaMod regresarModelo(){
        return modelo;
    }
    
    private void generarModeloTabla(){
        Object objs[]=listaDirectorios.regresarListaObjetos();
        for (Object obj : objs) {
            modelo.agregarFilaModelo(generarFilaTabla((File) obj), (File) obj);
        }
        objs=listaArchivos.regresarListaObjetos();
        for (Object obj : objs) {
            modelo.agregarFilaModelo(generarFilaTabla((File) obj), (File) obj);
        }
    }
    
    private String [] generarFilaTabla(File fl){
        String arr[]=new String[3];
        arr[0]=fl.getName();
        arr[1]=(fl.isDirectory()) ? "-":String.valueOf(fl.length()/1024/1024);
        arr[2]=String.valueOf((fl.isDirectory()?"True":"False"));
        return arr;
    }
}
