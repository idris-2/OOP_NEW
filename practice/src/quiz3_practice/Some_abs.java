package quiz3_practice;

abstract class Card {
    private String cardNo;
    private int balance;

    public Card(String cardNo, int balance){
        this.cardNo = cardNo;
        this.balance = balance;
    }

    public String getCardNo(){
        return this.cardNo;
    }
    public void setCardNo(String cardNo){
        this.cardNo = cardNo;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

    abstract void method();
}

class creditCard extends Card{
    private String cardNo;
    private int balance;
    private int maxMinus;

    public creditCard(String cardNo, int balance, int maxMinus){
        super(cardNo, balance);
        this.maxMinus = maxMinus;
    }

    public int getMaxMinus(){
        return this.maxMinus;
    }
    public void setMaxMinus(){
        this.maxMinus = maxMinus;
    }

    @Override
    public void method(){
        System.out.println("Credit card" + this. maxMinus);
    }
}


class debitCard extends Card{
    private String cardNo;
    private int balance;

    private int dailyLimit;

    public debitCard(String cardNo, int balance, int dailyLimit){
        super(cardNo, balance);
        this.dailyLimit = dailyLimit;
    }

    private int getDailyLimit(){
        return this.dailyLimit;
    }

    private void setDailyLimit(int dailyLimit){

        this.dailyLimit = dailyLimit;

    }

    @Override
    public void method(){
        System.out.println("Sta vec treba ovdje da se pise " + this.dailyLimit);
    }

}

class Bank <T extends Card>{
    private T card;

    public Bank(T card){
        this.card = card;
    }

    public T getCard(){
        return this.card;
    }

    public void setCard(T card){
        this.card = card;
    }

    public void method(){
        System.out.println("AAAA " + this.card);
    }
}

public class Some_abs {
    public static void main(String[] args) {
        Card lol = new creditCard("1624981", 800, 400);
        Bank debil = new Bank(lol);

        debil.method();
    }
}
