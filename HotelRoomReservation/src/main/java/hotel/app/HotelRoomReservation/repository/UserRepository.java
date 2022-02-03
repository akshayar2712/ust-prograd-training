package hotel.app.HotelRoomReservation.repository;

import hotel.app.HotelRoomReservation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
