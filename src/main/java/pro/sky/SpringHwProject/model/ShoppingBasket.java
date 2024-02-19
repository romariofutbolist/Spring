package pro.sky.SpringHwProject.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class ShoppingBasket {

    private final Set<Integer> item = new HashSet<>();

    public void add(Integer...id) {
        item.addAll(Arrays.asList(id));
    }

    public Collection<Integer> get() {
        return Collections.unmodifiableSet(item);
    }
}
