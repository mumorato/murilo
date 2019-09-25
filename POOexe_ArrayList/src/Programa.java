
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        
//    ArrayList listaCoisas = new ArrayList();
//    listaCoisas.add("IFPR");
//    listaCoisas.add(2019);
//    listaCoisas.add(false);
//    System.out.println(listaCoisas.size());
//    
//    for (int i = 0; i < listaCoisas.size(); i++) {
//        System.out.println(listaCoisas.get(i));    
//    }
    
    ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno alunoMario = new Aluno("Mario", 24);
        Aluno alunoLuana = new Aluno("Luana", 21);
        Aluno alunoCarlos = new Aluno("Carlos", 34);
        Aluno alunoMaria = new Aluno("Maria", 41);
    // Adcicionar objetos ao Array. (nomeArray.add(nomeObjeto);)
        alunos.add(alunoMario);
        alunos.add(alunoLuana);
        alunos.add(alunoCarlos);
        alunos.add(alunoMaria);
    //Laço: for (Classe Var : nomeArray);    
    for (Aluno vlaluno : alunos){       
        System.out.println(vlaluno.getNome());
        System.out.println(vlaluno.getIdade());
        
        }
    }   
}
    

