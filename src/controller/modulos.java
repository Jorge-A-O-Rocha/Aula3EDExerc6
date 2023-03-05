package controller;

public class modulos {
	public modulos() {
		super();
	}
	
	public int ffat(int n){
        int f;
        //condição de parada será quando n chegar a 0 e assim parar de subtrair o próximo número
        if(n != 0){
        	// n * n-1 * n-2 * n-3 ... n=1, vai sempre multiplicar o número n - 1  e multiplicar 
            f=n*ffat(n-1);
            return f;
        }else{
            return 1;
        }
    }
	
    public double serie(int x) {
    	// Condição de parada é quando n for 1 pq nao tem com quem somar
        if (x == 1) { 
            return 1;
        } else {
        	//  n=3 1/6 + 1/2 + 1 = 1.6666666666666667 vai subitraindo o n de um em um e somando os resultados das frações de 1 sobre fatoriais
            return  (1.0/ ffat(x)) + serie(x-1) ;
        }
    }

}
