
package Part1;
//Abstrac class animal
public abstract class Animal {
    //defining legs as the variable of the class which have to be used in other classes
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    //abstract method eat,just to make it obliged to be used in the other classes that extends animal
    public abstract void eat();
    public void walk(){
        System.out.println("the animal walks with " + legs);
    }
    
}
