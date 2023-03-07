import javax.swing.JOptionPane;

public class exercicio_media {
    public static void main(String[]args){
    
        
        String nome;
        
        nome = JOptionPane.showInputDialog("Digite seu nome:: ");
        //chamando os metodos
        double nota1 = LerNota();
        double nota2 = LerNota();
        double media = calcular(nota1,nota2);
        
            if(media >= 7){
                 JOptionPane.showMessageDialog(null, nome+" você foi aprovado! Parabéns!!!");
            }
            else{
             JOptionPane.showMessageDialog(null, nome+ " infelizmente, você reprovado! Tente novamente, mais tarde!");
            }
        
        // retorno do metodo calcularmedia
        
     
    } //fim  do main 
    
    static double LerNota(){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:: "));
        
        return n1;
    }
    
    static double calcular( double n1, double n2){
      //retorno do media
        return (n1+n2)/2;
    }
}
