import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = service.salesAmount(sales);
        System.out.println("Вся сумма продаж: " + sum);

        long avg = service.salesAverage(sales);
        System.out.println("Средняя сумма продаж: " + avg);

        long maxMonth = service.maxSales(sales);
        System.out.println("Месяц Max сумм продаж: " + maxMonth);

        long minMonth = service.minSales(sales);
        System.out.println("Месяц Min сумм продаж: " + minMonth);

        long counterMin = service.minAvgSales(sales);
        System.out.println("Колличество месяцев меньше средней суммы продаж: " + counterMin);

        long counterMax = service.maxAvgSales(sales);
        System.out.println("Колличество месяцев больше средней суммы продаж: " + counterMax);
    }
}