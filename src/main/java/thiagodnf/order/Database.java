package thiagodnf.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Database {

    private static Database instance = null;
    
    public List<OrderItem> orderItems = new ArrayList<>();
    
    public static Database getInstance(){

        if(instance == null){
            instance = new Database();
        }

        return instance;
    }


    public void save(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public void removeById(int id){
        orderItems = orderItems.stream().filter(el -> el.id != id).toList();
    }

    public List<OrderItem> getAll() {
        return orderItems;
    }
}


