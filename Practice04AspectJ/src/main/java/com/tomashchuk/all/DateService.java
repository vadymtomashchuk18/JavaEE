package com.tomashchuk.all;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Вадим on 23.02.2017.
 */
@Service("dateservice")
public class DateService {
    public static final Date d = new Date();
    SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");

    public String currentDate(){
        return format1.format(d);
    }
}
