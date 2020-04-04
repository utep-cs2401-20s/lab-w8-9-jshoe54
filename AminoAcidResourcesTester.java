import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
class AminoAcidResourcesTester{
  @Test
  public void allCodons(){
    System.out.print("hello");
    char[] rna = {'A','C','U','G'};
    char[] aa = {'A','C','D','E','F','G','H','I','K','L','M','N','P','Q','R','S','T','V','W'};
    for(int i=0; i<4; i++){
      for(int j=0; j<4; j++){
        for(int k=0; k<4;k++){
          String s = new String(new char[]{rna[i],rna[j],rna[k]});
          char aaOut = AminoAcidResources.getAminoAcidFromCodon(s);
          if(aaOut != '*'){
            String[] codonList = AminoAcidResources.getCodonListForAminoAcid(aaOut);
            boolean found = false;
            for(int l=0; l<codonList.length; l++){
              found |= (codonList[l].equals(s));
            }
            if(!found) System.err.println("Codon " + s + " not found, said AA was " + aaOut);
          }

          aaOut = AminoAcidResources.getAminoAcidFromCodon(s.toLowerCase());
          if(aaOut != '*'){
            String[] codonList = AminoAcidResources.getCodonListForAminoAcid(aaOut);
            boolean found = false;
            for(int l=0; l<codonList.length; l++){
              found |= (codonList[l].equals(s));
            }
            if(!found) System.err.println("Codon " + s + " not found, said AA was " + aaOut);
          }
        }
      }
    }
  }
  @Test
  public void allAAs(){
    System.out.print("hello");
    char[] aa = {'A','C','D','E','F','G','H','I','K','L','M','N','P','Q','R','S','T','V','W'};
    for(int i=0; i<aa.length; i++){
      String[] codonList = AminoAcidResources.getCodonListForAminoAcid(aa[i]);
      for(int l=0; l<codonList.length; l++){
        if(aa[i] != AminoAcidResources.getAminoAcidFromCodon(codonList[l])){
          System.err.println("AA " + aa[i] + " not found, said codon was " + codonList[l]);
        }
      }
      codonList = AminoAcidResources.getCodonListForAminoAcid(Character.toLowerCase(aa[i]));
      for(int l=0; l<codonList.length; l++){
        if(aa[i] != AminoAcidResources.getAminoAcidFromCodon(codonList[l])){
          System.err.println("AA " + aa[i] + " not found, said codon was " + codonList[l]);
        }
      }
    }
  }
    @Test
    public void AminoAcidLLTest01(){
      System.out.print("hello");
      //Crete from RNA sequence test for regular performance
      //Expected codon sequence: "GAEFCHDILMNPQRVWST"
      String expected = "GAEFCHDILMNPQRVWST";
      AminoAcidLL thing = AminoAcidLL.createFromRNASequence("GGGGCCGAGUUCUGCCACGACAUACUCAUGAACCCCCAGCGUGUGUGGAGCACGUAG");
      for (int i = 0; i < expected.length(); i++) {
        assertEquals(expected.charAt(i), thing.aminoAcid);
        thing =thing.next;
      }
    }
    @Test
    public void AminoAcidLLTest02(){
      System.out.print("hello");
      //Test for isSorted when the list is not sorted
      //expected: false
      //Codon sequence : "GAEFCHDILMNPQRVWST"
      AminoAcidLL thing = AminoAcidLL.createFromRNASequence("GGGGCCGAGUUCUGCCACGACAUACUCAUGAACCCCCAGCGUGUGUGGAGCACGUAG");
      assertEquals(false, thing.isSorted());
    }
    @Test
    public void AminoAcidLLTest03(){
      System.out.print("hello");
      //Test for isSorted when the list is sorted
      //expected: true
      //Codon sequence : "STV"
      AminoAcidLL thing = AminoAcidLL.createFromRNASequence("ACGUAGUGG");
      assertEquals(true, thing.isSorted());
    }
    @Test
    public void AminoAcidLLTest04(){
      System.out.print("hello");
    //Test for sort with help of isSorted()
      //expected: true
      //Codon sequence before sort: "GAEFCHDILMNPQRVWST"
      AminoAcidLL thing = AminoAcidLL.createFromRNASequence("GGGGCCGAGUUCUGCCACGACAUACUCAUGAACCCCCAGCGUGUGUGGAGCACGUAG");
      thing = AminoAcidLL.sort(thing);
      assertEquals(true, thing.isSorted());
    }
    @Test
    public void AminoAcidLLTest05(){
      System.out.print("hello");
      //Test for aminoAcidList regular performance test
      char[] expected = {'G','A','E','F','C','H','D','I','L','M','N','P','Q','R','V','W','S','T'};
      AminoAcidLL thing = AminoAcidLL.createFromRNASequence("GGGGCCGAGUUCUGCCACGACAUACUCAUGAACCCCCAGCGUGUGUGGAGCACGUAG");
      assertArrayEquals(expected, thing.aminoAcidList());
    }
    @Test
    public void AminoAcidLLTest06(){
      System.out.print("hello");
      //Test for aminoAcidCounts regular performance test
      //RNA sequence GGGEEA: 3 G's, 2 E's, 1 A
      //expected output array = {3, 2, 1}
      int[] expected = {3, 2, 1};
      String testSequence = "GGAGGAGGAGAAGAAGCUUAG";
      AminoAcidLL thing = AminoAcidLL.createFromRNASequence(testSequence);
      assertArrayEquals(expected, thing.aminoAcidCounts());
    }
    @Test
    public void AminoAcidLLTest07(){
      System.out.print("hello");
      //Test for aminoAcidCompare, regular performance test
      //Test list1 = AAATTCDD
      //Test list2 = GGGAAATTD
      //Expected difference: 5
      AminoAcidLL list1 = AminoAcidLL.createFromRNASequence("GAGGAGGAGACCACCUGCGACGACUAG");
      AminoAcidLL list2 = AminoAcidLL.createFromRNASequence("GGUGGUGGUGAGGAGGAGACCACCGACUAG");
      list1 = AminoAcidLL.sort(list1);
      list2 = AminoAcidLL.sort(list2);
      assertEquals(5, list1.aminoAcidCompare(list2));
    }
    @Test
    public void AminoAcidLLTest08(){
      System.out.print("hello");
      //Test for aminoAcidCompare, different amino acids
      //Test list1 = GEAV
      //Test list2 = GGGAAATTD
      //Expected difference: 9
      AminoAcidLL list1 = AminoAcidLL.createFromRNASequence("GGGGAGGCGGUGUGA");
      AminoAcidLL list2 = AminoAcidLL.createFromRNASequence("GGUGGUGGUGAGGAGGAGACCACCGACUAG");
      list1 = AminoAcidLL.sort(list1);
      list2 = AminoAcidLL.sort(list2);
      assertEquals(9, list1.aminoAcidCompare(list2));
    }
    @Test
    public void AminoAcidLLTest09(){
      System.out.print("hello");
      //Test for aminoAcidCompare with an empty list, edge case test
      //Test list2 = nothing
      //Test list1 = GGGAAATTD
      //Expected difference: 9
      AminoAcidLL list2 = AminoAcidLL.createFromRNASequence("UAG");
      AminoAcidLL list1 = AminoAcidLL.createFromRNASequence("GGUGGUGGUGAGGAGGAGACCACCGACUAG");
      list1 = AminoAcidLL.sort(list1);
      list2 = AminoAcidLL.sort(list2);
      assertEquals(9, list1.aminoAcidCompare(list2));
    }
    @Test
    public void AminoAcidLLTest10(){
      System.out.print("hello");
      //Test for codonCompare, where they have the same aminoacids
      //Test list1 =  "GEAA"
      //Test list2 =  "GGEAA"
      //Did not repeat any codons
      AminoAcidLL list1 = AminoAcidLL.createFromRNASequence("GGGGAGGCCGCUUAG");
      AminoAcidLL list2 = AminoAcidLL.createFromRNASequence("GGAGGCGAAGCGGCAUAG");
      list1 = AminoAcidLL.sort(list1);
      list2 = AminoAcidLL.sort(list2);
      assertEquals(9, list1.codonCompare(list2));
    }
}