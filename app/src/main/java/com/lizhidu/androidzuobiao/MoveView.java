package com.lizhidu.androidzuobiao;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dulzh on 2/6/16.
 */
public class MoveView extends TextView  {
    private int lastX;
    private int lastY;


    public MoveView(Context context) {
        super(context);
    }

    public MoveView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MoveView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                System.err.println("调用onTouchEvent方法获取的x＝" + x + ",y=" + y);
                //记录触摸点的坐标值
                lastX = x;
                lastY = y;
                System.err.println("重新赋值之后的lastX＝" + lastX + ",lastY=" + lastY);

                break;
            case MotionEvent.ACTION_MOVE:

                System.err.println("move移动之后的x＝" + x + ",y=" + y);

                //计算偏移量
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                System.err.println("偏移量offsetX＝" + offsetX + ",offsetY=" + offsetY);
//        protected void onLayout(boolean changed, int left, int top, int right, int bottom)
                //1.设置偏移量重新绘制布局位置
//                layout(getLeft() + offsetX, getTop() + offsetY, getRight() + offsetX, getBottom() + offsetY);
                //2.通过固定的api进行偏移量的处理
//                offsetLeftAndRight(offsetX);
//                offsetTopAndBottom(offsetY);
                //3.通过LayoutParams进行参数修改
//                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
//                layoutParams.leftMargin = getLeft() + offsetX;
//                layoutParams.topMargin = getTop() + offsetY;
//                setLayoutParams(layoutParams);
                //4.scrollBy
//                scrollBy(offsetX,offsetY); //这样没法移动view本身，而已移动的view的内容
                ((View)this.getParent()).scrollBy(-offsetX,-offsetY);
                break;
            case MotionEvent.ACTION_UP:

                break;
        }
        return true;

    }
}
