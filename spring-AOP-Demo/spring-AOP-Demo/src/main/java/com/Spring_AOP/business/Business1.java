package com.Spring_AOP.business;

import com.Spring_AOP.Data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Dao1 dao1;

    public String somethingCalculate()
    {
        return dao1.retieriveSomething();
    }
}
