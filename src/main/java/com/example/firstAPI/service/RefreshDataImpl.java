package com.example.firstAPI.service;

import com.example.firstAPI.util.LoggerUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RefreshDataImpl implements RefreshData{
    private int score=0;
    LoggerUtil loggerUtil = LoggerUtil.getInstance();
    @Override
    @Scheduled(fixedRate = 10000)
    public int getLatestScore() {
        score++;
        loggerUtil.logInfo(RefreshData.class,"updated score every 10 sec "+score);
        return score;
    }
}
