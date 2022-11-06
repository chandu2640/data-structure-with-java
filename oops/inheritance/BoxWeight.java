package oops.inheritance;

public class BoxWeight extends Box{
    int weight;

    BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(int l, int w, int h ){
        super(l,w,h);
        this.weight=weight;
    }
}
