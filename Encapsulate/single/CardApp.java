// 一個檔案可以有多個class , 但只有能一個 public class 且必須是 main 進入點的class 是 public

class CashCard {
    private String number;
    private int balance;
    private int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

        void addition(int money) {
        balance += money;
        bonus += money / 500;
    }

    void show() {
        System.out.printf("(%s, %d, %d)%n",
                number, balance, bonus);
    }
}

public class CardApp {
    public static void main(String[] args) {
        // cards is object array.
        CashCard[] cards = {
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000, 1),
            new CashCard("A004", 2000, 2),
            new CashCard("A005", 3000, 3)
        };

        
        for(CashCard card : cards) {
            card.addition(4500);
            card.show();
            //System.out.printf("(%s, %d, %d)%n",
                    //card.number, card.balance, card.bonus);
        }
    }
}
