package pro.sky.SpringHwProject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.SpringHwProject.model.ShoppingBasket;

import java.util.*;

@Service
@SessionScope
public class ShoppingService {

    Set<Integer> item = new HashSet<>();

    public void changeProduct(Set<Integer> id) {
        for (Integer i : id) {
            item.add(i);
        }
    }

    public Set<Integer> printID() {
        return Collections.unmodifiableSet(item);
    }
}
