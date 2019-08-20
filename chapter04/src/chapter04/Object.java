package chapter04;

public class Object 
{ 
    private static float[] f = new float[2]; //static을 빼면 다른 정적멤버변/함수가 부를 수 없다. 눈에 보이지만 실제로는 객체를 만들어야만 존재하기 때문.
    public static void main (String[] args) 
    {
        System.out.println("f[0] = " + f[0]); 

    } 
}