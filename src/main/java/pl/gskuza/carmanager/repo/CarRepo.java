package pl.gskuza.carmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gskuza.carmanager.model.Car;

import java.util.Optional;

public interface CarRepo extends JpaRepository<Car, Long > {
    void deleteCarById(Long id);

    Optional<Car> findCarById(Long id);
}
