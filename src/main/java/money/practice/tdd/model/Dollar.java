package money.practice.tdd.model;

public class Dollar {

    public int amount;

    public Dollar(int money){
        this.amount = money;
    };

    public Dollar times(int multiplier) {
        return new Dollar(amount*multiplier);
    }

    public int getAmount(){
        return amount;
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }


}
