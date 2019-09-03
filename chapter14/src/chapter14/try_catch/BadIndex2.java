/*
 * 교수님 ver 
 */
package chapter14.try_catch;

public class BadIndex2 {
	   public static final int NO; static {NO=10;}
	   public static void main(String[] args)  {
	      int[] array = new int[NO];
	      int result=0;
	      for(int i=0; i<array.length;i++) {
	         array[i]=i;
	      }
	      
	      //testPrint();
	      
	      try {
	         result = array[12];
	         System.out.println("1 . 프로그램 진행중");
	      }catch(ArrayIndexOutOfBoundsException e) {
	         result = array[9];
	         System.out.println("2 . 잘 했어요 "+result);
	         // throw new RuntimeException();
	      }finally {
	         System.out.println("3 . 프로그램 진행을 잘 완료했습니다.");
	      }
	      System.out.println("4 . 과연 이 문장이 실행될까요?"+result);
	   }
	   
	   private static void testPrint()   {
	      System.out.println("11. 함수를 실행합니다.");
	      int number =0;
	      
	      try {
	         number = 10/0;
	      } catch(ArithmeticException e) {
	         System.out.println("12. 프로그램 오류");
	         throw new RuntimeException();
	      }
	      System.out.println("12. 출력값은 = "+number);
	      System.out.println("13. 프로그램을 종료합니다");
	   }

	}