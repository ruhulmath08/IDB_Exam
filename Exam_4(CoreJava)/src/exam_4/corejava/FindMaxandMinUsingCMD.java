package exam_4.corejava;

public class FindMaxandMinUsingCMD {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        if (a>b && a>c) {
            System.out.println("highest : "+a);
        }
        else if(b>a && b>c){
            System.out.println("highest : "+b);
        }
        else{
            System.out.println("highest : "+c);
        }
        
        if (a<b && a<c) {
            System.out.println("lowest : "+a);
        }
        else if(b<a && b<c){
            System.out.println("lowest : "+b);
        }
        else{
            System.out.println("lowest : "+c);
        }
    }
}
