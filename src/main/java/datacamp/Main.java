package datacamp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

            // Create an ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // Create a Car object
            Car car = new Car("Tesla Model 3", 2022);

            // Serialize Car object to JSON and write to a file
            File file = new File("car_data123123.json");
            mapper.writeValue(file, car);
            System.out.println("JSON written to file: " + file.getAbsolutePath());


            System.out.println("asd: "+mapper.getClass());
            // Serialize Car object to JSON string
            String jsonString = mapper.writeValueAsString(car);
            System.out.println("Serialized JSON string: " + jsonString);

            // Deserialize JSON file back to a Car object
            Car deserializedCar = mapper.readValue(file, Car.class);
            System.out.println("Deserialized Car object: " + deserializedCar);

    }
}

// Car class
class Car {
    public String make;
    public int year;
    public Car(){}
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

//    @Override
//    public String toString() {
//        return "Car {" + "make='" + make + '\'' + ", year=" + year + '}';
//    }
}
