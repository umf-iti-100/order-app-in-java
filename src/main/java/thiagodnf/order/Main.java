package thiagodnf.order;

import thiagodnf.order.utils.ConsoleUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        while(true){

            System.out.println("Menu:");
            System.out.println("1 - Add Order Item");
            System.out.println("2 - List Orders");
            System.out.println("3 - Remove Order Item");
            System.out.println("4 - Exit");

            int option = ConsoleUtils.askInteger("Option: ");

            switch (option){
                case 1:
                    addOrderItem();
                    break;
                case 2:
                    listOrders();
                    break;
                case 3:
                    removeOrderItemById();
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Invalid Option. Try it again!");
            }
        }
    }

    public static void addOrderItem(){

        System.out.println("Add Order Item");
        int amount = ConsoleUtils.askInteger("Amount: ");
        double value = ConsoleUtils.askDouble("Value: ");
        double discount = ConsoleUtils.askDouble("Discount: ");

        OrderItem oi = new OrderItem(amount, value, discount);

        Database.getInstance().save(oi);
    }

    public static void listOrders(){

        System.out.println("List Order Items:");

        List<OrderItem> items = Database.getInstance().getAll();

        for(OrderItem oi : items){
            System.out.println(oi);
        }
    }

    public static void removeOrderItemById(){

        System.out.println("Remove Order Item by Id:");

        int id = ConsoleUtils.askInteger("Id: ");

        Database.getInstance().removeById(id);
    }
}