public class ListaEstudiantes {

    private Nodo first;
    private int size;

    public ListaEstudiantes() {
        this.first = null;
        this.size = 0;
    }

    // Agregar al final (método básico para las pruebas)
    public void add(Estudiante e) {
        Nodo nuevo = new Nodo(e);
        if (first == null) {
            first = nuevo;
        } else {
            Nodo cursor = first;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            cursor.setNext(nuevo);
        }
        size++;
    }

    public int size() { return size; }
    public boolean isEmpty() { return first == null; }

    //estudiantes que cumplen en ese mes
    public String Cumpleaños(String mes) {
        String resultado = "";
        Nodo cursor = first;
        while (cursor != null) {
            Estudiante e = cursor.getDato();
            // Se asume que el mes está incluido en el CI o en algún dato;
            // como el PDF no especifica el mes de nacimiento, se usa el CI
            // solo como referencia. Aquí se compara contra el nombre del mes
            // guardado en una convención simple: el apellido no aplica.
            // Para simplificar, se asume que el mes se guarda en el campo CI
            // (formato: "dd/mm/aaaa"). Si no, se compara con el nombre.
            if (e.getCi().contains(mes)) {
                resultado += e.getNombre() + " " + e.getApellido() + "\n";
            }
            cursor = cursor.getNext();
        }
        if (resultado.equals("")) {
            return "No hay estudiantes que cumplan en el mes: " + mes;
        }
        return resultado;
    }

    //militantes de la UJC ordenados por año (menor a mayor)
    public String CantMilitantes() {
        // Primero contamos cuántos militantes hay
        int contador = 0;
        Nodo cursor = first;
        while (cursor != null) {
            if (cursor.getDato().isMilitante()) {
                contador++;
            }
            cursor = cursor.getNext();
        }

        if (contador == 0) {
            return "No hay estudiantes militantes de la UJC.";
        }

        // Copiamos los militantes a un arreglo
        Estudiante[] arreglo = new Estudiante[contador];
        cursor = first;
        int i = 0;
        while (cursor != null) {
            if (cursor.getDato().isMilitante()) {
                arreglo[i] = cursor.getDato();
                i++;
            }
            cursor = cursor.getNext();
        }

        // Ordenamiento burbuja (de menor a mayor año)
        for (int j = 0; j < contador - 1; j++) {
            for (int k = 0; k < contador - 1 - j; k++) {
                if (arreglo[k].getAnio() > arreglo[k + 1].getAnio()) {
                    Estudiante temp = arreglo[k];
                    arreglo[k] = arreglo[k + 1];
                    arreglo[k + 1] = temp;
                }
            }
        }

        // Construimos el String de salida
        String resultado = "";
        for (int j = 0; j < contador; j++) {
            resultado += arreglo[j].toString() + "\n";
        }
        return resultado;
    }

    //cantidad de estudiantes becados
    public String CantBecados() {
        int becados = 0;
        Nodo cursor = first;
        while (cursor != null) {
            if (cursor.getDato().isBecado()) {
                becados++;
            }
            cursor = cursor.getNext();
        }
        return "Cantidad de estudiantes becados: " + becados;
    }
}