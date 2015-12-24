package xey.elib.utils;

import android.text.TextUtils;
import android.util.Log;


/**
 * User：Mc Cluskey Ray on 2015/7/27 10:34
 * email：lr8734@126.com
 */
public class XLog {
    private final static  boolean DEBUG = true;

    public static void i(String tag,String msg){
        if(DEBUG&& !TextUtils.isEmpty(msg))
            Log.i(tag,msg);
    }
    public static void i(String msg){
        if(DEBUG&& !TextUtils.isEmpty(msg))
            Log.i("-->",msg);
    }
    public static void d(String msg){
        if(DEBUG&& !TextUtils.isEmpty(msg))
        Log.d("-->",msg);
    }
    public static void d(String tag,String msg){
        if(DEBUG&& !TextUtils.isEmpty(msg))
            Log.d(tag,msg);
    }
    public static void e(String msg,Exception e){
            Log.e("-->"+msg, "--"+e.getMessage());
        e.printStackTrace();
    }
    public static void e(Exception e){
        Log.e("---->",e.getMessage());
        e.printStackTrace();
    }

    public static void printObj(Object obj){
        //if(DEBUG)
       // XLog.d("Obj is -->" + ToStringBuilder.reflectionToString(obj));
    }
}
