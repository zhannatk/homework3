public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }


    public static void task1() {
        System.out.println("dog");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
    }

    public static void task2() {
        System.out.println("cat");
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
    }


    public static void task3() {
        System.out.println("paper");
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }


    public static void task4() {
        System.out.println("friend");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    private static void task5() {
        System.out.println("frog");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

    }
    private static void task6() {
        System.out.println("вес бойцов");
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var totalWeight = fighterWeight1 + fighterWeight2;
        System.out.println("общий вес бойцов " + totalWeight + " кг ");
        var differenceWeight = fighterWeight1 - fighterWeight2;
        System.out.println("Разница на " + differenceWeight + " кг!");

    }
    private static void task7() {
        System.out.println("вес бойцов2");
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var totalWeight = fighterWeight1 + fighterWeight2;
        System.out.println("общий вес бойцов " + totalWeight + " кг ");
        var differenceWeight = fighterWeight2 - fighterWeight1;
        System.out.println("Разница на " + differenceWeight + " кг!");
        var differenceWeight2 = fighterWeight2 % fighterWeight1;
        System.out.println("Разница2 на " + differenceWeight2 + " кг!");
    }

    private static void task8() {
        var hours = 640;
        var eachPerson = 8;
        var employer = hours / eachPerson;
        System.out.println("Всего работников в компании " + employer + " человек." );

    }
    private static void task9() {
        var hours = 640;
        var hoursEachPerson = 8;
        var employer = hours / hoursEachPerson;
        var moreEmployers = 94;
        var totalEmployers = employer + moreEmployers;
        var hoursForEachPerson = hours / totalEmployers;
        System.out.println("Если в компании работает " + totalEmployers + " человек, то всего. " + hoursForEachPerson + " часов работы может быть поделено между сотрудниками" );


    }

}