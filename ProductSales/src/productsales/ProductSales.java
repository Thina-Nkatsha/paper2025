package productsales;

public class ProductSales implements IProduct {

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;

        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col];
            }
        }

        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = 0;

        for (int row = 0; row < productSales.length; row++) {
            count += productSales[row].length;
        }

        return (double) total / count;
    }

    @Override
    public int MaxSale(int[][] productSales) {
        int maximum = productSales[0][0];

        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > maximum) {
                    maximum = productSales[row][col];
                }
            }
        }

        return maximum;
    }

    @Override
    public int MinSale(int[][] productSales) {
        int minimum = productSales[0][0];

        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] < minimum) {
                    minimum = productSales[row][col];
                }
            }
        }

        return minimum;
    }
}
