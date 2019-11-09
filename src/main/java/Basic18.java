public class Basic18 {
    public static void main(String[] args) {
      float a = (float) 6.3;
      float b = (float) 1.7;
      float c = (float) (a*b);
      float d = (float) Math.sqrt(c);
      float r = (float) (d*(a/b-b/a));
      float t = (float) (Math.pow(a,b));
      float m = (float) (4*a*b);
      float h = (float)(t-m);
      float g = (float) Math.sqrt(h);
      float k = (float) (r/g);
      float j = (float) Math.floor(k);

        System.out.println(j);


    }
}
