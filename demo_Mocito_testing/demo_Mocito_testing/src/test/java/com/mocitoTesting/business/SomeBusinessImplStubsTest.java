package com.mocitoTesting.business;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplStubsTest
{

    @Test
    void findTheGreatestFromAllData_basic() {

        DataServiceStub dataServiceStub = new DataServiceStub();
        SomebusinessImpl businessImpl = new SomebusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }
}

class DataServiceStub implements DataService
{
    @Override
    public int[] retrieveAllData() {

        return new int[]{25,4,9};
    }
}
