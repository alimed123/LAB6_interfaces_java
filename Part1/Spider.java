package Part1;
/*class spider 
 * it extends Animal (superclass)
 * implements interface Hunter 
 * it should use eat from animal (abstract method)
 * it should use Hunts from the interface Hunts
*/
public class Spider extends Animal implements Hunter{

    

    public Spider()
    {
        super(8);
    }


    @Override
    public void eat(){
        System.out.println("spiders eat something");
    }
    @Override
    public void Hunts() {
        System.out.println("spider hunts insects ");
    }
    
}
