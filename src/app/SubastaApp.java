package app;

import controller.ControllerBid;
import model.Item;
import model.Subasta;
import model.User;
import view.SubastaRepository;

import java.util.Scanner;

public class SubastaApp {
    private SubastaRepository controller;
    private User user;
    private final SubastaRepository repository;
    public SubastaApp(){
        repository = new SubastaRepository();
    }

    public static void main(String[] args) {
        System.out.print("\n|| ---------------- Bienvenidos a nuestras Subastas Online ---------------- ||");
        System.out.print("\n\n* Estas son nuestras articulos disponibles : \n");
        SubastaApp subastaApp = new SubastaApp();
        subastaApp.getSubastas().display();
        subastaApp.show();



    }


    private void show() {
        int n = 1;
        for(Subasta i: repository.getSubastaItemList()){
            System.out.print("Subasta " + n + ": " + i.toString());
            n++;
        }
    }



    public SubastaRepository getSubastas(){return repository;}

}
