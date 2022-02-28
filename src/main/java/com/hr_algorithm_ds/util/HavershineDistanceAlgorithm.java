package com.hr_algorithm_ds.util;

public class HavershineDistanceAlgorithm {

    public static double havershineDistanceAlgorithm(String latBase, String longBase, String latTarget, String longTarget){
        final int earthRadius = 6371;
        Double latitudeBase  = Double.parseDouble(latBase);
        Double longitudeBase  = Double.parseDouble(longBase);
        Double latitudeTarget = Double.parseDouble(latTarget);
        Double longitudeTarget = Double.parseDouble(longTarget);
        double latitudeTotalDistance = calculateRadiant(latitudeTarget-latitudeBase);
        double longitudeTotalDistance = calculateRadiant(longitudeTarget-longitudeBase);
        double a = Math.sin(latitudeTotalDistance / 2) * Math.sin(latitudeTotalDistance / 2) +
                Math.cos(calculateRadiant(latitudeBase)) * Math.cos(calculateRadiant(latitudeTarget)) *
                        Math.sin(longitudeTotalDistance / 2) * Math.sin(longitudeTotalDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        return earthRadius * c;
    }

    private static Double calculateRadiant(Double radiantParameter) {
        return radiantParameter * Math.PI / 180;
    }
}
