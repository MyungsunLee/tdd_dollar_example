package money.practice.tdd.model;

public class Dollar extends Money{

    private int amount;

    public Dollar(int money){
        this.amount = money;
    };

    public Dollar times(int multiplier) {
        return new Dollar(amount*multiplier);
    }

    public int getAmount(){
        return amount;
    }


}
