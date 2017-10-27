package com.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/10/27.
 */
@RestController
@RequestMapping("/solr")
public class SolrController {

    @Autowired
    private SolrClient solrClient;

    @RequestMapping("/updateIndex")
    public void updateIndex()throws Exception{
        Collection<SolrInputDocument> list = new ArrayList<>();
        for(int i = 1; i<=30;i++){
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id","spring_test_"+i);
            document.addField("name","我是中国人"+i);
            list.add(document);
        }
        solrClient.add(list);
        solrClient.commit();
    }
}
