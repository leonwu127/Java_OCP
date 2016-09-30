/**
 * Created by leonwu127 on 30/09/2016.
 */
abstract class Animal{
    String name = "???";
    public void printName(){
        System.out.print(this.name);
    }
}

class Lion extends Animal{
    String name = "Lion";
    //public void printName(){
    //    System.out.print(this.name);
    //}
}

public class VirtualMethod {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.printName();
    }
}
