package org.example.menu;

import org.example.ex.A1;

import java.util.ArrayList;

public abstract class MenuService {
    @A1
    //추상화된 코딩.
    //구체적인 하위 하나 하나를 만드는 코딩이 아니라, 가능하면 부모 클래스를 보며 만드는 코딩
    //메뉴의 목록을 받는 게 우리가 원하는 기능
    //그 메뉴가 뭔지 몰라도 됨!

    public abstract ArrayList<Menu> getMenuList();



//    private ArrayList<Menu> menus;
//    public MenuService(ArrayList<Menu> menus){
//        this.menus = menus;
//    }
//
//    public ArrayList<Menu> getMinus(){
//        //이거 하나면 UI에게 주는 정보가 커피일수고, 쿠키일수도, 주스일수도 잇음.
//        return menus;
//    }
    
}
