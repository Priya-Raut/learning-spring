package com.demo.spring.learningspring.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A class that provides date utilities.
 */
public class DateUtility {
    public static Date getDateFromDateString(String dateString){
        Date date = null;
        final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        if(dateString != null){
            try {
                date = DATE_FORMAT.parse(dateString);
            } catch (ParseException e) {
                date = new Date(); //if exception is caught during parsing, return today's date
            }
        }
        else{
            date = new Date(); //empty dateString returns today's date
        }
        return date;
    }
}
