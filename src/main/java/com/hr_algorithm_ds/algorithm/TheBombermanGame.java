package com.hr_algorithm_ds.algorithm;

import java.util.ArrayList;
import java.util.List;

public class TheBombermanGame {

    public List<String> bomberMan(int n, List<String> grid) {

        if(n==1){
            return grid;
        }
        if(n%2 == 0){
            return fullGrid(grid);
        }
        if(n%4 == 1){
            List<String> tmp= explodedGrid(grid);
            return explodedGrid(tmp);
        }else{
            return explodedGrid(grid);
        }

    }
    public List<String> fullGrid(List<String> grid){
        List<String> result = new ArrayList<>();
        int gridLength = grid.size();
        int rowLength = grid.get(0).length();
        StringBuilder stringBuilder = new StringBuilder("");
        for(int i= 0;i<rowLength;i++){
            stringBuilder.append("O");
        }
        for(int i= 0;i<gridLength;i++){
            result.add(stringBuilder.toString());
        }
        return result;
    }

    public List<String> explodedGrid(List<String> grid){
        int gridLength = grid.size();
        int rowLength = grid.get(0).length();
        List<List<Integer>> mineCoordinates = new ArrayList<>();
        for(int i =0; i<gridLength;i++){
            for(int j =0; j<rowLength;j++){
                if(grid.get(i).charAt(j) == 'O'){
                    List<Integer> coordinate = new ArrayList<>();
                    coordinate.add(i);
                    coordinate.add(j);
                    mineCoordinates.add(coordinate);
                }
            }
        }
        List<String> resultGrid = fullGrid(grid);

        for(List<Integer> coordinates : mineCoordinates){
            StringBuilder stringBuilderExact = new StringBuilder(resultGrid.get(coordinates.get(0)));
            stringBuilderExact.setCharAt(coordinates.get(1), '.');
            resultGrid.set(coordinates.get(0),stringBuilderExact.toString());

            if(coordinates.get(0)>0){
                StringBuilder stringBuilderUpper = new StringBuilder(resultGrid.get(coordinates.get(0)-1));
                stringBuilderUpper.setCharAt(coordinates.get(1), '.');
                resultGrid.set(coordinates.get(0)-1,stringBuilderUpper.toString());
            }
            if(coordinates.get(0)<gridLength-1){
                StringBuilder stringBuilderDown = new StringBuilder(resultGrid.get(coordinates.get(0)+1));
                stringBuilderDown.setCharAt(coordinates.get(1), '.');
                resultGrid.set(coordinates.get(0)+1,stringBuilderDown.toString());
            }
            if(coordinates.get(1)>0){
                StringBuilder stringBuilderLeft = new StringBuilder(resultGrid.get(coordinates.get(0)));
                stringBuilderLeft.setCharAt(coordinates.get(1)-1, '.');
                resultGrid.set(coordinates.get(0),stringBuilderLeft.toString());
            }
            if(coordinates.get(1)<rowLength-1){
                StringBuilder stringBuilderRight = new StringBuilder(resultGrid.get(coordinates.get(0)));
                stringBuilderRight.setCharAt(coordinates.get(1)+1, '.');
                resultGrid.set(coordinates.get(0),stringBuilderRight.toString());
            }
        }
        return resultGrid;
    }
}
