package com.config;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/10/27.
 */
@Configuration
public class SolrConfig {
    @Bean
    public SolrClient solrClient(@Value("${spring.data.solr.host}")String host){
        String url = "http://10.1.1.186:8080/solr/testCore";
        System.out.println("----Solr url :   "+host);
        return new HttpSolrClient(host);
    }
}
