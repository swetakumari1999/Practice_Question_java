package com.Spring_AOP.business;

import com.Spring_AOP.Data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2
{
    @Autowired
    private Dao2 dao2;

    public String somethingCalculate()
    {
       return dao2.retrieveSomething();
    }

}
