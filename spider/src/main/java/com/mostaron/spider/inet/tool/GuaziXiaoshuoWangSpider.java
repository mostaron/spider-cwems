package com.mostaron.spider.inet.tool;

import com.mostaron.spider.inet.SelfReader;
import com.mostaron.spider.inet.tool.guazi.Spider;
import com.mostaron.spider.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class GuaziXiaoshuoWangSpider {

    @Autowired
    Spider spider;

    @Autowired
    ChapterRepository chapterRepository;

    @Bean
    CommandLineRunner downBook(){
        return (args) ->{
//            SelfReader sr = new SelfReader();
//            String protocol = "https://";
//            String host = "www.cwems.com";
//            String start_url = "/shu/231053/41506236.html";
//            int order = 1;
//
//
//            chapterRepository.deleteAll();
//
//            while(start_url != null && !start_url.isEmpty()){
//                start_url = spider.getPageContent(protocol, host, start_url, order++);
//            }
        };
    }

}
