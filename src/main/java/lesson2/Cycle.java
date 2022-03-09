package lesson2;

public class Cycle {
    public static void main(String[] args) {

        /*for(int i = 10; i > 0; i --){
            System.out.println(i);
        }*/
        final int LIMIT_OF_CYCLE = 10;

        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
//           for(int i=0; i < 5; i ++ ){
            for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
                System.out.println("# ");
//               System.out.printf("# i:%d, j:%d%n", i,j);
            }
            System.out.println();

        }
        String str = "";
        for(int i = 0; i < LIMIT_OF_CYCLE; i ++){
//            str +="F";
            if(i%2 ==0) {
                str += "F ";
            }else{
                str +="G ";
            }
            System.out.print(str);

            for(int j = 0; j < LIMIT_OF_CYCLE - 1 - i; j ++){
                System.out.print("A ");
            }
            System.out.println();
        }
    }
}


