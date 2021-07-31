
package Operadores;
import Excepciones.ExIndexNoEncontrado;
import java.util.ArrayList;

public class GenericaGuardarObjetos <E>{
    
    private ArrayList <E> lista;
    public GenericaGuardarObjetos(){
        lista=new ArrayList<>();
    }
    
    public void guardarObjeto(E guardar){
        lista.add(guardar);
    }
    
    public Object regresarObjeto(int posicion) throws ExIndexNoEncontrado{
        if (posicion<0||posicion>=lista.size()){
            throw new ExIndexNoEncontrado();
        }
        else{
            return lista.get(posicion);
        }
    }
    
    public Object[] regresarListaObjetos(){
        Object[] objs=new Object[lista.size()];
        for (int i=0;i<objs.length;i++){
            objs[i]=lista.get(i);
        }
        return objs;
    }
    
    public void reiniciarLista(){
        lista=new ArrayList<>();
    }
    
    public int tamañoLista(){
        return lista.size();
    }
}
