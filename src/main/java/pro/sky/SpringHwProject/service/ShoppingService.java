package pro.sky.SpringHwProject.service;

import org.springframework.stereotype.Service;
import pro.sky.SpringHwProject.model.ShoppingBasket;

import java.util.*;

@Service
public class ShoppingService {
    private final ShoppingBasket shoppingBasket;

    public ShoppingService(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public void changeProduct(Integer...id) {
        shoppingBasket.add(id);
        }

    public Collection<Integer> printID() {
        return shoppingBasket.get();
    }
}
