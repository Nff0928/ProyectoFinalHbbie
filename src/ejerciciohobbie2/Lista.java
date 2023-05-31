package ejerciciohobbie2;

import java.util.LinkedList;
import java.util.List;

public class Lista {
    
    private  LinkedList <Hobbie> listaHobbies = new LinkedList<>();

    public LinkedList<Hobbie> getListaHobbies() {
        return listaHobbies;
    }

    public void setListaHobbies(LinkedList<Hobbie> listaHobbies) {
        this.listaHobbies = listaHobbies;
    }
    
    
    //public List <Hobbie> listaHobbies = new LinkedList<>();
    
       public void lista (Hobbie h){
        listaHobbies.add(h);    
    }
    public void imprimir(){
        for(Hobbie h:getListaHobbies()){
            System.out.println(h);
        }
    }
    
    
    
    
    
    
    
    
}
