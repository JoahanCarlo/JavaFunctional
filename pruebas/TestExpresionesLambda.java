package com.expresiones.lambda.pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author JOAHAN CARLO
 */
public class TestExpresionesLambda {
    public static void main(String[] args) {
       /* for(Integer num : Arrays.asList(1,2,3,4,5,6,7,8,9,10)){
            System.out.println(num + "");
    }*/
        /*imprimir una lista utilizando expresiones lambda*/
//        Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
//                n -> System.out.println(n + " ")
//        );
        
//        Arrays.asList("A","B","C","D","E").forEach(System.out::println);
        
//        ArrayList<Integer> menorLista = new ArrayList<>();
//        //Filtra los números mayores que 5 y añadirlos a la lista menor
//        for(Integer num : Arrays.asList(1,2,3,4,5,6,7,8,9,10)){
//            if(num>5){
//                menorLista.add(num);
//            }
//        }
//        for(Integer val: menorLista){
//            System.out.println(val);
//        }
        //Stream: un flujo de elementos
        ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays.asList(1,2,3,4,5,6,7,8,9,10).
                stream().
                //Filtro para obtener los números mayores a 5
                filter(x -> x > 5)
                //pone los elementos que se filtro dentro de una lista, dentro utilizamos una expresion lambda
                .collect(Collectors.toList());
        
        mayores.forEach(e -> System.out.println(e));
    }
}
