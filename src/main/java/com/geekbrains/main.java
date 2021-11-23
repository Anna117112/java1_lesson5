package com.geekbrains;

public class main {

    public static void main(String[] args) {


        Person[] peersArray = new Person[5];

        peersArray[0] = new Person("Иванов Иван", "Программист", "ivanov@mail.ru", "89614712589", 30000, 25);
        peersArray[1] = new Person("Петров Вася", "Столяр", "лдлдл@mail.ru","89652147895", 20000, 50);
        peersArray[2] = new Person("Сидоров Илья", "Менеджер","лао@mail.ru","82596147832",40000,45);
        peersArray[3] = new Person("Петросян Петр","Юморист","тао@mail.ru","86254128956",50000, 36);
        peersArray[4] = new Person("ушаков Кирилл","Актер","ьлв@mail.ru","82594178936",45000,29);
        for (Person person:peersArray) {
            
            person.getAgs();


        }

    }
}
