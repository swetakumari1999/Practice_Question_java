package com.Spring_AOP.Data;

import org.springframework.stereotype.Repository;


@Repository
public class Dao1 {
    @TrackTime
    public String retieriveSomething()
    {
        return "Dao1";
    }
}
