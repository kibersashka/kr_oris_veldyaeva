package ru.itis.kr_oris2.entities;

public class Train {
    private Long id;
    private Long id_driver;
    private String name;
    private Long number_train;
    private Long number_road;

    public Train() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_driver() {
        return id_driver;
    }

    public void setId_driver(Long id_driver) {
        this.id_driver = id_driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber_train() {
        return number_train;
    }

    public void setNumber_train(Long number_train) {
        this.number_train = number_train;
    }

    public Long getNumber_road() {
        return number_road;
    }

    public void setNumber_road(Long number_road) {
        this.number_road = number_road;
    }
}
