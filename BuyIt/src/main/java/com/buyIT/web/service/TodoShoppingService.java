package com.buyIT.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.buyIT.web.model.TodoShopping;

@Service
/**
 * 
 * @author MariaDanescu
 *
 */
public class TodoShoppingService {
    private static List<TodoShopping> products = new ArrayList<TodoShopping>();
    private static int productCount = 3;

    static {
        products.add(new TodoShopping(1, "maria", "Casual Dress", new Date(),
                false));
        products.add(new TodoShopping(2, "maria", "Formal Dress", new Date(), false));
        products.add(new TodoShopping(3, "maria", "Party Dress", new Date(),
                false));
    }

    public List<TodoShopping> retrieveProducts(String user) {
        List<TodoShopping> filteredProducts = new ArrayList<TodoShopping>();
        for (TodoShopping product : products) {
            if (product.getUser().equals(user)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public void addforShop(String name, String desc, Date orderDate,
            boolean isDone) {
        products.add(new TodoShopping(++productCount, name, desc, orderDate, isDone));
    }

    public void deleteProduct(int id) {
        Iterator<TodoShopping> iterator = products.iterator();
        while (iterator.hasNext()) {
            TodoShopping todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }
}