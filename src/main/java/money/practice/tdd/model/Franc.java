package money.practice.tdd.model;

public class Franc {

    private int amount;

    public Franc(int money){
        this.amount = money;
    };

    public Franc times(int multiplier) {
        return new Franc(amount*multiplier);
    }

    public int getAmount(){
        return amount;
    }

    public boolean equals(Object object){
        Franc dollar = (Franc) object;
        return amount == dollar.amount;
    }

}
