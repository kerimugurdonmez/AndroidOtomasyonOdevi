package constants;

import base.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class PageElements extends BasePage
{
    static int randomNumber = random.nextInt(4);

    public static final By BTNCANCELOFCOOKIEPOPUP = By.id("com.ozdilek.ozdilekteyim:id/btnCancel");
    public static final By STARTSHOPPINGBUTTON = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
    public static final By BTNOFCATEGORIES = By.id("com.ozdilek.ozdilekteyim:id/nav_categories");
    public static final By BTNKADINOFCATEGORIESMENU = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]");
    public static final By PANTOLON = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]");
    public static final By RANDOMPRODUCT = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]/android.view.ViewGroup/android.widget.ImageView");
    public static final By FAVORITEBUTTON = AppiumBy.id("com.ozdilek.ozdilekteyim:id/imgFav");
    public static final By EMAIL = AppiumBy.id("com.ozdilek.ozdilekteyim:id/etEposta");
    public static final By PASS = AppiumBy.id("com.ozdilek.ozdilekteyim:id/etPassword");
    public static final By BTNLOGIN = AppiumBy.id("com.ozdilek.ozdilekteyim:id/btnLogin");
    public static final By PERMISSONALLOWBTN = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button");
    public static final By MYACCOUNTBTN = AppiumBy.id("com.ozdilek.ozdilekteyim:id/nav_account");
    public static final By BTNBACK = AppiumBy.id("com.ozdilek.ozdilekteyim:id/ivBack");
    public static final By BTNADDCART = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");


}
