public class met {
    private int num;
    private int resultado;
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    

    public static int fatorial(int num){
        
        if(num==0){
            return 1;
        }
        else{

            
            return num * fatorial(num - 1);
        }
    }
   
       
}
