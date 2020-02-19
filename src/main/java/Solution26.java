public class Solution26 {
    int top, left, width, height;
    public void initialize(int top, int left, int width, int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public void initialize(int top, int left){
        initialize( top, left, 0, 0);
    }
    public void initialize(int top, int left, int width){
        initialize( top, left, width, 0);
    }
    public void initialize(Solution26 rec){
        initialize(rec.top, rec.left, rec.width, rec.height);
    }

    public static void main(String[] args) {

    }
}
