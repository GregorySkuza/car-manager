package pl.gskuza.carmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String brand;
    private String model;
    private String type;
    private String vinNumber;
    private String carPlate;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String carCode;

    public Car() {
    }


    public Car(Long id, String brand, String model, String type, String vinNumber, String carPlate, String imageUrl, String carCode) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.vinNumber = vinNumber;
        this.carPlate = carPlate;
        this.imageUrl = imageUrl;
        this.carCode = carCode;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", carPlate='" + carPlate + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

}
