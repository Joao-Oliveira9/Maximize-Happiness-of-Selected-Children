import java.util.Arrays;
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

        //ordenar o array
        Arrays.sort(happiness);

        int n = happiness.length;
        int ultimaSelecionada = n - k;

        long valorInicialSub = k * -1 + 1;
        
        long valorSum = 0;
        
        long sum = 0;
        
     

        for(int i = ultimaSelecionada;i<n;i++)
        {
  	
        	
        	
        	valorSum = happiness[i] + valorInicialSub;
        	if(valorSum<0)
        	{
        		valorSum = 0;
        	}
            sum = sum + valorSum;
            valorInicialSub = valorInicialSub + 1;
        }
        
        return sum;
    }
}