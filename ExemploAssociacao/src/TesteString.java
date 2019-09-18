
public class TesteString {
    
    public static void main(String[] args) {
        String texto1 = "Roberto";
        String texto2 = "Roberto";
        
//       if (texto1 == texto2){         JEITO ERRADO DE COMPARAR STRINGS
         if (texto1.equals(texto2)){
           System.out.println("iguais");
       }else{
           System.out.println("diferentes");
       }
    }
    
    
}
