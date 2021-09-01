public class Practica2 {
    public static void main(String args[]){

        //Declaración del arreglo; dimensionamiento con el operador new
        Estudiante est[] = new Estudiante[10];

        est[0] = new Estudiante(1234567,"Luis","POO", 50);
        est[1] = new Estudiante(2345678,"Juan","Robotica", 40);
        est[2] = new Estudiante(8765432,"Karyme","Artes", 98);
        est[3] = new Estudiante(5436213,"Perla","Español", 78);
        est[4] = new Estudiante(1987654,"Marcos","Etica", 53);
        //Incialización de elemento por elemento del arreglo; cada elemento del arreglo es un objeto del tipo Estudiante
        for(int i = 5; i < 10; i++){
            System.out.println("Estudiante numero: " + (i+1));
            est[i] = new Estudiante(CapturaEntrada.capturarEntero("Matricula"),CapturaEntrada.capturarString("Nombre"),CapturaEntrada.capturarString("Materia"),CapturaEntrada.capturarEntero("Calificacion"));
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Estudiante " + (i+1));
            System.out.println("Nombre: " + est[i].nombre);
            System.out.println("Matricula: " + String.valueOf(est[i].matricula));
            System.out.println("Materia: " + est[i].materia);
            System.out.println("Correo: " + est[i].calificacion);
            System.out.println("Grupo: " + est[i].estado);
        }
    }
}
