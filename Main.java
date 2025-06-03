
public class Main{
    public static void main(String args[]){
    Integer i = 10 ;
    Integer j = 20 ;
    
    int a = i ;
    int b = j ;
    
    System.out.println(a == b) ;  // unboxing 
    
    System.out.println(i.equals(j)) ;   // without unboxing
    //equals()
    
    System.out.println(i) ;
    System.out.println(i.hashCode()) ;
    System.out.println(System.identityHashCode(i)) ;
    //HASHCODE
    
    System.out.println(i.getClass().toString()) ; // explicit
    System.out.println(i.getClass()) ; // implicit 
    // Provide Fully Qualified Class Names
    
    System.out.println(i.getClass().getName()) ;
    
    
    System.out.println(Integer.toBinaryString(i));
    System.out.println(i.toBinaryString(i));
    //System.out.println(i.toHexadecimalString(i));
    
    float y = i.floatValue() ;
    System.out.println(y);
    
    
    Character c1 = Character.valueOf((char) 65) ;
    Character c2 = Character.valueOf('A') ;
    System.out.println(c1 == c2) ;
    
    Character c11 = Character.valueOf((char) 128) ;
    Character c22 = Character.valueOf((char) 128) ;
    System.out.println(c11 == c22) ;
    
    Boolean c111 = Boolean.valueOf(true) ;
    Boolean c222 = Boolean.valueOf(true) ;
    System.out.println(c111 == c222) ; 
    
    Character.isLetter('s');
    
    }
    
}

