package oops_14th_jan.innerclass;

public class Lab152 {
    public static void main(String[] args) {

        Car car = new Car(3000);
        car.drive();
        Car.Engine engine = car.new Engine(2500);
        engine.Start();

    }
}

class Car{
        int make;

        public Car(int make){
            this.make = make;
        }
        void drive(){
            System.out.println("You are driving");
        }

        public class Engine{
            int horsePower;

            Engine(int horsePower){
                this.horsePower = horsePower;
            }

            void Start(){
                System.out.println("Engine is started " + make);
            }
        }

    }

