package com.omid.bookservice;

import lombok.Getter;

@Getter
public enum Category {
    PSYCHOLOGY("روانشناسی"),
    LITERATURE("ادبیات و شعر"),
    NOVEL("رمان"),
    PHILOSOPHY("فلسفه"),
    COURSE("درسی"),
    HISTORICAL("تاریخی");

    private final String value;
    Category(String value){
        this.value=value;
    }



}
