package test;

import productsales.ProductSales;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductSalesTest {

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales sales = new ProductSales();

        int result = sales.TotalSales(productSales);

        assertEquals(2200, result);
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {

        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales sales = new ProductSales();

        double result = sales.AverageSales(productSales);

        assertEquals(366.6666666666667, result, 0.001);
    }
}
