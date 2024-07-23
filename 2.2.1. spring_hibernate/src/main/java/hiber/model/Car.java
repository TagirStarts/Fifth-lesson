package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    private String model;
    private int series;

    public Car() {}

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
