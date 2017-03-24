package pachet;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start, end;
		int numarNoduri, numarMuchii;
		int count = 1;
		
		Scanner reader = new Scanner(System.in);
		
		try {
			
			System.out.println("Introduceti numarul de noduri: ");
			numarNoduri = reader.nextInt();
			System.out.println("Introduceti numarul de muchii: ");
			numarMuchii = reader.nextInt();
			
			Graph graf = new Graph(numarNoduri);
			
			System.out.println("Introduceti muchiile: (start,end)");
			while (count<= numarMuchii){
				start = reader.nextInt();
				end = reader.nextInt();
				graf.setMuchie(start, end);
				count++;
			}
			
			System.out.println("Lista de adiacenta: ");
			for (int i = 1; i <= numarNoduri; i++){
				System.out.print(i + "->");
				List<Integer> listaDeMuchii = graf.getMuchie(i);
				for (int j=1; ;j++){
					if (j != listaDeMuchii.size()){
						System.out.print(listaDeMuchii.get(j-1) + "->");
					}else {
						System.out.print(listaDeMuchii.get(j-1));
						break;
					}
				}
				System.out.println();
			}
			
			System.out.println("Introduceti o noua muchie: (start,end)");
			while (count<= numarMuchii + 1){
				start = reader.nextInt();
				end = reader.nextInt();
				graf.addMuchie(start, end);
				count++;
			}
			
			System.out.println("Lista de adiacenta dupa ce a fost adaugata o muchie: ");
			for (int i = 1; i <= numarNoduri; i++){
				System.out.print(i + "->");
				List<Integer> listaDeMuchiiAdaugate = graf.getMuchie(i);
				for (int j=1; ;j++){
					if (j != listaDeMuchiiAdaugate.size()){
						System.out.print(listaDeMuchiiAdaugate.get(j-1) + "->");
					}else {
						System.out.print(listaDeMuchiiAdaugate.get(j-1));
						break;
					}
				}
				System.out.println();
			}
			
			int nodNou;
			System.out.println("Introduceti un alt nod: ");
			nodNou = reader.nextInt();
			numarNoduri++;
			
			
			
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		reader.close();
	}
}
