package model;

import java.time.LocalDate;

public class Subasta {
    private int idSubasta;
    private int  idItem;
    private double actualPrice;
    private double initialPrice;
    private double finalPrice;
    private User actualUser;
    private LocalDate finalDate;

    public double getInitialPrice() {
        return initialPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public User getActualUser() {
        return actualUser;
    }

    public void setActualUser(User actualUser) {
        this.actualUser = actualUser;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }


    public Subasta(int idSubasta, int idItem, double initialPrice, double actualPrice, double finalPrice, User actualUser, LocalDate finalDate) {
        this.idSubasta = idSubasta;
        this.idItem = idItem;
        this.actualPrice = actualPrice;
        this.initialPrice = initialPrice;
        this.finalPrice = finalPrice;
        this.actualUser = actualUser;
        this.finalDate = finalDate;
    }

    public int getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(int idSubasta) {
        this.idSubasta = idSubasta;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public int getIdItem() {
        return idItem;
    }


    @Override
    public String toString() {
        return  "\n idSubasta = " + getIdSubasta() + "{" +
                "\n idItem = " + getIdItem() +
                ",\n initialPrice = " + getInitialPrice() +
                ",\n actualPrice = " + getActualPrice() +
                ",\n finalPrice = " + getFinalPrice() +
                ",\n actualUser = " + getActualUser() +
                ",\n finalDate = " + getFinalDate() +
                "\n}\n\n";
    }
}
