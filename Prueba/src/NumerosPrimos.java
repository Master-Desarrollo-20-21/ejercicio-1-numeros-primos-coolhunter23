
public class NumerosPrimos 
{

	public static void main(String[] args) 
	{
		System.out.printf("La suma de los números primos que hay entre los 50 primeros números: %d\n", SumaNumerosPrimosHastaValor(50));
		System.out.printf("La suma de los 50 primeros números primos: %d ", SumaNPrimerosNumerosPrimos(50));		
	}

	public static int SumaNumerosPrimosHastaValor (int valor)
	{
		int suma = 0;
		
		for (int i=1 ; i <= valor ; i++)
		{
			if (EsNumeroPrimo(i))
				suma += i;		  
		}
		
		return suma;
	}
	
	
	public static int SumaNPrimerosNumerosPrimos (int cantidad)
	{
		int nNumeroPrimo = 0;
		int num = 1;
		int suma = 0;
		
		while (nNumeroPrimo < cantidad)
		{
			if (EsNumeroPrimo(num))
			{
				nNumeroPrimo++;
				suma += num;
			}
			
			num++;
		}

		return suma;
	}
	
	public static boolean EsNumeroPrimo(int numero)
	{
		
        for (int i = 2; i < numero; i++) 
        {
            if (numero % i == 0) 
            	return false;
        }
        
        return true;
	}

}
