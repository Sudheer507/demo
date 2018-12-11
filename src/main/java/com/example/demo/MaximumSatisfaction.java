package com.example.demo;

import com.example.demo.util.MaxSatisfactionUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaximumSatisfaction {



    public long getMaximumSatisfaction()  {
        Resource resource = new ClassPathResource("data.txt");
        InputStream is = null;
        try {
          is =  resource.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            return  -1;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));

        int totalTime = -1, noOfitems = -1;
        String line =null;
        try {
             line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] data = line.split(" ");

        try {
            totalTime = Integer.parseInt(data[0]);
        }catch (Exception ex)
        {}

        try
        {
            noOfitems = Integer.parseInt(data[1]);
        }catch (Exception ex)
        {}

        int []satisfaction = new int[noOfitems];
        int []timeTaken = new int[noOfitems];
        for(int i =0 ; i < noOfitems; i++)
        {
            try {
                String eachMenuData = bufferedReader.readLine();
                String eachData[] = eachMenuData.split(" ");
                 timeTaken[i] = Integer.parseInt(eachData[1]);
                 satisfaction[i] = Integer.parseInt(eachData[0]);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return MaxSatisfactionUtil.getMaxSatisfaction(satisfaction, timeTaken, totalTime);
    }

}
