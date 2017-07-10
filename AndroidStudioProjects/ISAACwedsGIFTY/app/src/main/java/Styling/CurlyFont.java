package Styling;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Mike-berg on 13/04/2017.
 */

public class CurlyFont extends TextView{
    public CurlyFont(Context context){
        super(context);

    }

    public CurlyFont(Context context, AttributeSet attrs, int defStyleAttr)   {
        super(context, attrs, defStyleAttr);

        ;
    }

    public CurlyFont(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setTypeface(Typeface tf) {
        super.setTypeface(FontCache.getFont(getContext(), "Fonts/rakoon.ttf"));
    }

}
