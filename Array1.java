import java.util.Arrays;
public class Array1 {
        public static void main(String[] args) {
            int physics=90;
            int chemistry=95;
            int math=99;
            
            int[]marks=new int[3];
    
            marks[0]=95;
            marks[1]=90;
            marks[2]=99;
    
            Arrays.sort(marks);
            for(int i=0;i<marks.length;i++)
            System.out.print(marks[i]+" , " );

        }
    }
