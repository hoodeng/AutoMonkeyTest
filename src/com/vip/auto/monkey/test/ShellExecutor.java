package com.vip.auto.monkey.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by wudeng on 17/6/15.
 */
public class ShellExecutor {
    static final String sAdbToolsPath = "/Users/wudeng/Library/Android/sdk/platform-tools/";
    static final String sMonkeyCmd = "adb shell monkey -p com.vipshop.vshhc 1000";
    public void exec(){
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(sAdbToolsPath + sMonkeyCmd);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("e -- >" + e.getMessage());
        }
        finally
        {
            if (br != null)
            {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
