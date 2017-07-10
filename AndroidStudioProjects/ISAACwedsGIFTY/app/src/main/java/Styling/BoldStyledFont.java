package Styling;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Mike-berg on 13/04/2017.
 */

public class BoldStyledFont extends TextView {
    public BoldStyledFont(Context context){
        super(context);

    }

    public BoldStyledFont(Context context, AttributeSet attrs, int defStyleAttr)   {
        super(context, attrs, defStyleAttr);

        ;
    }

    public BoldStyledFont(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setTypeface(Typeface tf) {
        super.setTypeface(FontCache.getFont(getContext(), "Fonts/sketch.ttf"));
    }

}
