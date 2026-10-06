public class Main {

    public static void main(String[] args) {

        ListaEstudiantes lista = new ListaEstudiantes();

        // El CI se usa con formato "dd/mm/aaaa" para poder filtrar por mes
        lista.add(new Estudiante("01/05/2003", "Ana",   "Pérez",  "F", 2, true,  true));
        lista.add(new Estudiante("15/05/2002", "Luis",  "Gómez",  "M", 3, false, false));
        lista.add(new Estudiante("20/08/2004", "Marta", "Ruiz",   "F", 1, true,  true));
        lista.add(new Estudiante("10/12/2002", "Pedro", "López",  "M", 3, true,  false));
        lista.add(new Estudiante("05/05/2001", "Sofía", "Díaz",   "F", 4, true,  true));
        lista.add(new Estudiante("22/08/2003", "Juan",  "Torres", "M", 2, false, true));
        lista.add(new Estudiante("30/12/2004", "Elena", "Vega",   "F", 1, true,  false));

        //Caso positivo
        System.out.println("=== a) Estudiantes que cumplen en Mayo ===");
        System.out.println(lista.Cumpleaños("05"));

        //Caso positivo
        System.out.println("=== b) Militantes de la UJC ordenados por año (menor a mayor) ===");
        System.out.println(lista.CantMilitantes());

        //Caso positivo
        System.out.println("=== c) Cantidad de estudiantes becados ===");
        System.out.println(lista.CantBecados());

        //Casos negativos
        System.out.println("\n=== Casos negativos ===");

        ListaEstudiantes vacia = new ListaEstudiantes();

        System.out.println("Lista vacía - Cumpleaños:");
        System.out.println(vacia.Cumpleaños("05"));

        System.out.println("Lista vacía - CantMilitantes:");
        System.out.println(vacia.CantMilitantes());

        System.out.println("Lista vacía - CantBecados:");
        System.out.println(vacia.CantBecados());

        // Lista sin militantes
        ListaEstudiantes sinMilitantes = new ListaEstudiantes();
        sinMilitantes.add(new Estudiante("01/01/2003", "Carlos", "Mena", "M", 2, false, true));
        sinMilitantes.add(new Estudiante("02/02/2003", "Diana",  "Sosa", "F", 1, false, false));
        System.out.println("Sin militantes - CantMilitantes:");
        System.out.println(sinMilitantes.CantMilitantes());

        // Mes sin cumpleaños
        System.out.println("Mes sin cumpleaños (07) - Cumpleaños:");
        System.out.println(lista.Cumpleaños("07"));
    }
}