package chapter10.parameters;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{

   //생성자 콜 함수(멤버변수 초기화)
   public AppMain() {
      System.out.println(Thread.currentThread().getName()+"스레드 AppMain()");
   }
   
   //2. init() 콜 함수
   @Override
   public void init() throws Exception {//init는 콜백함수 자동으로 불러온다.
      Parameters ps =getParameters();
      
      //맵 사용
      Map<String, String> map = ps.getNamed();

      Set<Entry<String, String>> entrySet = map.entrySet();
      for(Entry<String,String> entry :entrySet) {
         String key = entry.getKey();
         String value = entry.getValue();
         
         System.out.println("Key="+key+", Value="+value);
      }
      
      
      //리스트 사용
//      List<String> list = ps.getRaw();
//      
//      for(String value: list) {
//         System.out.println(value);
//      }
      
      super.init();
   }



   public static void main(String[] args) {
      System.out.println(Thread.currentThread().getName()+"스레드 main()");
      launch(args);
      
   }

   @Override
   public void start(Stage primaryStage) throws Exception {
      System.out.println(Thread.currentThread().getName()+"스레드 start()");
      primaryStage.setTitle("나리미창");
      primaryStage.show();
      
   }

   @Override
   public void stop() throws Exception {
      System.out.println(Thread.currentThread().getName()+"스레드 stop()");
      
   }
   
   

}
