package com.ding.god.icloudmusic.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ding.god.icloudmusic.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */

public class TopBar extends RelativeLayout {

    public static final int DEFAULT_BACKGROUND = Color.RED;//默认背景颜色
    public static final int DEFAULT_TITLE_SIZE = 16;//默认title字体大小
    private int background;
    private String title;
    private float titleSize;
    private Drawable icon;//左Icon
    private Drawable rightIcon;//右Icon
    private Drawable rightIcon2;//右2Icon
    private int centerLayoutId;//中心布局
    private ImageView ivIcon;
    private TextView tvTitle;
    private FrameLayout flCenterContainer;
    private ImageView ivRightIcon;
    private ImageView ivRightIcon2;
    private View topBarLayout;
    private int statusBarHeight;//状态栏高度
    private RelativeLayout topBar;

    private int width;//控件宽度
    private int height;//控件高度
    private List<View> views = new ArrayList<>();


    public TopBar(Context context) {
        this(context, null);
    }

    public TopBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }


    public TopBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TopBar, defStyleAttr, 0);
        background = a.getColor(R.styleable.TopBar_topBarBackground, DEFAULT_BACKGROUND);
        title = a.getString(R.styleable.TopBar_mTitle);
        titleSize = a.getDimensionPixelSize(R.styleable.TopBar_mTitleSize, DEFAULT_TITLE_SIZE);
        icon = a.getDrawable(R.styleable.TopBar_icon);
        rightIcon = a.getDrawable(R.styleable.TopBar_rightIcon);
        rightIcon2 = a.getDrawable(R.styleable.TopBar_rightIcon2);
        centerLayoutId = a.getInt(R.styleable.TopBar_centerLayout, 0);
        a.recycle();

        initLayout(context);

        statusBarHeight = getStatusBarHeight();
    }


    //初始化布局
    private void initLayout(Context context) {

        topBarLayout = LayoutInflater.from(context).inflate(R.layout.layout_topbar, this);
        topBar = ((RelativeLayout) topBarLayout.findViewById(R.id.rl_topBar));
        ivIcon = (ImageView) topBarLayout.findViewById(R.id.iv_icon);
        tvTitle = (TextView) topBarLayout.findViewById(R.id.tv_title);
        flCenterContainer = (FrameLayout) topBarLayout.findViewById(R.id.fl_center_container);
        ivRightIcon = (ImageView) topBarLayout.findViewById(R.id.iv_right_icon);
        ivRightIcon2 = (ImageView) topBarLayout.findViewById(R.id.iv_right_icon2);

        topBarLayout.setBackgroundColor(background);
        ivIcon.setImageDrawable(icon);
        tvTitle.setText(title);
        tvTitle.setTextSize(titleSize);
        ivRightIcon.setImageDrawable(rightIcon);
        ivRightIcon2.setImageDrawable(rightIcon2);
        if (centerLayoutId != 0) {
            LayoutInflater.from(context).inflate(centerLayoutId, flCenterContainer);
        }


    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        //将添加的所有view移到flCenterContainer中
        for (int i=1;i<getChildCount();i++){
            View view = getChildAt(i);
            removeView(view);
            views.add(view);
            flCenterContainer.addView(view);
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        //计算所有flCenterContainer中的View
        for (int i=0;i<views.size();i++){
            measureChild(views.get(i),widthMeasureSpec,heightMeasureSpec);
        }

        //计算topbar的宽高
        measureChild(topBar,widthMeasureSpec,heightMeasureSpec);
        //获得topbar的宽高
        width = MeasureSpec.getSize(widthMeasureSpec);
        height = topBar.getMeasuredHeight();

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            height += statusBarHeight;
        }
        setMeasuredDimension(width,height);
    }



    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        topBar.layout(0,statusBarHeight,r,height);
    }




    public void setIconOnClickListener(OnClickListener listener){
        ivIcon.setOnClickListener(listener);
    }

    public void setRightIconOnClickListener(OnClickListener listener){
        ivRightIcon.setOnClickListener(listener);
    }

    public void setRightIcon2OnClickListener(OnClickListener listener){
        ivRightIcon2.setOnClickListener(listener);
    }

    //获得状态栏的高度
    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        Log.d("TAG","STATUSBAR:"+result);
        return result;
    }


}
