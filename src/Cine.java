public class Cine {

    private String nombre;
    private int aforo;
    private Sala[] salas;
    Pelicula peliculas[] = {new Pelicula("KUNG-FU PANDA", 120), new Pelicula("SHREK", 100), new Pelicula("CARS", 180), new Pelicula("UP", 160), new Pelicula("NEMO", 130)};

    public Cine(String nombre, int aforo, int nsalas, int fila, int col) {
        this.nombre = nombre;
        this.aforo = aforo;
        salas = new Sala[nsalas];

        for (int i = 0; i<salas.length;i++) {
            salas[i] = new Sala(i, null, fila, col);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        if (aforo < 0) {
            System.out.println("ERROR. EL AFORO NO PUEDE SER NEGATIVO");
        }
        this.aforo = aforo;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

}