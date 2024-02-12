
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        var listaMatriculas = new ArrayList<Matriculas>();
        var listaOpciones = new ArrayList<String>();
        listaOpciones.add("1: MODIFICAR UNA NOTA");

        var pepeuno = "pepe";
        var juan = pepeuno;
        juan = "juan";
        System.out.println(pepeuno + juan);

        for (int i=1; i<=25 ; i++) {
            Matriculas miMatricula = new Matriculas(i, "Programación", 1);
            listaMatriculas.add(miMatricula);
        }

        var nuevoAlumno = new Matriculas();
        System.out.println(nuevoAlumno);
        nuevoAlumno = listaMatriculas.get(23);
        System.out.println(nuevoAlumno);
        nuevoAlumno.setNotaMateria(11);
        //System.out.println(listaMatriculas.toString());

        for (Matriculas estaMatricula : listaMatriculas) {
            System.out.println(estaMatricula);
        }
        
        System.out.print("Introduce id alumno:");
        Scanner sc = new Scanner(System.in);
        Integer numLeido = sc.nextInt();
        System.out.println("");
        System.out.print("Introduce nota:");
        Integer notaLeida = sc.nextInt();

        for (Matriculas estaMatricula : listaMatriculas) {
            if (estaMatricula.getAlumnoId() == numLeido) {
                estaMatricula.setNotaMateria(notaLeida);
            }
        }


        for (Matriculas estaMatricula : listaMatriculas) {
            System.out.println(estaMatricula.toString());
        }

        

        //System.out.println(listaMatriculas.toString());
        
    }
}

public class Matriculas {

    private static Integer aId;
    private String nombreMateria;
    private Integer notaMateria;
    private Integer porfesorId;

    public String getNombreMateria() {
        return nombreMateria;
    }

    public Integer getNotaMateria() {
        return notaMateria;
    }

    public Integer getPorfesorId() {
        return porfesorId;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setNotaMateria(Integer notaMateria) {
        this.notaMateria = notaMateria;
    }

    public void setPorfesorId(Integer porfesorId) {
        this.porfesorId = porfesorId;
    }

    @Override
    public String toString() {
        return "Matriculas [alumnoId=" + alumnoId + ", nombreMateria=" + nombreMateria + ", notaMateria=" + notaMateria
                + ", porfesorId=" + porfesorId + "]";
    }

    public Matriculas(Integer alumnoId, String nombreMateria, Integer porfesorId) {
        this.alumnoId = alumnoId;
        this.nombreMateria = nombreMateria;
        this.porfesorId = porfesorId;
    }

    public Matriculas() {
    }

}