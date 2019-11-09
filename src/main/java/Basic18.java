public class Basic18 {
    public static void main(String[] args) {
      float a =  6.3f;
      float b = 1.7f;
      float c = (float) (a*b);
      float d = (float) Math.sqrt(c);
      float r = (float) (d*(a/b-b/a));
      float s = a+b;
      float t = (float) (Math.pow(s,2));
      float m = (float) (4*a*b);
      float h = (float)(t-m);
      float g = (float) Math.sqrt(h);
      float k = (float) (r/g);


        System.out.println(k);


    }
}
