package co.develhope.angelo.redisCache.controllers;

import co.develhope.angelo.redisCache.entities.jpa.UserJPA;
import co.develhope.angelo.redisCache.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserJPA create(@RequestBody UserJPA user){
        return userService.create(user);
    }

    @GetMapping("/read-all")
    public List<UserJPA> readAll(){
        return userService.readAll();
    }

    @GetMapping("read/{id}")
    public UserJPA readOne(@PathVariable Long id){
        return userService.readOne(id);
    }

    @GetMapping("/read/{id}/fast")
    public void readOneFast(@PathVariable Long id){
        userService.readOneFast(id);
    }

    @PutMapping("/update/{id}")
    public UserJPA update(@PathVariable Long id, @RequestBody UserJPA user){
        return userService.update(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}
