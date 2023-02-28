package com.ymy.yyt_rate.engite;

import lombok.Data;

@Data
public class Rate {
    private int id;
    private float value;
    private int rateFatherId;
    private char state;
    private String name;
}
