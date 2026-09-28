package productsales;

public class ProductSalesApp {

    public static void main(String[] args) {

        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales sales = new ProductSales();

        System.out.println("PRODUCT SALES REPORT");
        System.out.println("====================");
        System.out.println();

        System.out.println("Year 1:");
        System.out.println("Quarter 1: " + productSales[0][0]);
        System.out.println("Quarter 2: " + productSales[0][1]);
        System.out.println("Quarter 3: " + productSales[0][2]);

        System.out.println();

        System.out.println("Year 2:");
        System.out.println("Quarter 1: " + productSales[1][0]);
        System.out.println("Quarter 2: " + productSales[1][1]);
        System.out.println("Quarter 3: " + productSales[1][2]);

        System.out.println();
        System.out.println("--------------------");

        System.out.println("Total Sales: " + sales.TotalSales(productSales));
        System.out.println("Average Sales: " + sales.AverageSales(productSales));
        System.out.println("Maximum Sale: " + sales.MaxSale(productSales));
        System.out.println("Minimum Sale: " + sales.MinSale(productSales));
    }
}
