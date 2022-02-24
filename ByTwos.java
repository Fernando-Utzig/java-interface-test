public class ByTwos {
    
    int val;

    ByTwos(){
        val = 0;
    }

    public int getNext(){
        val += 2;
        return val;
    }
}
