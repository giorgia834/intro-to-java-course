package com.cbfacademy.cars;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Showroom {
    // public List<Car> carsInfo; /* instantiating the carsInfo variable, stating the data 
    // type will be in the form of Car (Defined in the Car class) */
    public List<Car> getCars() { /* here we are stating that the type of data returned by getCars 
        will be in the form defined by the class Car */
        List<Car> showroom = new ArrayList();
            
        
        Car car1 = new Car("Volvo", "V40", "blue",2012);
        Car car2 = new Car("Porsche", "Panamera", "red", 2009);
        Car car3 = new Car("Audi", "A3", "grey",2018);
        showroom.add(car1);
        showroom.add(car2);
        showroom.add(car3);
        
        return showroom;

    }

}

// public class Showroom {
//     public List<Car> getCars() {
//         List<Integer> showroom = new List<>();
        
//         carsInfo.add("Volvo", "V40", 2012, "blue");
//         carsInfo.add("Porsche", "Panamera", 2009, "red");
//         carsInfo.add("Audi", "A3", 2018, "grey");

//         return carsInfo;
   
//     }

// }

