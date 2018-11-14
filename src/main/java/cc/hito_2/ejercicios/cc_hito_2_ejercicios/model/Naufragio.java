package cc.hito_2.ejercicios.cc_hito_2_ejercicios.model;

public class Naufragio {

    private long id;
    private String nombre;
    private String descripcion;
    private int anoDescubrimiento;

    public  Naufragio(){}

    public Naufragio(long id, String nombre, String descripcion, int anoDescubrimiento) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.anoDescubrimiento = anoDescubrimiento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnoDescubrimiento() {
        return anoDescubrimiento;
    }

    public void setAnoDescubrimiento(int anoDescubrimiento) {
        this.anoDescubrimiento = anoDescubrimiento;
    }
}
