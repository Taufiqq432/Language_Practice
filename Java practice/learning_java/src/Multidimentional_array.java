public class Multidimentional_array {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        System.out.println("length of a"+a.length);
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                //System.out.println(a[i].length);
                System.out.print(" "+a[i][j]);

            }
            System.out.println("  ");

        }
        int b[][]={{1,2,3},{66,66,66,6,6},{12,23}};
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                //System.out.println(a[i].length);
                System.out.print(" "+b[i][j]);

            }
            System.out.println("  ");

        }


    }
}
