package view;

import model.Item;
import model.Subasta;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class SubastaLoader implements controller.SubastaLoader{
    private List<Item> itemList;
    private List<Subasta> subastaList;

    public SubastaLoader() {
        this.itemList = new ArrayList<>();
        this.subastaList = new ArrayList<>();;
    }

    @Override
    public List<Subasta> load() {
        itemList.add(new Item(1561, "coche", "fabuloso coche rojo", 1853.69,"Coche rojo"));
        itemList.add(new Item(1895, "moto", "moto de marc marquez", 100000,"Moto famosa"));
        itemList.add(new Item(9874, "gato persa", "gato de raza pura", 250,"Animal"));

        int n = 0;
        for(Item i : itemList){
            subastaList.add(new Subasta(n+1, itemList.get(n).getIdItem(), itemList.get(n).getPrice(),
                    itemList.get(n).getPrice(), itemList.get(n).getPrice(), null, LocalDate.of(2020, Month.APRIL,1)));
            n++;
        }

        return subastaList;
    }
}
