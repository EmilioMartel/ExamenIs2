package view;

import controller.ControllerBid;
import controller.ShowSubastas;
import model.Item;
import model.Subasta;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class SubastaRepository implements ShowSubastas {

    private List<Item> itemList;
    private List<Subasta> subastaItemList;
    private Subasta subasta;

    public SubastaRepository(){
        this.itemList = new ArrayList<>();
        this.subastaItemList = new ArrayList<>();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public List<Subasta> getSubastaItemList(){
        return subastaItemList;
    }

    @Override
    public void display() {
        itemList.add(new Item(1561, "coche", "fabuloso coche rojo", 1853.69,"Coche rojo"));
        itemList.add(new Item(1895, "moto", "moto de marc marquez", 100000,"Moto famosa"));
        itemList.add(new Item(9874, "gato persa", "gato de raza pura", 250,"Animal"));

        int n = 0;
        for(Item i : itemList){
            subastaItemList.add(new Subasta(n+1, itemList.get(n).getIdItem(), itemList.get(n).getPrice(),
                    itemList.get(n).getPrice(), itemList.get(n).getPrice(), null, LocalDate.of(2020, Month.APRIL,1)));
            n++;
        }

    }

}
