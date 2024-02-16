package pro.sky.SpringHwProject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.SpringHwProject.model.ShoppingBasket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class ShoppingService {
    private final List<ShoppingBasket> products = new ArrayList<>();


    public void changeProduct(List<Integer> id) {
        id.stream()
                .map(c -> new ShoppingBasket("cucumber", 100.00, 1, c))
                .forEach(sb -> products.add(sb));
    }

    public List<ShoppingBasket> printID() {

        return Collections.unmodifiableList(products);
    }
}
