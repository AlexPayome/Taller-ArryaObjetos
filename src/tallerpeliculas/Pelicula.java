package tallerpeliculas;
//@autor Alex Payome
public class Pelicula {
    private int numero;
    private String nombre;
    private String director;
    private int año;
    private String reseña;
    private int numEntradas;
    
    public Pelicula(int num,String n, String d, int a, String r, int nE){
        numero=num;
        nombre=n;
        director=d;
        año=a;
        reseña=r;
        numEntradas=nE;
    }
    @Override
    public String toString(){
        return ("Nombre: "+nombre+
                "\nDirector: "+director+
                "\nAño: "+año+
                "\nReseña: "+reseña+
                "\nEntradas vendidas: "+numEntradas);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public int getNumEntradas() {
        return numEntradas;
    }

    public void setNumEntradas(int numEntradas) {
        this.numEntradas = numEntradas;
    }
    
}
