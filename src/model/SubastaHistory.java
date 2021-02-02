package model;

import java.util.HashMap;
import java.util.Map;

public class SubastaHistory {
    private Map<Double, User> history;
    private User lastUser;
    private double lastPrice;

    public SubastaHistory(Map<Double, User> history) {
        this.history = history;
    }

    public SubastaHistory() {
        this.history = new HashMap<>();
    }

    public void add(double price, User user) {
        history.put(price, user);
        this.lastPrice = price;
        this.lastUser = user;
    }

    public User getLastUser() {
        return lastUser;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    @Override
    public String toString() {
        String res = "Historial =>\n ";
        for(Double key: history.keySet()) {
            res += "Precio: " + key + " Usuario: " + history.get(key).getIdUser() + " : " + history.get(key).getName() + "\n";
        }
        return res;
    }
}