package money.practice.tdd.model;

public class Franc extends Money{

    private int amount;

    public Franc(int money){
        this.amount = money;
    };

    public Franc times(int multiplier) {
        return new Franc(amount*multiplier);
    }

}
