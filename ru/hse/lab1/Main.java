package ru.hse.lab1;
import ru.hse.lab1.second.Person;


public class Main {
    void main(){
        Person Ivan = new Person("Ivan", 55.6f, 170);
        System.out.println("\n" + Ivan.height);
    }
}
