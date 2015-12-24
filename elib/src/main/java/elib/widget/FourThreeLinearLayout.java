package elib.widget;

/**
 * User：McCluskey Ray on 2015/11/10 14:44
 * email：lr8734@126.com
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * A extension of ForegroundLinearLayout that is always 4:3 aspect ratio.
 */
public class FourThreeLinearLayout extends ForegroundLinearLayout {

    public FourThreeLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int fourThreeHeight = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthSpec) * 3 / 4,
                View.MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, fourThreeHeight);
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }
}
