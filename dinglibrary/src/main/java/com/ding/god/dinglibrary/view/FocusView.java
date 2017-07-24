package com.ding.god.dinglibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.ding.god.dinglibrary.R;


/**
 * Created by god on 2017/7/22.
 */

public class FocusView extends RelativeLayout {
    //指示器的位置
    public static final int PARENT_BOTTOM_LEFT = 0;
    public static final int PARENT_BOTTOM_RIGHT = 1;
    public static final int PARENT_BOTTOM_CENTER = 2;
    //背景色
    private int fvBackground;
    //指示器与边界的距离
    private int indicatorPadding;
    private int indicatorPaddingBottom;
    private int indicatorPaddingStart;
    private int indicatorPaddingEnd;
    private int indicatorNormal;
    private int indicatorSelected;

    public FocusView(Context context) {
        this(context,null);
    }

    public FocusView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public FocusView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FocusView, defStyleAttr, 0);
        fvBackground = a.getInt(R.styleable.FocusView_fvBackground, Color.GRAY);

//        a.getInt(R.styleable.FocusView_indicatorGravity,PARENT_BOTTOM_CENTER);
        indicatorPadding = a.getDimensionPixelSize(R.styleable.FocusView_indicatorPadding,0);
//        indicatorPaddingBottom = a.getDimensionPixelSize(R.styleable.FocusView_indicatorPaddingBottom,0);
//        indicatorPaddingStart = a.getDimensionPixelSize(R.styleable.FocusView_indicatorPaddingStart,0);
//        indicatorPaddingEnd = a.getDimensionPixelSize(R.styleable.FocusView_indicatorPaddingEnd,0);

        indicatorNormal = a.getResourceId(R.styleable.FocusView_indicatorNormal,0);
        indicatorSelected = a.getResourceId(R.styleable.FocusView_indicatorSelected,0);

        a.recycle();
        //初始化子视图
        initChild(context);
    }

    private void initChild(Context context) {

    }
}
