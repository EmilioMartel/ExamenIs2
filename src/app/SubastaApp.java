package app;

import controller.ControllerBid;
import model.Item;
import model.Subasta;
import model.User;
import view.SubastaLoader;
import view.SubastaRepository;

import java.util.List;
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
        subastaApp.execute();






    }

    private void execute(){
        Scanner sc = new Scanner(System.in);
        List<Subasta> subastaList = new SubastaLoader().load();
        System.out.println("¿Qué subasta le interesaría ver?");
        int e = sc.nextInt();
        try {
            Subasta subastaElegida = subastaList.get(e-1);
            showDetail(subastaElegida);
        } catch (Exception ex) {
            System.out.println("Error en la subasta");
            System.out.println(ex.getMessage());
            System.exit(-1);
        }
    }

    private void showDetail(Subasta subasta){
        while (true) {
            System.out.println("Opciones: ");
            System.out.println("1- Pujar" +
                    "\n2- Detalles" +
                    "\n3- Ver historial" +
                    "\n4- Salir");
            Scanner scanner = new Scanner(System.in);
            int e = scanner.nextInt();
        }
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
