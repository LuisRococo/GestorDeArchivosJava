
package Operadores;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Excepciones.ExIndexNoEncontrado;

public class ModeloTablaMod extends DefaultTableModel{
   
    private final ArrayList <File> ARCHIVOS;
    private static final String[] COLUMNAS={"NOMBRE","PESO (MB)","DIRECTORIO"};
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ModeloTablaMod (){
        this.setColumnIdentifiers(COLUMNAS);
        ARCHIVOS=new ArrayList<>();
    }
    
    public void agregarFilaModelo(String fila[],File archivo){
        this.addRow(fila);
        ARCHIVOS.add(archivo);
    }
    
    public File regresarArchivoFila(int posicion) throws ExIndexNoEncontrado{
        if (posicion<0||posicion>=ARCHIVOS.size()){
            throw new ExIndexNoEncontrado();
        }
        else{
            return ARCHIVOS.get(posicion);
        }
    }
}
