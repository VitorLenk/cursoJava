public class calculadora
{
    int res;

    public void calcula(int n1, int n2, int a){
        if(a == 1){
            res = n1+n2;
            System.out.println(res);
        }else if(a == 2){
            res = n1-n2;
            System.out.println(res);
        }else{
            res = n1*n2;
            System.out.println(res);
        }

    }


}
