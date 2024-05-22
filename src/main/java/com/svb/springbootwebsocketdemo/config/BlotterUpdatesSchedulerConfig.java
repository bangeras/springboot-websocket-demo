package com.svb.springbootwebsocketdemo.config;

import com.svb.springbootwebsocketdemo.model.StockPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class BlotterUpdatesSchedulerConfig {

    @Autowired
    SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 2000)
    public void updateStockPriceOnBlotter(){
        template.convertAndSend("/topic/stock-price-updates", new StockPrice());
    }
}
