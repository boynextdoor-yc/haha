package com.es;

import com.es.entity.Person;
import com.es.service.HelloService;
import org.elasticsearch.index.query.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.ResultsExtractor;
import org.springframework.data.elasticsearch.core.query.*;

import java.util.*;

@SpringBootTest
class EsApplicationTests<T> {
	@Autowired
    HelloService helloService;

/*	@Autowired
	ElasticsearchTemplate template;*/
/*	@Test
	void contextLoads() {
		Person person=new Person();
		person.setId(1);
		person.setAge("31");
		person.setPersonName("qq");
		Set<String> set=new HashSet<>();
		set.add("ball");
		set.add("game");
		person.setInterest(set);
		Person save = personMapper.save(person);
		List<Person> people=new ArrayList<>();
		people.add(person);
		personMapper.saveAll(people);
//		List<Person> qq = personMapper.findByPersonNameLike("qq");
//		System.out.println(qq);
//		List<Person> people = personMapper.findByAge("31");
//
//		System.out.println(people);
	}
	@Test
	 void test1(){
//		BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
//		List<QueryBuilder> filter = boolQuery.filter();
//		filter.add(QueryBuilders.matchQuery("personName","ee"));
		String s="{\n" +
				"        \"bool\" : {\n" +
				"            \"filter\" : {\n" +
				"                \"range\" : {\n" +
				"                    \"age\" : { \"gt\" : 20 }\n" +
				"                }\n" +
				"            },\n" +
				"            \"must\" : {\n" +
				"                \"match\" : {\n" +
				"                    \"personName\" : \"ee\"\n" +
				"                }\n" +
				"            }\n" +
				"        }\n" +
				"}";
		WrapperQueryBuilder wrapperQueryBuilder = QueryBuilders.wrapperQuery(s);
//		filter.add(QueryBuilders.matchQuery("age","29"));
		NativeSearchQuery build = new NativeSearchQueryBuilder().withPageable(PageRequest.of(0,2)).withQuery(wrapperQueryBuilder).build();
		Page<Person> search = personMapper.search(build);
	search.getContent().forEach(person -> System.out.println(person));
	}
	@Test
	void test2(){
		Person person=new Person();
		person.setId(3);
		person.setAge("29");
		person.setPersonName("ee");
		Set<String> set=new HashSet<>();
		set.add("ball");
		set.add("game");
		person.setInterest(set);
		IndexQuery build = new IndexQueryBuilder().withId(person.getId().toString()).withObject(person).build();
		List<IndexQuery> list=new ArrayList<>();
		list.add(build);
		template.bulkIndex(list);
	}
	@Test
	public void test4(){
		List list=new ArrayList();
		list.add(new Person());
	}*/

    @Test
    public void test5(){
        String i="";
        List<Object> list = getList();
        System.out.println(list);
    }

    public  <T> List<T> getList(){
        List<T> list=new ArrayList<>();
        return list;
    }

}
