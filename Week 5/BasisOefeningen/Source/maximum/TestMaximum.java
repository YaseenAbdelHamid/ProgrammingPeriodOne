package maximum;

/**
 * @author Kristiaan Behiels
 * @version 1.0 10/10/13
 */

/*
Gebruik deze klasse om de klasse Maximum te testen.
Vergelijk met de verwachte uitvoer en verklaar waarom je deze uitvoer bekomt.
 */
public class TestMaximum {
    public static void main(String[] args) {

        Maximum maximum = new Maximum(1, 3, 2);
        System.out.println("maximum = " + maximum.max());

        maximum = new Maximum(1L, 2, 3);
        System.out.println("maximum = " + maximum.max());

        maximum = new Maximum(3L, 2.0, 1);
        System.out.println("maximum = " + maximum.max());

        maximum = new Maximum();
        System.out.println("maximum = " + maximum.max(1, 3, 2));

        maximum = new Maximum();
        System.out.println("maximum = " + maximum.max(1, 3, 2L));

        maximum = new Maximum();
        System.out.println("maximum = " + maximum.max(1.0, 3, 2));
    }
}

/*
Oproep int constructor
max = 3.0
Oproep long constructor
max = 3.0
Oproep double constructor
max = 3.0
Oproep default constructor
Oproep int parameters methode
max = 3.0
Oproep default constructor
Oproep long parameters methode
max = 3.0
Oproep default constructor
Oproep double parameters methode
max = 3.0
*/
