package Teste;


public class Valores implements Valoresitf {

	int valorA[] =  {1,8,2,4,3};
	
public double mean() {
		
		double soma = 0;
		int[] nota = {10, 10 , 10, 10 ,10, 10 ,10, 10 ,10, 10 ,10, 10};
			
			for(int i = 0; i < nota.length; i++) {
				soma = soma + nota[i];
			}
			return soma/nota.length;
	}


@Override
	public boolean insert(int v) {
		for (int i = 0; i < valorA.length; i++) {

			if(v > 0) {

				this.valorA[i] = v;
				
				return true;
			}
		}
		return false;

	}

	@Override
	public int delete(int i) {
		for(int j = 0; j <= valorA.length; j++) {
			
			if(i > 0) {
				i--;
			}
		}
		return i;
	}


	public int size() {
		return this.valorA.length;
	}



	public int greater() {
		int maior=0;
		for(int i = 0; i< this.valorA.length; i++){
			   if (maior < this.valorA[i]) {
				   maior = Math.max(maior, this.valorA[i]);
			   }  		    	    	
			}
		return maior;
	}

	public int lower() {

		int menor=1;
		for(int i = 0; i< this.valorA.length; i++){
		   if (menor < this.valorA[i]) {
			   menor = Math.min(menor, this.valorA[i]);
		   }  		    	    	
		}
		return menor;
	}

}
