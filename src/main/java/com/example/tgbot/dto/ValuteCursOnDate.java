package com.example.tgbot.dto;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/указать значение поля
@XmlRootElement(name = "ValuteCursOnDate") //Корневой элемент
@Data //Генерируем геттеры и сеттеры

public class ValuteCursOnDate {

    @XmlElement(name = "Vname") //Название XML тэга
    private String name;

    @XmlElement(name = "Vnom") //Название XML тэга
    private int nominal;

    @XmlElement(name = "Vcurs") //Название XML тэга
    private double course;

    @XmlElement(name = "Vcode") //Название XML тэга
    private String code;

    @XmlElement(name = "VchCode") //Название XML тэга
    private String chCode;

    public void setName(String name) {
        this.name = name;
    }

    public void setChCode(String chCode) {
        this.chCode = chCode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getName() {
        return name;
    }

    public int getNominal() {
        return nominal;
    }

    public double getCourse() {
        return course;
    }

    public String getCode() {
        return code;
    }

    public String getChCode() {
        return chCode;
    }
}