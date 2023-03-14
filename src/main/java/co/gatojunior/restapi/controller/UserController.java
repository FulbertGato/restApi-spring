package co.gatojunior.restapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users") // localhost:8080/users
public class UserController {

        @GetMapping
        public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                               @RequestParam(value = "limit", defaultValue = "50") int limit,
                               @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort) {
            return "get users called with page = " + page + " limit = " + limit + " sort = " + sort;
        }

        @GetMapping(path = "/{id}")
        public String getUserById(@PathVariable String id) {
            return "get user by id called " + id;
        }

        @PostMapping
        public String createUser() {
            return "create user called";
        }

        @PutMapping
        public String updateUser(){
            return "update user called";
        }

        @DeleteMapping
        public String deleteUser(){
            return "delete user called";
        }






}
