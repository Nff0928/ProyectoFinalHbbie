
package ejerciciohobbie2;

public class Hobbie {
    private String nombre;
    private int puntos ;
    private String ciudad;
    

    public Hobbie(String nombre, int puntos,String ciudad) {
        this.puntos = puntos;
        this.ciudad = ciudad;
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
    public Object[] toArray(){
        Object[] obj = new Object[3];
        
        obj[0] = nombre;
        obj[1] = puntos;
        obj[2] = ciudad;
        
        return obj; 
    }
    
    @Override
    public String toString() {
        return this.nombre+" - "+this.puntos +" - "+this.ciudad;
    }  
}
