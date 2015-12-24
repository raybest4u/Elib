package elib.utils;

import android.view.MotionEvent;
import android.view.View;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2015/7/10.
 */
public class XeyUtils {
    public static boolean checkEmptyStr(String str){
        return str==null||"".equalsIgnoreCase(str.trim());
    }
    public static boolean checkEmptyStrings(String... strs){
        for(String str:strs){
            if(str==null||"".equalsIgnoreCase(str.trim()))
                return true;
        }
        return false;
    }
    public static boolean isMobileNO(String mobiles) {
        Pattern p = Pattern
                .compile("^((13[0-9])|(15[0-9])|(18[0-9])|(17[0-9])|(14[0-9]))\\d{8}$");
        Matcher m = p.matcher(mobiles);
        // System.out.println(m.matches()+"---");
        return m.matches();
    }
    public  static  boolean inRangeOfView(View view, MotionEvent ev) {
        int[] location = new int[2];
        view.getLocationOnScreen(location);
        int x = location[0];
        int y = location[1];
        //Log.d("-->","------View y height--"+"---"+y+"---view height----"+view.getHeight());
        if ( ev.getY() < y
                || ev.getY() > (y + view.getHeight())) {
            return false;
        }
        return true;
    }
    public static int getRandomInt(){
        return new Random().nextInt();
    }
    public static int getRandomInt(int max){
        return new Random().nextInt(max);
    }
}
