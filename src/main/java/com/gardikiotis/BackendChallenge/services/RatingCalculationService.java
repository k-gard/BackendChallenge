package com.gardikiotis.BackendChallenge.services;

import com.gardikiotis.BackendChallenge.models.RatedEntity;
import com.gardikiotis.BackendChallenge.models.Rating;

import java.util.HashMap;

public class RatingCalculationService {

    private static HashMap<Double,Double> ratingMap = new HashMap<>();
    private static HashMap<Integer,Double> dateMap = new HashMap<>();

    private static RatingCalculationService instance;

    public static RatingCalculationService getInstance() {
        if (instance == null) {
            setRatingMap();
            return new RatingCalculationService();
        }
        return instance;
    }

    private static void setRatingMap() {
        ratingMap.put(5.0 , 1.0);
        ratingMap.put(4.5 , 0.9);
        ratingMap.put(4.0 , 0.8);
        ratingMap.put(3.5 , 0.7);
        ratingMap.put(3.0 , 0.6);
        ratingMap.put(2.5 , 0.5);
        ratingMap.put(2.0 , 0.4);
        ratingMap.put(1.5 , 0.3);
        ratingMap.put(1.0 , 0.2);
        ratingMap.put(0.5 , 0.1);
        ratingMap.put(0.0 , 0.0);

    }


    private static void setDateMap() {
//        dateMap.put(5.0 , 1.0);
//        dateMap.put(4.5 , 0.9);
//        dateMap.put(4.0 , 0.8);
//        dateMap.put(3.5 , 0.7);
//        dateMap.put(3.0 , 0.6);
//        dateMap.put(2.5 , 0.5);
//        dateMap.put(2.0 , 0.4);
//        dateMap.put(1.5 , 0.3);
//        dateMap.put(1.0 , 0.2);
//        dateMap.put(0.5 , 0.1);
//        dateMap.put(0.0 , 0.0);
    }


    public static double calculateRating(RatedEntity entity){
        double w = 100;
        double rateSum = 0;


        for (Rating r : entity.getRatings()){



        }

        return 0;
    }



}
