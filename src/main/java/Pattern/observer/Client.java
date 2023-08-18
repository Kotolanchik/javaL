package Pattern.observer;

import Pattern.proxy.DailyReport;
import Pattern.proxy.ProxyDailyReport;
import Pattern.proxy.Report;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        Reader rodjer = new Reader("rodjer");
        Reader ivan = new Reader("ivan");
        Reader greg = new Reader("greg");

        newspaper.addSubscriber(rodjer);
        newspaper.addSubscriber(ivan);
        newspaper.addSubscriber(greg);
        System.out.println("\n");

        newspaper.createNews("Начался турнир по доте");

        System.out.println("\n");
        newspaper.removeSubscriber(ivan);
        newspaper.removeSubscriber(greg);
        System.out.println("\n");

        newspaper.createNews("Начался стрим ростика");

    }

}
