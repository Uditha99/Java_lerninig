public class Box {
    int length;
    int width;
    int height;

    public void initialize(int l , int w ,int h){
        length = l;
        width = w;
        height =h;
    }

    public  void volume(){
        int volume = length * width * height;
        System.out.println("volume is : "+ volume);
    }
}
