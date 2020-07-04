package com.es.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Set;

//@Document(indexName = "database01",type = "person")
@ApiModel(value = "商品信息DTO")
public class Person {
//    @Id
    @ApiModelProperty(name = "id", value = "序号", dataType = "string")
    private Integer id;
    @ApiModelProperty(name = "personName", value = "序号", dataType = "string")
    private String personName;
    @ApiModelProperty(name = "age", value = "序号", dataType = "string")
    private Integer age;
    private Set<String> interest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }



    public Set<String> getInterest() {
        return interest;
    }

    public void setInterest(Set<String> interest) {
        this.interest = interest;
    }

    public Person(String personName, Integer age) {
        this.personName = personName;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", age='" + age + '\'' +
                ", interest=" + interest +
                '}';
    }
}
