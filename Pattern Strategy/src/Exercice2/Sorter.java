package Exercice2;


public class Sorter {
    
    /**
	 * @uml.property  name="sortmethod"
	 * @uml.associationEnd  
	 */
    private SortBehavior sortmethod = null;
    
    public void setSortBehavior(SortBehavior sortmethod) {
        this.sortmethod = sortmethod;
    }
    
    public void sort(int[] vector) {
        this.sortmethod.sort(vector);
    }
    
    public void showVectorData(int[] vector) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<vector.length; i++) {
            sb.append(vector[i] + "\t");
        }
        
        System.out.println(sb.toString());
    }
}

