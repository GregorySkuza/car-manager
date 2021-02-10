package pl.gskuza.carmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gskuza.carmanager.exception.CarNotFoundException;
import pl.gskuza.carmanager.model.Car;
import pl.gskuza.carmanager.repo.CarRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;


@Service
@Transactional
public class CarService {
    private final CarRepo carRepo;


    @Autowired
    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public Car addCar(Car car) {
        car.setCarCode(UUID.randomUUID().toString());
        return carRepo.save(car);
    }

    public List<Car> findAllEmployees() {
        return carRepo.findAll();
    }

    public Car updateEmployee(Car car) {
        return carRepo.save(car);
    }

    public void deleteEmployee(Long id){
        carRepo.deleteCarById(id);
    }
    public Car findCarById(Long id) {
        return carRepo.findCarById(id)
                .orElseThrow(() -> new CarNotFoundException("Car by id " + id + " was not found"));
    }

}
