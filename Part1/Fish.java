package Part1;

public class Fish extends Animal implements pet,Hunter{
    private String fishname;

    // Default constructor with setting lefs due to abstract upper class
    protected Fish() {
        super(0);
    }

    // getters and setters
    @Override
    public String getName() {
        return fishname;
    }

    @Override
    public void setName(String name) {
        fishname = name;
    }
    
    // walk,play and hunts must be available due to interface implementation
    @Override
    public void walk(){
        System.out.println("fish can't walk");
    }
    @Override
    public void play() {
    }

    @Override
    public void eat() {
        System.out.println("fish eats bread");
    }


    @Override
    public void Hunts() {
        System.out.println("Fish hunts another smaller fish");;
    }
    
}
