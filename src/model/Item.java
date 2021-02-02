package model;

public class Item {
    private double price;
    private String name;
    private String description;
    private String image;
    private int idItem;

    @Override
    public String toString() {
        return "Item {" +
                "\n idItem = " + idItem +
                "\n price = " + price +
                ",\n name = '" + name + '\'' +
                ",\n description = '" + description + '\'' +
                ",\n image = '" + image + '\'' +
                "\n}\n\n";
    }

    public Item(int idItem, String name, String description, double price, String image) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.image = image;
        this.idItem = idItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }
}
