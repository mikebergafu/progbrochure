package Styling;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Mike-berg on 13/04/2017.
 */


public class BoldCurlFont extends TextView {
    public BoldCurlFont(Context context){
        super(context);

    }

    public BoldCurlFont(Context context, AttributeSet attrs, int defStyleAttr)   {
        super(context, attrs, defStyleAttr);

        ;
    }

    public BoldCurlFont(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setTypeface(Typeface tf) {
        super.setTypeface(FontCache.getFont(getContext(), "Fonts/Allura-Regular.ttf"));
    }

}
