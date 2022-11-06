package oops.inheritance;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    Box(int l){
        this.l=l;
        this.w=l;
        this.h=l;
    }
    Box(int l, int w, int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
}
