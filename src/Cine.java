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

    public void mostrarsalas() {
        for (int i = 0; i<salas.length;i++){
            getSalas()[i].setPelicula(peliculas[i]);
            System.out.println("SALA " + (i+1));
            System.out.println("");
            System.out.println("PELICULA: " + getSalas()[i].getPelicula().getNombre());
            System.out.println("DURACION: " + getSalas()[i].getPelicula().getDuracion()+ " minutos");
            System.out.println("--------------------------------------------");
        }
    }

    public void compra(int sala, int fila, int col, String correo){
        getSalas()[sala].getButacas()[fila-1][col-1] = correo;
    }

    public void mostrarmatriz(int sala, String correo){
        if (sala < salas.length && sala > 0){
            for(int i = 0; i<getSalas()[sala].getButacas().length; i++){
                for (int j = 0; j<getSalas()[sala].getButacas()[i].length;j++){
                    if(getSalas()[sala].getButacas()[i][j] == null) {
                        System.out.print("libre" + " ");
                    }else {
                        System.out.print(correo + "  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("LA SALA SELECCIONADA NO EXISTE");
        }
    }
}