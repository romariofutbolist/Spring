package pro.sky.SpringHwProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.SpringHwProject.model.ShoppingBasket;
import pro.sky.SpringHwProject.service.ShoppingService;

import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class ShoppingController {

    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping(path = "/add")
    public void printProduct(@RequestParam("id") Set<Integer> id) {
        shoppingService.changeProduct(id);
    }

    @GetMapping(path = "/get")
    public Set<Integer> print() {
        return shoppingService.printID();
    }
}
