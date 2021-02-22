package money.practice.tdd.model;

public class Dollar {

    private int amount;

    public Dollar(int money){
        this.amount = money;
    };

    public void times(int multiplier) {
        amount *= multiplier;
    }

    public int getAmount(){
        return amount;
    }
}
