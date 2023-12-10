package Part1;
//class cat
public class cat  extends Animal implements pet,Hunter{
    String name; // Cat name

    //constructors with setting legs,if we don't put legs we will get error due to abstract superclass
    public cat(){
        super(4);
    }
    public cat(String name_cat){
        super(4);
        this.name = name_cat;// Setting cat name
    }

    // Getters and setters
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    //play,eat and Hunts methods must be available due to interface implementation (pet)
    @Override
    public void play() {
        System.out.println("cat plays with laser");
    }

    
    @Override
    public void eat() {
        System.out.println("cat eat meat");
    }
    @Override
    public void Hunts() {
        System.out.println("cat hunts mice");
    }
}
