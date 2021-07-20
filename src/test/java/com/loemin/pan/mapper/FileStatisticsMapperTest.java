package com.loemin.pan.mapper;

import com.loemin.pan.model.FileStatistics;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FileStatisticsMapperTest {
    @Autowired
    private FileStatisticsMapper mapper;
    @Test
    public void test() {
        FileStatistics fileStatistics = mapper.selectById(1);
        System.out.println(fileStatistics);
    }
    @Test
    void insert(){
        FileStatistics fileStatistics = new FileStatistics();
        fileStatistics.setUserId(1L);
        fileStatistics.setUsedCapacity(1L);
        fileStatistics.setFileCount(1);
        fileStatistics.setTotalCapacity(1L);
        int insert = mapper.insert(fileStatistics);
        System.out.println(fileStatistics);
    }

}