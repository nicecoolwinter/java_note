// 一個檔案可以有多個class , 但只有能一個 public class 且必須是 main 進入點的class 是 public

class CashCard {
    private String number;
    private int balance;
    private int bonus;

    // 建構函數 作用是將物件初始化
    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money) {  // 儲值時呼叫的方法
        if(money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bonus += money / 1000;
                System.out.println("bonus:" + bonus);
            }
        }
        else {
            System.out.println("儲值是負的？你是來亂的嗎？");
        }
    }

    void charge(int money) { // 扣款時呼叫的方法
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            }
            else {
                System.out.println("錢不夠啦！");
            }
        }
        else {
            System.out.println("扣負數？這不是叫我儲值嗎？");
        }
    }

    int exchange(int bonus) {  // 兌換紅利點數時呼叫的方法
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    // 查詢餘額
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

        cards[3].show();
        cards[3].exchange(1);
        cards[3].show();

        for(CashCard card : cards) {
            card.show();
        }
    }
}
