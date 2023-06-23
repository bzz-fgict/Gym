package Controller;

import dto.Foods;
import dao.FoodsDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodsController {

    private final FoodsDAO foodsDAO;

    public FoodsController(FoodsDAO foodsDAO) {
        this.foodsDAO = foodsDAO;
    }

    @PostMapping
    public ResponseEntity<Void> saveFood(@RequestBody Foods foods) {
        foodsDAO.save(foods);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Foods> getFood(@PathVariable int id) {
        Foods food = foodsDAO.getById(id);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Void> updateFood(@RequestBody Foods foods) {
        foodsDAO.update(foods);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable int id) {
        foodsDAO.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
