package co.edu.cesde.presentation;

public class Main {

    public static void main(String[] args){

        mostrarMenuPrincipal();
    }

    private static void  mostrarMenuPrincipal(){

        System.out.println("==============");
        System.out.println("Sistema de cursos");
        System.out.println("Sistema de Menu");
        System.out.println("1. Estudiante");
        System.out.println("2. Curso");
        System.out.println("3. Matriculas");
        System.out.println("4.Exito");

    }

    private static void mostrarMenuEstudiantes(){

        System.out.println("\n========Menu Estudiantes===========");
        System.out.println("1. Crear");
        System.out.println("2. Buscar Id");
        System.out.println("3. Litar Todos");
        System.out.println("4. Actulizar");
        System.out.println("5. Eliminar");
        System.out.println("6. Volver a Menu Principal");
    }

    private static void mostrarCursoMenu(){
        System.out.println("\n========Menu Curso===========");
        System.out.println("1. Crear");
        System.out.println("2. Buscar Id");
        System.out.println("3. Litar Todos");
        System.out.println("4. Actulizar");
        System.out.println("5. Eliminar");
        System.out.println("6. Volver a Menu Principal");
    }
    private static void mostrarMatriculaMenu(){
        System.out.println("\n========Menu Matricula===========");
        System.out.println("1. Crear Matricula");
        System.out.println("2. Buscar Id");
        System.out.println("3. Litar Todas");
        System.out.println("4. Cancelar");
        System.out.println("5. Eliminar");
        System.out.println("6. Volver a Menu Principal");

    }
}

