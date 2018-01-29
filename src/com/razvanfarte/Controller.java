package com.razvanfarte;

import com.razvanfarte.Models.Cars;
import com.razvanfarte.Repo.IRepository;

import java.awt.*;
import java.util.ArrayList;

public class Controller {

    private IRepository<Cars> carsRepo;

    public Controller(IRepository<Cars> repo){
        this.carsRepo = repo;
    }

    public ArrayList<Cars> filterCarsByColor(Color color) {

        ArrayList<Cars> allCars = carsRepo.getEntities();
        ArrayList<Cars> filteredCars = new ArrayList<Cars>();

        for (Cars car: allCars
             ) {
            if(car.getColor().getRGB() == color.getRGB())
                filteredCars.add(car);
        }

        return filteredCars;
    }
}
