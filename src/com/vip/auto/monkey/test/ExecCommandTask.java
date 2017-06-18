package com.vip.auto.monkey.test;

import java.util.TimerTask;

/**
 * Created by wudeng on 17/6/15.
 */
public class ExecCommandTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("start exec command task");
        ShellExecutor executor = new ShellExecutor();
        executor.exec();
    }
}
