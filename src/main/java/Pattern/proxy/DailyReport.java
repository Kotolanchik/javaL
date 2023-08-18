package Pattern.proxy;

import java.time.LocalDate;

public class DailyReport implements Report{
    @Override
    public String prepare(LocalDate date) {
        // Сложные операции на получение различной информации из бд
        // формирование отчёта
        return "Сформированный отчёт от " + date;
    }
}
