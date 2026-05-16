import java.util.*;

// Stock Class
class Stock {

    String symbol;
    double price;

    Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }
}

// Portfolio Class
class Portfolio {

    HashMap<String, Integer> holdings = new HashMap<>();

    // Buy Stock
    void buyStock(Stock stock, int qty) {

        holdings.put(
                stock.symbol,
                holdings.getOrDefault(stock.symbol, 0) + qty
        );

        System.out.println("Bought " + qty + " shares of " + stock.symbol);
    }

    // Sell Stock
    void sellStock(Stock stock, int qty) {

        if (!holdings.containsKey(stock.symbol)) {
            System.out.println("Stock not found!");
            return;
        }

        int currentQty = holdings.get(stock.symbol);

        if (currentQty < qty) {
            System.out.println("Not enough shares!");
            return;
        }

        holdings.put(stock.symbol, currentQty - qty);

        System.out.println("Sold " + qty + " shares of " + stock.symbol);
    }

    // Display Portfolio
    void displayPortfolio() {

        System.out.println("\n--- Portfolio ---");

        if (holdings.isEmpty()) {
            System.out.println("No stocks available.");
            return;
        }

        for (String stock : holdings.keySet()) {
            System.out.println(stock + " : " + holdings.get(stock) + " shares");
        }
    }
}

// Main Class
public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock apple = new Stock("AAPL", 180);

        Portfolio portfolio = new Portfolio();

        int choice;
        int qty;

        while (true) {

            System.out.println("\n1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();

                    portfolio.buyStock(apple, qty);
                    break;

                case 2:

                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();

                    portfolio.sellStock(apple, qty);
                    break;

                case 3:

                    portfolio.displayPortfolio();
                    break;

                case 4:

                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}