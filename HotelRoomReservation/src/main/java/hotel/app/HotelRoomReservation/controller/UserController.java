package hotel.app.HotelRoomReservation.controller;

import hotel.app.HotelRoomReservation.entity.User;
import hotel.app.HotelRoomReservation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String home() {
        return "home";
    }


    @GetMapping("/register")
    public String registrationForm() {
        return "register";
    }

    @PostMapping("/login")
    public String registration(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String mobileNumber = request.getParameter("mobileNumber");
        User user = new User(userName, password, mobileNumber);
        userService.createUser(user);
        return "login";
    }


    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
}