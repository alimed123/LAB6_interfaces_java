package Part1;
/* this is a test animal to check all the casting and methods implemantations */
public class TestAnimal {
    public static void main(String[] args) {
        Fish d = new Fish();
        cat c = new cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        pet p = new cat();

        // Calling methods on Fish
        d.setName("Fishy"); //setting the fish name to fishy as example

        String l=d.getName();
        int legs_d = c.legs;

        System.out.println(legs_d);
        System.out.println(l);

        d.eat();
        d.walk();
        d.Hunts();

        System.out.println("==========================================");
        // Calling methods on cat
        c.setName("Catty"); // setting the cate name to catty
        String name = c.getName();    
        System.out.println(name);
        int legs_c = c.legs;
        System.out.println(legs_c);
        c.eat();
        c.walk();
        c.Hunts();

        System.out.println("==========================================");

        // Calling methods on animal a as fish will work because animal is a superclass of fish
        
        a.eat(); // one method only eat
        e.eat();
        int legs_e = e.legs;
        System.out.println("Spider legs are: " + legs_e);


        System.out.println("==========================================");
        // Calling pet as cat will work because cat implements pet
        p.setName("Catty2");//setting it as catty2
        p.getName();
        p.play();

        
        // Upcasting
        Animal A_f = d; // Upcasting Fish to Animal
        Animal a_C = c; // Upcasting cat to Animal
        //Animal animalP = p; // can't upcasting pet to animal unless we use it as follow
        Animal a_P = (Animal) p;

        // Downcasting
        Fish f_A = (Fish) a; // Downcasting Animal to Fish
        Spider s_E = (Spider) e; // Downcasting Animal to Spider
        cat c_P = (cat) p; // Downcasting pet to cat

        //Fish xt = we can't convert Fish to animal (polyphormism)
        //this is similar to Spider to animal and can to animal

        //cat cay = p; similar to animal we can't convert cat to pet 

    }
}
