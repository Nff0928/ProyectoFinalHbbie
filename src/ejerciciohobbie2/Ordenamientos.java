package ejerciciohobbie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ordenamientos {


//    public List <Hobbie> listaHobbies = new LinkedList<Hobbie>();
//    
//    public void Lista (Hobbie h){
//        listaHobbies.add(h);    
//    }
//    public void imprimir(){
//        for(Hobbie h:listaHobbies){
//            System.out.println(h);
//        }
//    }
    
    /*BubbleSort LinkedList*/
     public Lista bubbleSort (Lista hobbie){
        
        for (int i = 1; i < hobbie.getListaHobbies().size() ; i++)
            for (int j = 0; j < hobbie.getListaHobbies().size() - 1; j++)
                if (hobbie.getListaHobbies().get(j).getPuntos() > hobbie.getListaHobbies().get(j + 1).getPuntos()){
                     Hobbie temp =  hobbie.getListaHobbies().get(j);
                    hobbie.getListaHobbies().set(j, hobbie.getListaHobbies().get(j + 1));
                    hobbie.getListaHobbies().set(j + 1, temp);
                }
        
        return hobbie;
    }
     /*BubbleSort Arreglo*/
    public void ordenarBurbujaArreglo(int[] puntos){
        for (int i = 1; i < puntos.length - 1; i++)
            for (int j = 1; j < puntos.length - 1 - 1; j++)
                if (puntos[j] > puntos[j + 1]){
                    int temp = (int) puntos[j];
                    puntos[j] = puntos[j+1];
                    puntos[j+1]=temp;
                }
    }
     
     
    /*InsertionSort LinkedList*/
    public Lista InsertionSort  (Lista hobbie){
        
        for (int i = 1; i < hobbie.getListaHobbies().size(); ++i) {
            Hobbie key =  hobbie.getListaHobbies().get(i);
            int j = i - 1;
            while (j >= 0 && hobbie.getListaHobbies().get(j).getPuntos() < key.getPuntos()) {
                hobbie.getListaHobbies().set(j + 1, hobbie.getListaHobbies().get(j));
                j = j - 1;
            }
            hobbie.getListaHobbies().set(j + 1, key);
        }
        return hobbie;
    }
    /*InsertionSort Arreglo*/
    public void ordenaminetoInsertSortArreglo(int[] miArreglo){
        for (int i = 1; i < miArreglo.length; ++i) {
            int key =  miArreglo[i];
            int j = i - 1;
            while (j >= 0 && miArreglo.length > key) {
                miArreglo[j+1]=miArreglo[j];
                j = j - 1;
            }
            miArreglo[j+1]=key;
        }
        
    }
    
    /*quicksortLinkedList*/
    public static void quicksortLinkedList(LinkedList puntos, int izq, int der) {

        int pivote=(int) puntos.get(izq); // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while((int)puntos.get(i) <= pivote && i < j) i++; // busca elemento mayor que pivote
           while((int)puntos.get(j) > pivote) j--;           // busca elemento menor que pivote
           if (i < j) {                        // si no se han cruzado                      
               aux= (int)puntos.get(i);                      // los intercambia
               puntos.set(i, puntos.get(j));
               puntos.set(j, aux);
           }
         }

         puntos.set(izq, puntos.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
         puntos.set(j, pivote);      // los menores a su izquierda y los mayores a su derecha

         if(izq < j-1)
            quicksortLinkedList(puntos,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksortLinkedList(puntos,j+1,der);          // ordenamos subarray derecho

      }
    
    /*quicksort Arreglo*/
    public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
           while(A[j] > pivote) j--;           // busca elemento menor que pivote
           if (i < j) {                        // si no se han cruzado                      
               aux= A[i];                      // los intercambia
               A[i]=A[j];
               A[j]=aux;
           }
         }

         A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

         if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho

      }

    
    /*BucketSortLinkedList*/
        public void bucketSortLinkedList(LinkedList puntos, int n) {
    if (n <= 0)
      return;
    @SuppressWarnings("unchecked")
    LinkedList<Float>[] bucket = new LinkedList[n];

    // Create empty buckets
    for (int i = 0; i < n; i++)
      bucket[i] = new LinkedList<Float>();

    // Add elements into the buckets
    for (int i = 0; i < n; i++) {
      int bucketIndex = (int) puntos.get(i) * n;
      bucket[bucketIndex].add((Float) puntos.get(i));
    }

    // Sort the elements of each bucket
    for (int i = 0; i < n; i++) {
      Collections.sort((bucket[i]));
    }

    // Get the sorted array
    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0, size = bucket[i].size(); j < size; j++) {
        puntos.set(index++, bucket[i].get(j));
      }
    }
  }

    
    /*BucketSortArreglo*/
    
    public void bucketSort(float[] arr, int n) {
    if (n <= 0)
      return;
    @SuppressWarnings("unchecked")
    ArrayList<Float>[] bucket = new ArrayList[n];

    // Create empty buckets
    for (int i = 0; i < n; i++)
      bucket[i] = new ArrayList<Float>();

    // Add elements into the buckets
    for (int i = 0; i < n; i++) {
      int bucketIndex = (int) arr[i] * n;
      bucket[bucketIndex].add(arr[i]);
    }

    // Sort the elements of each bucket
    for (int i = 0; i < n; i++) {
      Collections.sort((bucket[i]));
    }

    // Get the sorted array
    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0, size = bucket[i].size(); j < size; j++) {
        arr[index++] = bucket[i].get(j);
      }
    }
  }


    



   
}
