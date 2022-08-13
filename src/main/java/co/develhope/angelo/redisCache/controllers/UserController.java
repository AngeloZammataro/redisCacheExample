package co.develhope.angelo.redisCache.controllers;

import co.develhope.angelo.redisCache.entities.jpa.UserJPA;
import co.develhope.angelo.redisCache.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public void create(@RequestBody UserJPA user){

    }

    @GetMapping("/")
    public void readAll(){
        userService.readAll();
    }

    @GetMapping("/{id}")
    public void readOne(@PathVariable String id){
        userService.readOne(id);
    }

    @GetMapping("/{id}/fast")
    public void readOneFast(@PathVariable String id){
        userService.readOneFast(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id, @RequestBody UserJPA user){
        userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        userService.delete(id);
    }
}
