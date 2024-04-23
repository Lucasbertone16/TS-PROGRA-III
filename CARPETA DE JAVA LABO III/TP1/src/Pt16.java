public class Pt16 {
    public static String numBinario(int num){
        
        String binario="";
        
        if(num>=0){
           while(num>0){
               if(num%2==0){
                binario="0"+binario;
               }
               else{
                binario="1"+binario;
               }
                num=num/2;
           }
        }
        else{
            System.out.println("Numero negativo");
        }

        return binario;
    }
    public static void main(String[] args) {
        System.out.println(numBinario(100));
    }
}
