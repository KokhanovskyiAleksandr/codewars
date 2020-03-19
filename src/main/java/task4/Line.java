package task4;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        String isVasyaCanSellATicket = "YES";
        int totalMoney = 0;
        // 3 dollar bill
        int billOf25 = 0;
        int billOf50 = 0;
        int billOf100 = 0;
        for (int money : peopleInLine) {
            switch (money) {
                case 25:
                    billOf25++;
                    break;
                case 50:
                    billOf50++;
                    break;
                case 100:
                    billOf100++;
                    break;
            }

        }
        return isVasyaCanSellATicket;
    }
}