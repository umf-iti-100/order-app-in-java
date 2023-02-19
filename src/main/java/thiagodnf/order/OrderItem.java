package thiagodnf.order;

public class OrderItem {

    public static int COUNTER_ID = 1;

    public int id;

    public int amount = 0;

    public double value = 0;

    public double discount = 0.0;

    public OrderItem(int amount, double value, double discount){

        this.id = COUNTER_ID++;

        this.amount = amount;
        this.value = value;
        this.discount = discount;
    }

    public double getFinalValue(){
        return (this.amount * this.value)*(1.0-discount);
    }

    public String toString(){
        return "id=" + id + ", amount="+amount+ ", value="+value+ ", discount="+discount+ ", finalValue="+getFinalValue();
    }
}
