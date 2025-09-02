package dbb;

public class jdb {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
