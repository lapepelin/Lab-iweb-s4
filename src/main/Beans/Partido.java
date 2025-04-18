package main.Beans;

public class Partido{

    private int idEquipo;
    private String equipoLocal;
    private String equipoVisitante;
    private String marcadorFinal;

    public int getIDEquipo() {
        return idEquipo;
    }

    public void setIDEquipo(String iDEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipolocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;}

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;}

    public String getMarcadorFinal() {
        return marcadorFinal;
    }

    public void setMarcadorFinal(String marcadorFinal) {
        this.marcadorFinal = marcadorFinal;
    }
}