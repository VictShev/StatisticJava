import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void getSalesSum() {

        StatsService service = new StatsService();

        long[] sales = {500, 250, 770, 210, 1010, 400, 1500, 180, 1900, 330, 990, 180};

        long expectedSum = 8220;
        long actualSum = service.getSalesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void getSalesAverage() {

        StatsService service = new StatsService();

        long[] sales = {500, 250, 770, 210, 1010, 400, 1500, 180, 1900, 330, 990, 180};

        long expectedAverage = 685;
        long actualAverage = service.getSalesAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void getMaxSales() {

        StatsService service = new StatsService();

        long[] sales = {500, 250, 770, 210, 1010, 400, 1500, 180, 1900, 330, 990, 180};

        long expectedMax = 9;
        long actualMax = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void getMinSales() {

        StatsService service = new StatsService();

        long[] sales = {500, 250, 770, 210, 1010, 400, 1500, 180, 1900, 330, 990, 180};

        long expectedMin = 12;
        long actualMin = service.getMinSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void getMonthsBelowAverage() {

        StatsService service = new StatsService();

        long[] sales = {500, 250, 770, 210, 1010, 400, 1500, 180, 1900, 330, 990, 180};

        long expectedMonthsBelow = 7;
        long actualMonthsBelow = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedMonthsBelow, actualMonthsBelow);
    }
    @Test
    public void getMonthsOverAverage() {

        StatsService service = new StatsService();

        long[] sales = {500, 250, 770, 210, 1010, 400, 1500, 180, 1900, 330, 990, 180};

        long expectedMonthsOver = 5;
        long actualMonthsOver = service.getMonthsOverAverage(sales);

        Assertions.assertEquals(expectedMonthsOver, actualMonthsOver);
    }
}



