package com.mocitoTesting.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBuninessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomebusinessImpl businessImple;
    @Test
    void findGreatestFromAllData_basic() {
       // DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int []{25,4,9});
       // SomebusinessImpl businessImple = new SomebusinessImpl(dataServiceMock);
       // int result = businessImple.findTheGreatestFromAllData();
        assertEquals(25, businessImple.findTheGreatestFromAllData());
    }
@Test
    void findGreatestWithOneData_basic() {
       // DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int []{35});
        //SomebusinessImpl businessImple = new SomebusinessImpl(dataServiceMock);
        // int result = businessImple.findTheGreatestFromAllData();
        assertEquals(35, businessImple.findTheGreatestFromAllData());
    }
}

