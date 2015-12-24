package elib.widget.refreshlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/**
 * just support the LinearLayoutManager and the orientation is vertical
 * Created by 6a209 on 14/10/29.
 */
public class PullRefreshListView extends RefreshLayout{

    public PullRefreshListView(Context context){
        this(context, null);
    }

    public PullRefreshListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected View createRefreshView() {
    	ListView rv =  new ListView(getContext());
 
        return rv;
    }



}
