package com.ding.god.dinglibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.ding.god.dinglibrary.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by god on 2017/7/22.
 */

public class FocusView extends RelativeLayout {

    private List<ImageView> imageViews;
    private boolean canLoob = true; //是否循环
    private boolean canAutoSlide = true; //是否自动滚动
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
    //指示器平常与被选中的样式
    private int indicatorNormal;
    private int indicatorSelected;
    private int indicatorGravity;

    private ViewPager vp;
    private LinearLayout indicatorContainer;
    private FocusPagerAdapter focusPagerAdapter;

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
        indicatorGravity = a.getInt(R.styleable.FocusView_indicatorGravity,PARENT_BOTTOM_CENTER);
        indicatorPadding = a.getDimensionPixelSize(R.styleable.FocusView_indicatorPadding,0);
        indicatorPaddingBottom = a.getDimensionPixelSize(R.styleable.FocusView_indicatorPaddingBottom,0);
        indicatorPaddingStart = a.getDimensionPixelSize(R.styleable.FocusView_indicatorPaddingStart,0);
        indicatorPaddingEnd = a.getDimensionPixelSize(R.styleable.FocusView_indicatorPaddingEnd,0);
        indicatorNormal = a.getResourceId(R.styleable.FocusView_indicatorNormal,0);
        indicatorSelected = a.getResourceId(R.styleable.FocusView_indicatorSelected,0);
        a.recycle();

        imageViews = new ArrayList<>();
        //初始化子视图
        initChild(context);
    }

    private void initChild(Context context) {
        //添加viewpager
        vp = new ViewPager(context);
        vp.setBackgroundColor(Color.RED);
        vp.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        focusPagerAdapter = new FocusPagerAdapter();
        addView(vp);
        //添加indicator
        RelativeLayout.LayoutParams indicatorLp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        indicatorLp.addRule(ALIGN_PARENT_BOTTOM);
        indicatorLp.addRule(CENTER_HORIZONTAL);
        indicatorLp.setMargins(0,0,0,20);
        indicatorContainer = new LinearLayout(context);//创造指示器容器
        indicatorContainer.setLayoutParams(indicatorLp);
        indicatorContainer.setOrientation(LinearLayout.HORIZONTAL);//设置方向水平
        addView(indicatorContainer);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    //设置焦点图的内容
    public void setFocusImages(List<ImageView> imageViews){
        this.imageViews.addAll(imageViews);
        vp.setAdapter(focusPagerAdapter);
    }

    private class FocusPagerAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            if(imageViews==null||imageViews.size()==0) {
                return 0;
            }
            return canLoob?Integer.MAX_VALUE:imageViews.size();
        }

        public int getTruePositon(int position){
            return position%imageViews.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = imageViews.get(getTruePositon(position));
            container.addView(imageView);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(((View) object));
        }
    }

}
