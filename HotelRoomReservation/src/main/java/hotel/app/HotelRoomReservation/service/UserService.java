package hotel.app.HotelRoomReservation.service;

import hotel.app.HotelRoomReservation.entity.User;
import hotel.app.HotelRoomReservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Boolean existsById(String userName){
        return userRepository.existsById(userName);
    }

    public User findCustomerByUserName(String userName){
        return userRepository.getById(userName);
    }
}