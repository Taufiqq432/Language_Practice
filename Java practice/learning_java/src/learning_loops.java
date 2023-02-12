

public class learning_loops {
    public static void main(String[] args) {
        int i=1;

        while (i<4){
            System.out.println(i);
            i++;
        }
        System.out.println("next");
        for(int j=0;j<6;j++){
            System.out.println(j);
        }
        System.out.println("next");
        int k=1;
        do {
            System.out.println(k);
            k++;

        }while (k<5);
        //we can also use break and continuous statement in every loops.
//        while (true){
//            System.out.println("go");
//        }
    }
}
