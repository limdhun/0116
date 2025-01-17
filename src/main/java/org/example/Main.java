package org.example;

import org.example.ex.Ex1;
import org.example.menu.ComposeMenuService;
import org.example.menu.MegaMenuService;
import org.example.menu.Menu;
import org.example.menu.MenuService;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        //ArrayList 쓰지 말고 인터페이스 List 쓰기. 그래야 나중에 유연하게 변경 가능함

        List<LottoBall> ballList = new ArrayList<>();
        //컴파일러가 보는건 타입 정보. List ballList에 add가 잇음?
        for (int i = 0; i < 45; i++) {
            ballList.add(new LottoBall(i));
        }
        Collections.shuffle(ballList);
        List<LottoBall> result = ballList.subList(0,6);
        System.out.println(result);
        result.sort((b1,b2) -> b1.getNum() - b2.getNum());//람다식에서, return 키워드 안써도 됨
        System.out.println(result);


        
//        Ex1 obj1 = new Ex1();
//        Ex1 obj2 = new Ex1();




//        HashMap<String, MenuService> map = new HashMap<>();
//        map.put("mega", new MegaMenuService());
//        map.put("compose", new ComposeMenuService());
//        //-----------------------
//        MenuService menuService = map.get("mega");
//        menuService.getMenuList();






//        String url = "https://www.mega-mgccoffee.com/menu/menu.php?menu_category1=1&menu_category2=1&category=&list_checkbox_all=all";
//        Document doc = Jsoup.connect(url).get();
//        Element element = doc.selectFirst("#menu_list");
//        Elements names = element.select(".text1 b");//그냥 b로 하니 메뉴가 두 번씩 나와서..
//
//        System.out.println(names);
//        List<String> nameList = names.eachText();
//        System.out.println(nameList);

//        System.out.println(doc);





//        Document doc = Jsoup.connect("https://composecoffee.com/menu?amp%3Bcategory=185").get();
//
//        //System.out.println(doc);
//        //ID인 애 찾으려면 # 붙이기
//
//        Element element = doc.selectFirst("#masonry-container");
//        System.out.println(element);
//
//        Elements names = element.select("h4");
//        System.out.println(names);
//        List<String> nameList = names.eachText();
//        System.out.println(nameList);




        //eachText()는 List<String>가 입력되어야 함
        //잘 만들어진 라이브러리는 ArrayList가 아니라 추상화된 타입을 반환함. List와 같은 상위 타입.




        //Menu m = new Menu();//오류남
        //Menu m = new Coffee(); //이건 오류 안남. 커피는 추상이 아님.
        //Menu[] m = new Menu[10];//이건 오류 안남
        //abstract가 붙은 추상 클래스 Menu는 객체 생성 불가.
        //대신, 물려주거나 타입으로는 유효함.
//
//        HashMap<String,BasicRes> resHashMap = new HashMap<>();
//
//        resHashMap.put("서울", new BasicRes());
//        resHashMap.put("부산", new BusanRes());
//        resHashMap.put("대구", new DaeguRes());
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("도시를 입력하세요, 서울 부산 대구 중");
//
//        String city = scanner.nextLine();
//
//
//        BasicRes target = resHashMap.get(city);
//        target.makeZazang();

        //=======================

        //다형성 : 나는 대구, 서울, 부산만 알고 안에 있는 애들이 뭔진 모름



//        BasicRes r1 = new BusanRes();
//        BasicRes r2 = new DaeguRes();
//        r1.makeZambong();
//        r1.makeZazang();
//        r2.makeZazang();
//
//        ArrayList<BasicRes> resList = new ArrayList<>();
//        resList.add(new BasicRes());
//        resList.add(new BusanRes());
//        resList.add(new DaeguRes());
//
//        resList.forEach(r -> {r.makeZazang();
//        });
        //다형성 장점. 이 안에 내용물이 뭔지 몰라도, if else 없이, 내 코드 바꿀 필요 없이 다른 동작 가능.

    }
}