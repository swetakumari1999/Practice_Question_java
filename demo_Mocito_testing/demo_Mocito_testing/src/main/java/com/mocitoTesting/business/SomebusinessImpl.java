package com.mocitoTesting.business;

public class SomebusinessImpl
{
    private DataService dataService;

    public SomebusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData()
    {
        int[] data = dataService.retrieveAllData();
        int greastValue = Integer.MIN_VALUE;
        for (int value:data) {
            if (value > greastValue)
                greastValue = value;
        }
            return greastValue;

    }
}

interface  DataService
{
    int[] retrieveAllData();
}