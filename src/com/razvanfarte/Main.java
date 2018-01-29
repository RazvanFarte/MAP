package com.razvanfarte;

import com.razvanfarte.Models.Cars;
import com.razvanfarte.Repo.IRepository;
import com.razvanfarte.Repo.MemoryRepository;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IRepository<Cars> mRepo = new MemoryRepository<Cars>(10);

        mRepo.add(new Cars("Honda", new Color(Color.BLUE.getRGB())));
        mRepo.add(new Cars("Mercedes", new Color(Color.RED.getRGB())));
        mRepo.add(new Cars());
        mRepo.add(new Cars("Honda", new Color(Color.RED.getRGB())));


         System.out.print(mRepo.getEntities().isEmpty());

         Controller carsController = new Controller(mRepo);
         System.out.print(carsController.filterCarsByColor(new Color(255,0,0)).toString());
    }
}
