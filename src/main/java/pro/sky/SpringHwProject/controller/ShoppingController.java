package pro.sky.SpringHwProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.SpringHwProject.model.ShoppingBasket;
import pro.sky.SpringHwProject.service.ShoppingService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingController {

    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }


    @GetMapping(path = "/add")
    public void printProduct(@RequestParam("id") List<Integer> id) {
        shoppingService.changeProduct(id);
    }

    @GetMapping(path = "/get")
    public List<ShoppingBasket> print() {
        return shoppingService.printID();
    }
}
