class UptoN 
{ 
    static int i = 1; 
  
    public static void main(String[] args)  
    { 
  
        if (i <= 100) 
        { 
            System.out.printf("%d ", i++); 
            main(null); 
        } 
    } 
} 