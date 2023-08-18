package Pattern.proxy;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        prepare(new ProxyDailyReport(new DailyReport()), LocalDate.now());
    }

    private static void prepare(Report report, LocalDate date) {
        System.out.println(report.prepare(date));
    }
}
