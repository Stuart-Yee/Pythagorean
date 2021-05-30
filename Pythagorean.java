import java.lang.Math;
public class Pythagorean {
    public static double calculateHypotenuse(int legA, int legB) {
        double hypotenuse;
        hypotenuse = Math.sqrt((legA*legA)+(legB*legB));
        return hypotenuse;
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
    }
}

