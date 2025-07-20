public class twosum {
    public static void main(String[] args) {
        int target=14;
        int num[]={3,7,11,6,50};
        for(int i=0;i<4;i++){
            for(int j=i+1;j<num.length;j++){
                if (target==num[i]+num[j]) {
                    System.out.println(i+" "+j);
                    System.out.println(num[i]+" "+num[j]);
                    
                }
            }
        }
    }
}