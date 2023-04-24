package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final String s;

    public ReversedSequence(String s) {
        this.s = s;
    }
    public CharSequence toString(String s1) {
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();

    }
    @Override
    public CharSequence subSequence(int i, int i1) {
        StringBuilder sb = new StringBuilder(s.substring(i, i1));

        return sb.reverse().toString();

    }

    @Override
    public int length() {
        return s.length();
    }
    @Override
    public char charAt(int i) {
        return s.charAt(length()-1-i);
    }



















  /*

    private final String s;
    public ReversedSequence (String s){
        this.s = s;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int i) {
        return s.charAt(s.length()-i-1);
    }

    @Override

    public CharSequence subSequence(int start, int end) {

        StringBuilder sb = new StringBuilder(s.substring(start, end));

        return sb.reverse().toString();

    }



    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();

    }*/
}
// END
