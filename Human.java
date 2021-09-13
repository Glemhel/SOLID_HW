package human_model;

import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way ;
// several interfaces - for segregation principle
public class Human implements Prayable, Sporty, Marriable, Worker {

    private String name;
    private String nickname;
    private double salary;
    private HobbyList hobbies;

    // Single responsibility - only hello'ing in Greetable
    // Open-closed - easy to add new language, closed for modifying current ones
    // Interface segregation - only hello'ing
    // human can speak some languages - say hello on given one
    String sayHello(Greetable language) {
        return language.sayHello();
    }

    @Override
    public void pray() {
    }

    @Override
    public void playSports() {

    }

    @Override
    public void getMarried() {

    }

    @Override
    public void ownCompany() {

    }

    @Override
    public void becomeEmployee() {

    }


    public static void main(String[] args) {
        Human human = new Human();
        human.sayHello(new Russian());
        human.salary = 100000;
        human.salary = new TaxApplier().calculateTax(human.salary, 0.87);
        human.hobbies = new HobbyList();
        // is it logical? should we wrap it into a function? which just calls hobbies.addhobby?
        human.hobbies.addHobby("1");

        human.name = "Nick";
        // calling new NickNameCreator() is weird...
        human.nickname = new NickNameCreator().createNickName(human.name, "a.k.a. HelloWorld");
        System.out.println(human.nickname);
    }

}