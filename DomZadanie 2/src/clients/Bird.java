package clients;

import java.time.LocalDate;
public class Bird extends Animal implements Flyable {

    public Bird(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        System.out.println(Animal.nickName + ": Я хорошо летаю");
    }
}

