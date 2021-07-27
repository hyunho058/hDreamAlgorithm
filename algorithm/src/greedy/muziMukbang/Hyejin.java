package greedy.muziMukbang;


class Food implements Comparable<Food>{
    private int time;
    private int index;

    public int getTime() {
        return time;
    }

    public int getIndex() {
        return index;
    }

    //시간별 정렬
    @Override
    public int compareTo(Food o) {
        return Integer.compare(this.time, o.time);
    }
}

public class Hyejin {


}
