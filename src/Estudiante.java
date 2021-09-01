public class Estudiante
{
    String nombre;
    int matricula;
    String materia;
    int calificacion;
    String estado;

    public Estudiante(int matricula, String nombre, String materia, int calificacion)
    {
        setNombre(nombre);
        setMatricula(matricula);
        setMateria(materia);
        setCalificacion(calificacion);
        this.RevisarEstado();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void RevisarEstado()
    {
        if (this.calificacion < 60)
        {
            this.estado = "Reprobado";
        }
        else
        {
            this.estado = "Aprobado";
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getMateria() {
        return materia;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getEstado() {
        return estado;
    }
}
