public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var boxersWeight = firstBoxer + secondBoxer;
        System.out.println(boxersWeight);
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);

        System.out.println("Задача7");
        var weightDifference2 = secondBoxer - firstBoxer;
        System.out.println(weightDifference2);
        var totalWeight = (secondBoxer + firstBoxer) % firstBoxer;
        System.out.println(totalWeight);

        System.out.println("Задача8");
        var hoursWorked = 640;
        var theNumberOfHoursPerDay = 8;
        var amountOfWorkers = hoursWorked / theNumberOfHoursPerDay;
        var newEmployees = 94;
        var staff = amountOfWorkers + newEmployees;
        var workingHours = staff * theNumberOfHoursPerDay;
        System.out.println("Всего работников в компании - " + amountOfWorkers + " человек");
        System.out.println("Если в компании работает " + staff + " человек, то всего " + workingHours + " часов работы может быть поделено между сотрудниками");



    }
}