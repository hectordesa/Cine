public class Sala {

    private int nsala;
    private Pelicula pelicula;
    private String[][] butacas;

    public Sala(int nsala, Pelicula pelicula, int fila, int col) {
        this.nsala = nsala;
        this.pelicula = pelicula;
        butacas = new String[fila][col];
    }

    public int getNsala() {
        return nsala;
    }

    public void setNsala(int nsala) {
        this.nsala = nsala;
    }

    public String[][] getButacas() {
        return butacas;
    }

    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }


}