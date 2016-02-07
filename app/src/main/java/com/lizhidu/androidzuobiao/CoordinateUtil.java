package com.lizhidu.androidzuobiao;

/**
 * Created by dulzh on 2/7/16.
 */
public class CoordinateUtil {

    //1.获取控件的高度 在本Activity中获取当前Activity中控件的height：
//    Button button = (Button)findViewById(R.id.button);
//    int buttonHeight = button.getHeight();

    //2.1在Activity中获取其他xml文件中控件的height：

//    LayoutInflater factorys = LayoutInflater.from(当前类.this);
//    final View textEntryView = factorys.inflate(R.layout.你要获取的另一个XML, null);
//    TextView y_type = (TextView) textEntryView.findViewById(R.id.控件ID);
//    int textHeight = y_type.getHeight();
    //2.2
//    LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
//    final View layout = inflater.inflate(R.layout.my_kebiao_setting,null);
//    TextView y_type = (TextView)findViewById(R.id.控件ID);
//    int textHeight = y_type.getHeight();

    //3.1获取屏幕的高度 onCreate（）
//    DisplayMetrics metrics = new DisplayMetrics();
//    getWindowManager().getDefaultDisplay().getMetrics(metrics);
//    int screenWidth=metrics.widthPixels;            //屏幕宽度
//    int .screenHeight=metrics.heightPixels;        //屏幕高度

//    3.2
//    WindowManager wm = (WindowManager)getSystemService(Context.WINDOW_SERVICE);
//    int width = wm.getDefaultDisplay().getWidth();
//    int height = wm.getDefaultDisplay().getHeight();


    //4.获取标题栏和状态栏

//    Rect rect = new Rect();
//    Window win = this.getWindow();
//    win.getDecorView().getWindowVisibleDisplayFrame(rect);
//    int statusBarHeight = rect.top;
//    int contentViewTop = win.findViewById(Window.ID_ANDROID_CONTENT).getTop();
//    int titleBarHeight = contentViewTop - Variable.statusBarHeight;
//statusBarHeight为状态栏高度，titleBarHeight为标题栏高度
}
