package com.example.demo.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.validation.constraints.Max;

public class MaxSatisfactionUtilTests {

    private MaxSatisfactionUtil maxSatisfactionUtil;

    @Before
    public  void setUp()
    {
        //initail setup
    }

    @Test
    public void testCase1()
    {

        int timeTaken[] = {2,3,1,5};
        int satisfaction[] = {6,1,3, 9};

        int max = 6;

       Assert.assertEquals(12, MaxSatisfactionUtil.getMaxSatisfaction(satisfaction, timeTaken, max));


    }

}
