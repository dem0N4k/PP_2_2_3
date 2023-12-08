package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;
//import web.service.UserService;

import java.util.List;

@Controller
//@RequestMapping("/users")
public class UsersController {

    //private final UserRepository userRepository;
//private final UserService userService;
    @Autowired
    private UserDAO userDAO;

//    @Autowired
//    public UsersController(UserDAOImpl userService)  {
//        this.userService = userService;
//    }

    @GetMapping("/")
    public String showAllUsers(Model model) {
        List<User> allUsers = userDAO.getAllUsers();
        model.addAttribute("allUsers", allUsers);
//        return "users/index";
        return "all-users";
    }
}
//
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int id, Model model) {
//        model.addAttribute("user", userService.findOne(id));
//        return "users/show";
//    }
//
//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") Model model) {
//        return "users/new";
//    }
//
//    @PostMapping()
//    public String create(@ModelAttribute("user") User user) {
//        userService.save(user);
//        return "redirect:/users";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id) {
//        model.addAttribute("user", userService.show(id));
//        return "users/edit";
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
//        userService.update(id, user);
//        return "redirect:/users/";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") int id) {
//        userService.delete(id);
//        return "redirect:/users/";
//    }
//}
