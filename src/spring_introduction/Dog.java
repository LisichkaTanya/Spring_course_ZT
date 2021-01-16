package spring_introduction;

import org.springframework.stereotype.Component;

//@Component
public class Dog implements Pet{
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    //эти методы мы сами никак не вызываем, их вызывает сам Spring
    //модификатор доступа (access modifier) может быть любым
    //чаще всего делают void, так как значение return мы нигде не используем
    //название может быть любым, но чаще так и называют init и destroy
    //не должны содержать параметров
    //@PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }
    //Если bean со scope - prototype то destroy метод не выполнится, его необходимо вызывать самостоятельно!!!
    //@PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
