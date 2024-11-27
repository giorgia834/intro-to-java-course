package com.cbfacademy.cars;


import java.util.LinkedList;
import java.util.List;

public class Showroom {
    private List<Car> carsInfo; /* instantiating the carsInfo variable, stating the data 
    type will be in the form of Car (Defined in the Car class) */
    public List<Car> getCars() { /* here we are stating that the type of data returned by getCars 
        will be in the form defined by the class Car */
        
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

