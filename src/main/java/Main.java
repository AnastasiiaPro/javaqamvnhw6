import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.salesAmount(sales);
        System.out.println("Вся сумма продаж: " + sum);

        int avg = service.salesAverage(sales);
        System.out.println("Средняя сумма продаж: " + avg);

        int maxMonth = service.maxSales(sales);
        System.out.println("Месяц Max сумм продаж: " + maxMonth);

        int minMonth = service.minSales(sales);
        System.out.println("Месяц Min сумм продаж: " + minMonth);

        int countMin = service.minAvgSales(sales);
        System.out.println("Колличество месяцев меньше средней суммы продаж: " + countMin);

        int countMax = service.minAvgSales(sales);
        System.out.println("Колличество месяцев больше средней суммы продаж: " + countMax);
    }
}