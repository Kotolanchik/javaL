package Pattern.proxy;

import java.time.LocalDate;
import java.util.concurrent.ConcurrentHashMap;

public class ProxyDailyReport implements Report {
    private final DailyReport dailyReport;
    private static final ConcurrentHashMap<LocalDate, String> cache = new ConcurrentHashMap<>();

    public ProxyDailyReport(DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String prepare(LocalDate date) {
        if (cache.get(date) == null) {
            String report = dailyReport.prepare(date);
            cache.put(date, report);
            return report;
        }
        return cache.get(date);
    }
}
