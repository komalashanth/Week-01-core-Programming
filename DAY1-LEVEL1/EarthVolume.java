public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm * 0.621371;
        
        double volumeKm = 4.0 / 3 * 3.14 * radiusKm * radiusKm * radiusKm;
        double volumeMiles = 4.0 / 3 * 3.14 * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + 
                           " and cubic miles is " + volumeMiles);
    }
}

