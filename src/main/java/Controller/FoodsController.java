package Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import dao.FoodsDAO;
import dto.Foods;

@RestController
@RequestMapping("/food")
public class FoodsController {

    private final FoodsDAO foodsDAO;

    @Autowired
    public FoodsController(FoodsDAO foodsDAO) {
        this.foodsDAO = foodsDAO;
    }

    @PostMapping
    public void createFood(@RequestBody Foods foods) {
        foodsDAO.save(foods);
    }

    @GetMapping("/{idfood}")
    public Foods getFoodById(@PathVariable("idfood") int idfood) {
        return foodsDAO.getById(idfood);
    }

    @PutMapping("/{idfood}")
    public void updateFood(@PathVariable("idfood") int idfood, @RequestBody Foods foods) {
        foodsDAO.update(foods);
    }

    @DeleteMapping("/{idfood}")
    public void deleteFood(@PathVariable("idfood") int idfood) {
        foodsDAO.delete(idfood);
    }
}
