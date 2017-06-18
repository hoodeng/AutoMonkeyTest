package com.vip.auto.monkey.test;

import java.util.Timer;

/**
 * Created by wudeng on 17/6/15.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("hello auto monkey test");
//        ShellExecutor executor = new ShellExecutor();
//        executor.exec();

        Timer timer = new Timer();
        timer.schedule(new ExecCommandTask(),5000,10000);
    }
}
