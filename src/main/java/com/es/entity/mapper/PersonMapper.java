package com.es.entity.mapper;

import com.es.entity.Person;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface PersonMapper extends ElasticsearchRepository<Person,Integer> {
    public List<Person> findByPersonNameLike(String name);

    @Query("{\n" +
            "        \t\"match\" : {\n" +
            "        \t\t\"age\" : \"?0\"\n" +
            "        \t}\n" +
            "}")
    public  List<Person> myWay(String age);
}
