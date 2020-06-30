package com.paul623.javaweb.ex.humanresourcemanagement.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    public static String getCurDate(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }
}
