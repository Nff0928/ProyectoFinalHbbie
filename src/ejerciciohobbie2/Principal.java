package ejerciciohobbie2;

import ejerciciohobbie2.Hobbie;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    
    //public List <Hobbie> listaHobbies = new LinkedList<>();
    /*
    public void Lista (Hobbie h){
        listaHobbies.add(h);    
    }
    public void imprimir(){
        for(Hobbie h:listaHobbies){
            System.out.println(h);
        }
    }
    public void OrdenarDescendentemente(){
        System.out.println("Descendente");
        for (int i = 1; i < listaHobbies.size(); i++) {
            for (int j = 0; j < listaHobbies.size()-1; j++) {
                if(listaHobbies.get(j).getPuntos() < listaHobbies.get(j+1).getPuntos()){
                    Hobbie aux = listaHobbies.get(j);
                    listaHobbies.set((j), listaHobbies.get(j+1));
                    listaHobbies.set(j+1, aux);
                }
            }
        }
    }
     public void OrdenarAscendentemente(){
         System.out.println("Ascendentemente");
        for (int i = 1; i < listaHobbies.size(); i++) {
            for (int j = 0; j  < listaHobbies.size()-1; j++) {
                if(listaHobbies.get(j).getPuntos() > listaHobbies.get(j+1).getPuntos()){
                    Hobbie aux = listaHobbies.get(j);
                    listaHobbies.set((j), listaHobbies.get(j+1));
                    listaHobbies.set(j+1, aux);
                }
            }
        }
    }*/
    public static void main(String[] args) {
        Lista lis = new Lista();
        Ordenamientos or = new Ordenamientos();
       
        
        Hobbie hb = new Hobbie("millos",11,"bogota");
        lis.lista(hb);
        Hobbie hb1 = new Hobbie("America",10,"Cali");
        lis.lista(hb1);
        
        Hobbie hb2 = new Hobbie("Equidad",22,"Bogota");
        lis.lista(hb2);
        
        Hobbie hb3 = new Hobbie("SantaFe",21,"Bogota");
        lis.lista(hb3);
        
        Hobbie hb4 = new Hobbie("Tolima",7,"tolima");
        lis.lista(hb4);
        
        
        lis.imprimir();
        System.out.println("-----------------------------------------------");
        System.out.println("bubblesort");
        or.bubbleSort(lis);
        lis.imprimir();
        System.out.println("-----------------------------------------------");
        
        System.out.println("insertsort");
        or.InsertionSort(lis);
        lis.imprimir();
        System.out.println("-----------------------------------------------");
    }
}
