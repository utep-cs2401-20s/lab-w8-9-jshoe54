class AminoAcidLL{
  AminoAcidResources converter = new AminoAcidResources();
  char aminoAcid;
  String[] codons;
  int[] counts = c;
  AminoAcidLL next;

  AminoAcidLL(){

  }


  /********************************************************************************************/
  /* Creates a new node, with a given amino acid/codon 
   * pair and increments the codon counter for that codon.
   * NOTE: Does not check for repeats!! */
  AminoAcidLL(String inCodon){
	  if(converter.getAminoAcidFromCodon(inCodon)=='G') {
		  this.aminoAcid='G';
		  String [] gcodons= {"GGG","GGA","GGC","GGU"};
		  this.codons=gcodons;
		  	if(inCodon.contentEquals("GGG")) {
		  		int [] ggg= {1,0,0,0};
		  		this.counts=ggg;
		  	}
		  	if(inCodon.contentEquals("GGA")) {
		  		int [] gga= {0,1,0,0};
		  		this.counts=gga;
		  	}
		  	if(inCodon.contentEquals("GGC")) {
		  		int [] ggc= {0,0,1,0};
		  		this.counts=ggc;
		  	}
		  	if(inCodon.contentEquals("GGU")) {
		  		int [] ggu= {0,0,0,1};
		  		this.counts=ggu;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='E') {
		  this.aminoAcid='E';
		  String [] ecodons= {"GAG","GAA"};
		  this.codons=ecodons;
		  	if(inCodon.contentEquals("GAG")) {
		  		int [] gag= {1,0};
		  		this.counts=gag;
		  	}
		  	if(inCodon.contentEquals("GAA")) {
		  		int [] gaa= {0,1};
		  		this.counts=gaa;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='D') {
		  this.aminoAcid='D';
		  String [] dcodons= {"GAC","GAU"};
		  this.codons=dcodons;
		  	if(inCodon.contentEquals("GGA")) {
		  		int [] gac= {1,0};
		  		this.counts=gac;
		  	}
		  	if(inCodon.contentEquals("GAU")) {
		  		int [] gau= {0,1};
		  		this.counts=gau;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='A') {
		  this.aminoAcid='A';
		  String [] acodons= {"GCG","GCA","GCC","GCU"};
		  this.codons=acodons;
		  	if(inCodon.contentEquals("GCG")) {
		  		int [] gcg= {1,0,0,0};
		  		this.counts=gcg;
		  	}
		  	if(inCodon.contentEquals("GCA")) {
		  		int [] gca= {0,1,0,0};
		  		this.counts=gca;
		  	}
		  	if(inCodon.contentEquals("GCC")) {
		  		int [] gcc= {0,0,1,0};
		  		this.counts=gcc;
		  	}
		  	if(inCodon.contentEquals("GCU")) {
		  		int [] gcu= {0,0,0,1};
		  		this.counts=gcu;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='V') {
		  this.aminoAcid='V';
		  String [] vcodons= {"GUG","GUA","GUC","GUU"};
		  this.codons=vcodons;
		  	if(inCodon.contentEquals("GUG")) {
		  		int [] gug= {1,0,0,0};
		  		this.counts=gug;
		  	}
		  	if(inCodon.contentEquals("GUA")) {
		  		int [] gua= {0,1,0,0};
		  		this.counts=gua;
		  	}
		  	if(inCodon.contentEquals("GUC")) {
		  		int [] guc= {0,0,1,0};
		  		this.counts=guc;
		  	}
		  	if(inCodon.contentEquals("GUU")) {
		  		int [] guu= {0,0,0,1};
		  		this.counts=guu;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='R') {
		  this.aminoAcid='R';
		  String [] rcodons= {"AGG","AGA","CGG","CGA","CGC","CGU"};
		  this.codons=rcodons;
		  	if(inCodon.contentEquals("AGG")) {
		  		int [] agg= {1,0,0,0,0,0};
		  		this.counts=agg;
		  	}
		  	if(inCodon.contentEquals("AGA")) {
		  		int [] aga= {0,1,0,0,0,0};
		  		this.counts=aga;
		  	}
		  	if(inCodon.contentEquals("CGG")) {
		  		int [] cgg= {0,0,1,0,0,0};
		  		this.counts=cgg;		  		
		  	}
		  	if(inCodon.contentEquals("CGA")) {
		  		int [] cga= {0,0,0,1,0,0};
		  		this.counts=cga;
		  	}
		  	if(inCodon.contentEquals("CGC")) {
		  		int [] cgc= {0,0,0,0,1,0};
		  		this.counts=cgc;
		  	}
		  	if(inCodon.contentEquals("CGU")) {
		  		int [] cgu= {0,0,0,0,0,1};
		  		this.counts=cgu;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='S') {
		  this.aminoAcid='S';
		  String [] scodons= {"AGC","AGU","UCG","UCA","UCC","UCU"};
		  this.codons=scodons;
		  	if(inCodon.contentEquals("AGC")) {
		  		int [] agc= {1,0,0,0,0,0};
		  		this.counts=agc;
		  	}
		  	if(inCodon.contentEquals("AGU")) {
		  		int [] agu= {0,1,0,0,0,0};
		  		this.counts=agu;
		  	}
		  	if(inCodon.contentEquals("UCG")) {
		  		int [] ucg= {0,0,1,0,0,0};
		  		this.counts=ucg;
		  	}
		  	if(inCodon.contentEquals("UCA")) {
		  		int [] uca= {0,0,0,1,0,0};
		  		this.counts=uca;
		  	}
		  	if(inCodon.contentEquals("UCC")) {
		  		int [] ucc= {0,0,0,0,1,0};
		  		this.counts=ucc;
		  	}
		  	if(inCodon.contentEquals("UGU")) {
		  		int [] ugu= {0,0,0,0,0,1};
		  		this.counts=ugu;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='K') {
		  this.aminoAcid='K';
		  String [] kcodons= {"AAG","AAA"};
		  this.codons=kcodons;
		  	if(inCodon.contentEquals("AAG")) {
		  		int [] aag= {1,0};
		  		this.counts=aag;
		  	}
		  	if(inCodon.contentEquals("AAA")) {
		  		int [] aaa= {0,1};
		  		this.counts=aaa;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='N') {
		  this.aminoAcid='N';
		  String [] ncodons= {"AAC","AAU"};
		  this.codons=ncodons;
		  	if(inCodon.contentEquals("AAC")) {
		  		int [] aac= {1,0};
		  		this.counts=aac;
		  	}
		  	if(inCodon.contentEquals("AAU")) {
		  		int [] aau= {0,1};
		  		this.counts=aau;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='T') {
		  this.aminoAcid='T';
		  String [] tcodons= {"ACG","ACA","ACC","ACU","UAC","UAU"};
		  this.codons=tcodons;
		  	if(inCodon.contentEquals("ACG")) {
		  		int [] acg= {1,0,0,0,0,0};
		  		this.counts=acg;
		  	}
		  	if(inCodon.contentEquals("ACA")) {
		  		int [] aca= {0,1,0,0,0,0};
		  		this.counts=aca;
		  	}
		  	if(inCodon.contentEquals("ACC")) {
		  		int [] acc= {0,0,1,0,0,0};
		  		this.counts=acc;
		  	}
		  	if(inCodon.contentEquals("ACU")) {
		  		int [] acu= {0,0,0,1,0,0};
		  		this.counts=acu;
		  	}
		  	if(inCodon.contentEquals("UAC")) {
		  		int [] uac= {0,0,0,0,1,0};
		  		this.counts=uac;
		  	}
		  	if(inCodon.contentEquals("UAU")) {
		  		int [] uau= {0,0,0,0,0,1};
		  		this.counts=uau;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='M') {
		  this.aminoAcid='M';
		  String [] mcodons= {"AUG"};
		  this.codons=mcodons;
		  	if(inCodon.contentEquals("AUG")) {
		  		int [] aug= {1};
		  		this.counts=aug;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='I') {
		  this.aminoAcid='I';
		  String [] icodons= {"AUA","AUC","AUU"};
		  this.codons=icodons;
		  	if(inCodon.contentEquals("AUA")) {
		  		int [] aua= {1,0,0};
		  		this.counts=aua;
		  	}
		  	if(inCodon.contentEquals("AUC")) {
		  		int [] auc= {0,1,0};
		  		this.counts=auc;
		  	}
		  	if(inCodon.contentEquals("AUU")) {
		  		int [] auu= {0,0,1};
		  		this.counts=auu;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='Q') {
		  this.aminoAcid='Q';
		  String [] qcodons= {"CAG","CAA"};
		  this.codons=qcodons;
		  	if(inCodon.contentEquals("CAG")) {
		  		int [] cag= {1,0};
		  		this.counts=cag;
		  	}
		  	if(inCodon.contentEquals("CAA")) {
		  		int [] caa= {0,1};
		  		this.counts=caa;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='H') {
		  this.aminoAcid='H';
		  String [] hcodons= {"CAC","CAU"};
		  this.codons=hcodons;
		  	if(inCodon.contentEquals("CAC")) {
		  		int [] cac= {1,0};
		  		this.counts=cac;
		  	}
		  	if(inCodon.contentEquals("CAU")) {
		  		int [] cau= {0,1};
		  		this.counts=cau;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='P') {
		  this.aminoAcid='P';
		  String [] pcodons= {"CCG","CCA","CCC","CCU"};
		  this.codons=pcodons;
		  	if(inCodon.contentEquals("CCG")) {
		  		int [] ccg= {1,0,0,0};
		  		this.counts=ccg;
		  	}
		  	if(inCodon.contentEquals("CCA")) {
		  		int [] cca= {0,1,0,0};
		  		this.counts=cca;
		  	}
		  	if(inCodon.contentEquals("CCC")) {
		  		int [] ccc= {0,0,1,0};
		  		this.counts=ccc;
		  	}
		  	if(inCodon.contentEquals("CCU")) {
		  		int [] ccu= {0,0,0,1};
		  		this.counts=ccu;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='L') {
		  this.aminoAcid='L';
		  String [] lcodons= {"CUU","CUC","CUA","CUG","UUG","UUA"};
		  this.codons=lcodons;
		  if(inCodon.contentEquals("CUU")) {
		  		int [] cuu= {1,0,0,0,0,0};
		  		this.counts=cuu;
		  	}
		  if(inCodon.contentEquals("CUC")) {
		  		int [] cuc= {0,1,0,0,0,0};
		  		this.counts=cuc;
		  	}
		  if(inCodon.contentEquals("CUA")) {
		  		int [] cua= {0,0,1,0,0,0};
		  		this.counts=cua;
		  	}
		  if(inCodon.contentEquals("CUG")) {
		  		int [] cug= {0,0,0,1,0,0};
		  		this.counts=cug;
		  	}
		  if(inCodon.contentEquals("UUG")) {
		  		int [] uug= {0,0,0,0,1,0};
		  		this.counts=uug;
		  	}
		  if(inCodon.contentEquals("UUA")) {
		  		int [] uua= {0,0,0,0,0,1};
		  		this.counts=uua;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='W') {
		  this.aminoAcid='W';
		  String [] wcodons= {"UGG"};
		  this.codons=wcodons;
		  	if(inCodon.contentEquals("UGG")) {
		  		int [] ugg= {1};
		  		this.counts=ugg;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='C') {
		  this.aminoAcid='C';
		  String [] ccodons= {"UGC","UGU"};
		  this.codons=ccodons;
		  	if(inCodon.contentEquals("UGC")) {
		  		int [] ugc= {1,0};
		  		this.counts=ugc;
		  	}
		  	if(inCodon.contentEquals("UGU")) {
		  		int [] ugu= {0,1};
		  		this.counts=ugu;
		  	}
	  }
	  else if(converter.getAminoAcidFromCodon(inCodon)=='F') {
		  this.aminoAcid='F';  
		  String [] gcodons= {"UUC","UUU"};
		  this.codons=gcodons;
		  	if(inCodon.contentEquals("UUC")) {
		  		int [] uuc= {1,0};
		  		this.counts=uuc;
		  	}
		  	if(inCodon.contentEquals("UUU")) {
		  		int [] uuu= {0,1};
		  		this.counts=uuu;
		  	}
	  }
  }

  /********************************************************************************************/
  /* Recursive method that increments the count for a specific codon:
   * If it should be at this node, increments it and stops, 
   * if not passes the task to the next node. 
   * If there is no next node, add a new node to the list that would contain the codon. 
   */
  private void addCodon(String inCodon){
	  boolean found=false;
	  int index=0;
	  	while(!(found&&index<codons.length)) {
	  		if(codons[index].equals(inCodon)){
	  			found=true;
	  		}
	  		else {
	  			index++;
	  		}
	  	}
	  	if(!found) {
	  		if(next!=null) {
	  			addCodon(inCodon,next);
	  		}
	  		else {
	  			next=new AminoAcidLL(inCodon);
	  		}
	  	}
	  	else {
	  		counts[index]++;
	  	}
  }
  
  private void addCodon(String inCodon, AminoAcidLL node){
	  boolean found=false;
	  int index=0;
	  	while(!(found&&index<node.codons.length)) {
	  		if(node.codons[index].equals(inCodon)){
	  			found=true;
	  		}
	  		else {
	  			index++;
	  		}
	  	}
	  	if(!found) {
	  		if(node.next!=null) {
	  			addCodon(inCodon,node.next);
	  		}
	  		else {
	  			node.next=new AminoAcidLL(inCodon);
	  		}
	  	}
	  	else {
	  		node.counts[index]++;
	  	}
  }


  /********************************************************************************************/
  /* Shortcut to find the total number of instances of this amino acid */
  private int totalCount(){
    int total= 0;
    for(int i=0;i<counts.length;i++) {
    	total+=counts[i];
    }
	  return total;
  }

  /********************************************************************************************/
  /* helper method for finding the list difference on two matching nodes
  *  must be matching, but this is not tracked */
  private int totalDiff(AminoAcidLL inList){
    return Math.abs(totalCount() - inList.totalCount());
  }


  /********************************************************************************************/
  /* helper method for finding the list difference on two matching nodes
  *  must be matching, but this is not tracked */
  private int codonDiff(AminoAcidLL inList){
    int diff = 0;
    for(int i=0; i<codons.length; i++){
      diff += Math.abs(counts[i] - inList.counts[i]);
    }
    return diff;
  }

  /********************************************************************************************/
  /* Recursive method that finds the differences in **Amino Acid** counts. 
   * the list *must* be sorted to use this method */
  public int aminoAcidCompare(AminoAcidLL inList){//Javier Rubio and Issac Beltran helped me with this method
	  if(!inList.isSorted()){
	      return 0;
	    }
	    int diff = 0;
	    if(inList == null){
	      diff += totalCount();
	    }
	    if(next != null){
	      diff += next.aminoAcidCompare(inList);
	    }
	    else if(aminoAcid == inList.aminoAcid){
	      diff += totalDiff(inList);
	    }
	    if(next != null){
	      diff += aminoAcidCompare(inList.next);
	    }
	    if(next == null && inList.next != null){
	      diff += aminoAcidCompare(inList.next);
	    }
	    else if(next != null && aminoAcid < inList.aminoAcid){
	      diff += totalCount();
	      if(next != null){
	        diff += next.aminoAcidCompare(inList);
	      }
	      else if(next == null || aminoAcid > inList.aminoAcid){
	        diff += inList.totalCount();
	        if(inList.next != null){
	          diff += aminoAcidCompare(inList.next);
	        }
	      }
	    }
	    return diff;
	  }

  /********************************************************************************************/
  /* Same ad above, but counts the codon usage differences
   * Must be sorted. */
  public int codonCompare(AminoAcidLL inList){//Javier Rubio and Issac Beltran helped me with this method
	  if (inList.isSorted()) {
	      return 0;
	    }
	    int diff = 0;
	    if (inList == null) {
	      diff += totalCount();
	      next.codonCompare(inList);
	    }
	    if (next != null) {
	      diff += next.codonCompare(inList.next);
	    } else if (aminoAcid == inList.aminoAcid) {
	        diff += codonDiff(inList);

	      if (next != null) {
	        diff += next.codonCompare(inList.next);
	      }
	      if(next == null && inList.next != null){
	        diff += codonCompare(inList.next);
	      }
	      else if(next != null && aminoAcid < inList.aminoAcid){
	        diff += totalCount();
	        if(next != null){
	          diff += next.codonCompare(inList);
	        }
	        else if(next == null || aminoAcid > inList.aminoAcid){
	          diff += inList.totalCount();
	          if(inList.next != null){
	            diff += codonCompare(inList.next);
	          }
	        }
	      }
	    }
	    return diff;
	  }


  /********************************************************************************************/
  /* Recursively returns the total list of amino acids in the order that they are in in the linked list. */
  public char[] aminoAcidList(){//Javier Rubio and Issac Beltran helped me with this method
    if(next==null) {
	  return new char[]{aminoAcid};
    }
    char[] x = next.aminoAcidList();
    char[] y = new char[x.length+1];
    y[0]=aminoAcid;
    
    for(int i=1; i<y.length;i++) {
    	y[i]=x[i-1];
    }
    return y;
  }

  /********************************************************************************************/
  /* Recursively returns the total counts of amino acids in the order that they are in in the linked list. */
  public int[] aminoAcidCounts(){//Javier Rubio and Issac Beltran helped me with this method
    if(next==null) {
    	  return new int[]{};
    }
    else {
    	int[] n =next.aminoAcidCounts();
    	int[] c= new int[node.length+1];
    	
    for(int i=0;i<n.length;i++) {
    	c[0]=aminoAcid;
    	c[i+1] = n[i];
    }
    return aminoAcidCounts();
    }
  }


  /********************************************************************************************/
  /* recursively determines if a linked list is sorted or not */
  public boolean isSorted(){//Javier Rubio and Issac Beltran helped me with this method
	  if(next == null){
	      return true;
	    }
	    if(next.aminoAcid > aminoAcid){
	      return false;
	    }
	    return next.isSorted();
	  }

  /********************************************************************************************/
  /* Static method for generating a linked list from an RNA sequence */
  public static AminoAcidLL createFromRNASequence(String inSequence){//recieved help from Victor Vidales on this method
    AminoAcidLL list = null;
    	if(inSequanece.length()>=3&&AminoAcidResources.getAminoAcidFromCodon(inSequence.substring(0,2))!='*') {
    		list = new AminoAcidLL(inSequence.substring(0,3));
    		for(AminoAcidResources.getAminoAcidFromCodon(inSequence.substring(i,i+3))!='*') {
    			list.addCodon(inSequence.substring(i,i+3));
    		}
    		else {
    			break;
    		}
    	}
	  return list;
  }


  /********************************************************************************************/
  /* sorts a list by amino acid character*/
  public static AminoAcidLL sort(AminoAcidLL inList){//Javier Rubio and Issac Beltran helped me with this method
	   if(inList.isSorted()){
		      return inList;
		    }
		    else{
		      for(AminoAcidLL i = inList; i.next != null; i = i.next){
		        for(AminoAcidLL j = i.next; j.next != null; j = j.next){
		          if (i.aminoAcid > j.aminoAcid) {
		            AminoAcidLL temp = i;
		            j.next = i;
		            i = temp;
		          }
		        }
		      }
		    }
		    return inList;
		  }
		}