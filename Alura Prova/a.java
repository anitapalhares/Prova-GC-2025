import java.time.LocalDate;

public class a {
    public static void main(String[] args) {
        LocalDate base = LocalDate.of(2025, 6, 1); // 1º de junho de 2025
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3); // adiciona (7 * 2 - 3) dias
        System.out.println(novaData.getDayOfMonth()); // imprime o dia do mês
    }
}