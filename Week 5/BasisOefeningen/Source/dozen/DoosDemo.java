package dozen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/10/2014
 */
public class DoosDemo {
    public static void main(String[] args) {
        Doos kubus = new Doos("Kubus", 10);
        System.out.println(kubus);

        Doos taart = new Doos("Platte doos", 30, 30, 3.5);
        System.out.println(taart);

        Doos post = new Doos("Postdoos", 30.5, 21.5, 17.0);
        System.out.println(post);
    }
}

/*
Soort: Kubus
Lengte: 10,0cm
Breedte: 10,0cm
Hoogte: 10,0cm
Oppervlakte: 600,0cm²
Volume: 1000,0cm³
Minimale tapelengte: 40,0cm

Soort: Platte doos
Lengte: 30,0cm
Breedte: 30,0cm
Hoogte: 3,5cm
Oppervlakte: 2220,0cm²
Volume: 3150,0cm³
Minimale tapelengte: 67,0cm

Soort: Postdoos
Lengte: 30,5cm
Breedte: 21,5cm
Hoogte: 17,0cm
Oppervlakte: 3079,5cm²
Volume: 11147,8cm³
Minimale tapelengte: 77,0cm
 */
