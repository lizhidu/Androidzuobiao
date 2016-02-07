package com.lizhidu.androidzuobiao;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

/**
 * Created by dulzh on 2/7/16.
 */
public class ScrollerView extends View {

    private int lastX;
    private int lastY;
    private Scroller mScroller;

    public ScrollerView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        setBackgroundColor(Color.BLUE);
        mScroller = new Scroller(context);

    }

    public ScrollerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);

    }

    public ScrollerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);

    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        // 判断Scroller是否执行完毕
        if (mScroller.computeScrollOffset()) {
            ((View) getParent()).scrollTo(
                    mScroller.getCurrX(),
                    mScroller.getCurrY());
            // 通过重绘来不断调用computeScroll
            invalidate();
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = (int) event.getX();
                lastY = (int) event.getY();

                break;
            case MotionEvent.ACTION_MOVE:
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                ((View) getParent()).scrollBy(-offsetX, -offsetY);
                break;

            case MotionEvent.ACTION_UP:
                View view = (View) getParent();
                mScroller.startScroll(view.getScrollX(), view.getScrollY(), -view.getScrollX()+100, -view.getScrollY()+100,3000);
                invalidate();//不断绘制，调用computercroll

//                ((View) getParent()).scrollTo(
//                        mScroller.getCurrX(),
//                        mScroller.getCurrY());
                break;
        }
        return true;
    }
}
