class Solution {

    static class Pair {
        int price;
        int maxStocks;

        Pair(int price, int maxStocks) {
            this.price = price;
            this.maxStocks = maxStocks;
        }
    }

    public static int buyMaximumProducts(int k, int[] price) {

        int n = price.length;

        List<Pair> list = new ArrayList<>();

        // Day i par maximum i+1 stocks buy kar sakte hain
        for (int i = 0; i < n; i++) {
            list.add(new Pair(price[i], i + 1));
        }

        // Cheapest stock pehle kharidne ke liye sort karo
        Collections.sort(list, (a, b) -> a.price - b.price);

        int stocks = 0;

        for (Pair p : list) {

            // Agar poore allowed stocks kharid sakte hain
            if (k >= p.price * p.maxStocks) {

                k -= p.price * p.maxStocks;
                stocks += p.maxStocks;
            }
            else {

                // Jitne buy kar sakte hain utne kharid lo
                stocks += k / p.price;
                break;
            }
        }

        return stocks;
    }
}