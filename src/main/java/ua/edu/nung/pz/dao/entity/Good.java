package ua.edu.nung.pz.dao.entity;

import java.util.Arrays;
import java.util.Objects;

public class Good {
    private long id;
    private String name;
    private String description;
    private String brand;
    private String[] photo;
    private int likes;

    public Good() {
    }

    public Good(long id, String name, String description, String brand, String[] photo, int likes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.photo = photo;
        this.likes = likes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", likes=" + likes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return likes == good.likes && Objects.equals(name, good.name) && Objects.equals(description, good.description) && Objects.equals(brand, good.brand);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, description, brand, likes);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }
}
