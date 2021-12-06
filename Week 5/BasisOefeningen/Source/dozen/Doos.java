package dozen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/10/2014
 */
public class Doos {
    private String soort;
    private double lengte;
    private double breedte;
    private double hoogte;

    public Doos(String soort, double lengte, double breedte, double hoogte) {
        this.soort = soort;
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public Doos(String soort, double lengte) {
        this(soort, lengte, lengte, lengte);
    }

    public double oppervlakte() {
        return 2 * (breedte * lengte + breedte * hoogte + lengte * hoogte);
    }

    public double volume() {
        return lengte * breedte * hoogte;
    }

    public double tapeLengte() {
        double grondvlak = 2 * (lengte + breedte);
        double voorvlak = 2 * (lengte + hoogte);
        double zijvlak = 2 * (breedte + hoogte);
        return Math.min(zijvlak, (Math.min(grondvlak, voorvlak)));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Soort: ").append(soort).append('\n');
        result.append(String.format("Lengte: %.1fcm", lengte)).append('\n');
        result.append(String.format("Breedte: %.1fcm", breedte)).append('\n');
        result.append(String.format("Hoogte: %.1fcm", hoogte)).append('\n');
        result.append(String.format("Oppervlakte: %.1fcm²", oppervlakte())).append('\n');
        result.append(String.format("Volume: %.1fcm³", volume())).append('\n');
        result.append(String.format("Minimale tapelengte: %.1fcm", tapeLengte())).append('\n');
        return result.toString();
    }
}

