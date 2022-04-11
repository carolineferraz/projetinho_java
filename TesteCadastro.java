import java.util.Scanner;

public class TesteCadastro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		OpCarne carne = new OpCarne();
		OpAcompanhamento acompanhamento = new OpAcompanhamento();
		OpSuco suco = new OpSuco();
		
		CadOpiniaoMenu CadOpiniaoMenu = null;
		
		// vamos considerar aqui que são apenas 3 alunos na escola...
		
		int[] aluno = new int [3];
		int x=0,num=0,excelente = 0, bom = 0, razoavel = 0, ruim = 0, pessimo = 0;
		
//		for(x=0;x<3;x++)
//		{
			CadOpiniaoMenu = carne;
			System.out.println(carne.getItemMenu());
			System.out.println("Qual a sua nota para o SABOR?");
			System.out.println("1. Péssimo" + "\n2. Ruim" + "\n3. Razoável " 
						+ "\n4. Bom"+"\n5. Excelente");
			System.out.println("Escolha uma opção: ");
			int notaSabor= leia.nextInt();
				
			while(notaSabor<1 || notaSabor>5)
			{
				System.out.println("\nVocê não digitou um código válido. Digite uma opção novamente: ");
				notaSabor = leia.nextInt();
			}
			switch (notaSabor) 
				{
				case 1:
					pessimo++; 
				break;
				case 2: 
					ruim++;
				break;
				case 3:
					razoavel++;
				break;
				case 4:
					bom++;
				break;
				case 5: 
					excelente++;
				break;
			}
			
			System.out.println(carne.getItemMenu());
			System.out.println("Qual a sua nota para a HIGIENE?");
			System.out.println("1. Péssimo" + "\n2. Ruim" + "\n3. Razoável " 
						+ "\n4. Bom"+"\n5. Excelente");
			System.out.println("Escolha uma opção: ");
			int notaHigiene = leia.nextInt();
				
			while(notaHigiene<1 || notaHigiene>5)
			{
				System.out.println("\nVocê não digitou um código válido. Digite uma opção novamente: ");
				notaHigiene = leia.nextInt();
			}
			switch (notaHigiene) 
				{
				case 1:
					pessimo++; 
				break;
				case 2: 
					ruim++;
				break;
				case 3:
					razoavel++;
				break;
				case 4:
					bom++;
				break;
				case 5: 
					excelente++;
				break;
			}
			
			System.out.println(carne.getItemMenu());
			System.out.println("Qual a sua nota para a VARIEDADE?");
			System.out.println("1. Péssimo" + "\n2. Ruim" + "\n3. Razoável " 
						+ "\n4. Bom"+"\n5. Excelente");
			System.out.println("Escolha uma opção: ");
			int notaVariedade = leia.nextInt();
				
			while(notaVariedade<1 || notaVariedade>5)
			{
				System.out.println("\nVocê não digitou um código válido. Digite uma opção novamente: ");
				notaVariedade = leia.nextInt();
			}
			switch (notaVariedade) 
				{
				case 1:
					pessimo++; 
				break;
				case 2: 
					ruim++;
				break;
				case 3:
					razoavel++;
				break;
				case 4:
					bom++;
				break;
				case 5: 
					excelente++;
				break;
			}
			
		carne.Sabor(notaSabor);
		carne.Higiene(notaHigiene);
		carne.Variedade(notaVariedade);
		
		System.out.println("*************");
		
		CadOpiniaoMenu = acompanhamento;
		System.out.println(acompanhamento.getItemMenu());
		System.out.println("Qual a sua nota para o SABOR?");
		System.out.println("1. Péssimo" + "\n2. Ruim" + "\n3. Razoável " 
					+ "\n4. Bom"+"\n5. Excelente");
		System.out.println("Escolha uma opção: ");
		notaSabor = leia.nextInt();
			
		while(notaSabor<1 || notaSabor>5)
		{
			System.out.println("\nVocê não digitou um código válido. Digite uma opção novamente: ");
			notaSabor = leia.nextInt();
		}
		switch (notaSabor) 
			{
			case 1:
				pessimo++; 
			break;
			case 2: 
				ruim++;
			break;
			case 3:
				razoavel++;
			break;
			case 4:
				bom++;
			break;
			case 5: 
				excelente++;
			break;
		}
			
			
//		}	

	}

}
