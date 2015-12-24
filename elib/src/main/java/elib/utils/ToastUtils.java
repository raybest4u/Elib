package elib.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * @author:kevin
 * @version 创建时间：2014-12-20 上午10:45:12
 */
public class ToastUtils {
	public static void show(Context context,String content){
		Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
	}
}
