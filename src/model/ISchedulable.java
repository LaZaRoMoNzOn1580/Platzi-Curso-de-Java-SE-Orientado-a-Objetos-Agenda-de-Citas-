package model;

import java.util.Date;

public interface ISchedulable {

    default void schedule(Date date, String time){

    }
}
