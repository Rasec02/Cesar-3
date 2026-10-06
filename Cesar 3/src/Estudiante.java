public class Estudiante {
    private String ci;
    private String nombre;
    private String apellido;
    private String sexo;      // "M" o "F"
    private int anio;
    private boolean militante; // true si es militante de la UJC
    private boolean becado;    // true si es becado

    public Estudiante(String ci, String nombre, String apellido, String sexo,
                      int anio, boolean militante, boolean becado) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.anio = anio;
        this.militante = militante;
        this.becado = becado;
    }

    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getSexo() { return sexo; }
    public int getAnio() { return anio; }
    public boolean isMilitante() { return militante; }
    public boolean isBecado() { return becado; }

    @Override
    public String toString() {
        return ci + " - " + nombre + " " + apellido + " - " + sexo +
                " - Año: " + anio +
                " - Militante: " + (militante ? "Sí" : "No") +
                " - Becado: " + (becado ? "Sí" : "No");
    }
}