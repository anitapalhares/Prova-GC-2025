import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class i implements Comparable<i> {
    String titulo;

    public i(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(i outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }

    public static void main(String[] args) {
        List<i> tarefas = new ArrayList<>();
        tarefas.add(new i("Estudar"));
        tarefas.add(new i("Almoçar"));
        tarefas.add(new i("Dormir"));
        Collections.sort(tarefas);
        System.out.println(tarefas);
    }
}