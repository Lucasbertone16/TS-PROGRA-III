public class Pt15 {
    public static void main(String[] args) {
       int[] arreglonums={5,16,1,9,0,7};
       int aux=0;
       for(int i=0;i<arreglonums.length-1;i++){
           for(int j=0;j<arreglonums.length-i-1;j++){
               if (arreglonums[j]>arreglonums[j+1]) {
                    aux=arreglonums[j];
                    arreglonums[j]=arreglonums[j+1];
                    arreglonums[j+1]=aux;
               }
           }
       }
       for(int i=0;i<arreglonums.length;i++){
        System.out.println(arreglonums[i]);
       }
}
}
