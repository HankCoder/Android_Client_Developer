package com.hank.errarehest.copyqq.activity;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.Window;

import com.hank.errarehest.copyqq.R;
import com.hank.errarehest.copyqq.activity.presenter.TopRightMenu;

public class MainActivity extends AppCompatActivity {

    private TopRightMenu mTopRightMenu;
    private boolean showIcon = true;
    private boolean dimBg = true;
    private boolean needAnim = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_more) {
//            mTopRightMenu = new TopRightMenu(MainActivity.this);
//            List<MenuItemLocal> menuItems = new ArrayList<>();
//            menuItems.add(new MenuItemLocal(R.drawable.multichat, "发起多人聊天"));
//            menuItems.add(new MenuItemLocal(R.drawable.addmember, "加好友"));
//            menuItems.add(new MenuItemLocal(R.drawable.qr_scan, "扫一扫"));
//            mTopRightMenu
//                    .setHeight(680)     //默认高度480
//                    .setWidth(480)      //默认宽度wrap_content
//                    .showIcon(showIcon)     //显示菜单图标，默认为true
//                    .dimBackground(dimBg)           //背景变暗，默认为true
//                    .needAnimationStyle(needAnim)   //显示动画，默认为true
//                    .setAnimationStyle(R.style.TRM_ANIM_STYLE)  //默认为R.style.TRM_ANIM_STYLE
//                    .addMenuList(menuItems)
//                    .addMenuItem(new MenuItemLocal(R.drawable.facetoface, "面对面快传"))
//                    .addMenuItem(new MenuItemLocal(R.drawable.pay, "付款"))
//                    .setOnMenuItemClickListener(new TopRightMenu.OnMenuItemClickListener() {
//                        @Override
//                        public void onMenuItemClick(int position) {
//                            Toast.makeText(MainActivity.this, "点击菜单:" + position, Toast.LENGTH_SHORT).show();
//                        }
//                    })
//                    .showAsDropDown(findViewById(R.id.action_more), -255, 0);
//////                        .showAsDropDown(moreBtn);
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }
//
//    @Override
//    public boolean onMenuItemClick(MenuItem item) {
//
//        return false;
//    }
}
