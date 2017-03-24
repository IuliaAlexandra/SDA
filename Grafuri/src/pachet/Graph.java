package pachet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
	
	private Map<Integer,List<Integer>> listaDeAdiacenta;
	
	public Graph(int noduri)
	{
		listaDeAdiacenta =  new HashMap<Integer,List<Integer>>();
		for (int i = 1; i <= noduri; i++){
			listaDeAdiacenta.put(i, new LinkedList<Integer>());
		}
	}
	
	public void setMuchie(int start, int end){
		
		if ((start > listaDeAdiacenta.size()) || (end > listaDeAdiacenta.size()) ){
			System.out.println("Nod incorect!");
			return;
		}
		
		List<Integer> startList = listaDeAdiacenta.get(start);
		startList.add(end);
		List<Integer> endList = listaDeAdiacenta.get(end);
		endList.add(start);
	}
	
	public List<Integer> getMuchie (int start){
		if (start>listaDeAdiacenta.size()){
			System.out.println("Nod incorect!");
			return null;
		}
		return listaDeAdiacenta.get(start);
	}
	
	public void addMuchie (int start, int end){
		
		List<Integer> startList = listaDeAdiacenta.get(start);
		startList.add(end);
		List<Integer> endList = listaDeAdiacenta.get(end);
		endList.add(start);
	}
}
