package com.cbfacademy.cars;


import java.util.LinkedList;
import java.util.List;

public class Showroom {
    List<Car> carsInfo;
    public List<Car> getCars() {
        
        Car car1 = new Car("Volvo", "V40", "blue",2012);
        Car car2 = new Car("Porsche", "Panamera", "red", 2009);
        Car car3 = new Car("Audi", "A3", "grey",2018);
        carsInfo.add(car1);
        carsInfo.add(car2);
        carsInfo.add(car3);
        
        return carsInfo;

    }

}

// public class Showroom {
//     public List<Car> getCars() {
//         List<Integer> carsInfo = new List<>();
        
//         carsInfo.add("Volvo", "V40", 2012, "blue");
//         carsInfo.add("Porsche", "Panamera", 2009, "red");
//         carsInfo.add("Audi", "A3", 2018, "grey");

//         return carsInfo;
   
//     }

// }

