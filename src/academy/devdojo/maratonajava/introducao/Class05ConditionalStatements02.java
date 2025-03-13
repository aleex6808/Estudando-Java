package academy.devdojo.maratonajava.introducao;

public class Class05ConditionalStatement02 {
    public static void main(String[] args) {
        // idade < 15 categoria juvenil
        // idade >= 15 && idade <18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 12;
        String categoria;

//        if (idade < 15) {
//            categoria = "Categoria Infantil";
//        } else if(idade >15 && idade < 18) {
//            categoria = "Categoria Juvenil";
//        } else {
//            categoria = "Categoria Adulto";
//        }
        categoria = idade < 15 ? "Categoria Infantil" : idade >15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto"; //jeito sem sentido de fazer, utilizando operador ternário
        System.out.println(categoria);
    }
}
