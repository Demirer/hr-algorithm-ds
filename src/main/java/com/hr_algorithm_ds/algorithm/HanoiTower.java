package com.hr_algorithm_ds.algorithm;

public class HanoiTower {

    public void towerOfHanoi(int towerSize, String baseRod, String targetRod, String middleRod) {
        if (towerSize == 0) { return;}
        towerOfHanoi(towerSize - 1, baseRod, middleRod, targetRod);
        System.out.println("Move disk " + towerSize + " from rod : " + baseRod + " to rod : " + targetRod);
        towerOfHanoi(towerSize - 1, middleRod, targetRod, baseRod);
    }
}

