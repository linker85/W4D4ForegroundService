package com.example.com.w4d4homeworkforegroundservice;

/**
 * Created by raul on 10/11/2016.
 */
public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.example.com.w4d4homeworkforegroundservice.main";
        public static String PREV_ACTION = "com.example.com.w4d4homeworkforegroundservice.prev";
        public static String PLAY_ACTION = "com.example.com.w4d4homeworkforegroundservice.play";
        public static String NEXT_ACTION = "com.example.com.w4d4homeworkforegroundservice.next";

        public static String STARTFOREGROUND_ACTION = "com.example.com.w4d4homeworkforegroundservice.startforeground";
        public static String STOPFOREGROUND_ACTION  = "com.example.com.w4d4homeworkforegroundservice.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}