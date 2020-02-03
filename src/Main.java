public class Main {
    public static void main(String[] args) {
        try{
            String str = null;
            int len = str.length();
            System.out.println(len);
        }catch (NullPointerException e){
            System.out.println("NullPointerException!!!");
            System.out.println(e.getMessage());
        }

    }
}
