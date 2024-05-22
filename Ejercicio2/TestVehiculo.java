/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expresiones.lambda.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author JOAHAN CARLO
 */
public class TestVehiculo {
    public static void main(String[] args) {
        List<Vehiculo> vehiculo = new ArrayList<>();
        vehiculo.add(new Vehiculo(1,"111AAA", Modelo.AUDI, 10000));
        vehiculo.add(new Vehiculo(2,"222BBB", Modelo.BMW, 2000));
        vehiculo.add(new Vehiculo(3,"333CCC", Modelo.CITROEN, 30000));
        vehiculo.add(new Vehiculo(4,"444DDD", Modelo.HONDA, 45000));
        vehiculo.add(new Vehiculo(5,"555EEE", Modelo.OPEL, 50000));
        vehiculo.add(new Vehiculo(6,"666FFF", Modelo.AUDI, 65000));
        vehiculo.add(new Vehiculo(7,"777GGG", Modelo.CITROEN, 75000));
        vehiculo.add(new Vehiculo(8,"888HHH", Modelo.HONDA, 85000));
        vehiculo.add(new Vehiculo(9,"999III", Modelo.BMW, 90000));
        vehiculo.add(new Vehiculo(10,"101JJJ", Modelo.HONDA, 25000));
        vehiculo.add(new Vehiculo(11,"102KKK", Modelo.CITROEN, 15000));
        
        System.out.println("Lista de Kilometros multiplicados por 2 ");
        System.out.println("--------------------------------------");
        List<Integer> resultado = vehiculo.stream()
                .map(v->v.getKm()*2)
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        
        System.out.println("Lista de Kilometros de los vehiculos ");
        System.out.println("--------------------------------------");
        List<Integer> resultado_km = vehiculo.stream().map(v->v.getKm()).collect(Collectors.toList());
        resultado_km.forEach(System.out::println);
        
        System.out.println("Lista de vehiculos solo con la marca AUDI");
        System.out.println("--------------------------------------");
        List<Vehiculo> marca = vehiculo.stream().filter(v->v.getModelo().equals(Modelo.AUDI)).collect(Collectors.toList());
        marca.forEach(System.out::println);
        
        System.out.println("Ordenar los vehiculos por la cantidad de kilometros");
        System.out.println("--------------------------------------");
        List<Vehiculo> resultado_km_orden = vehiculo.stream().sorted((v1,v2)->Integer.compare(v1.getKm(),v2.getKm()))
                .collect(Collectors.toList());
        resultado_km_orden.forEach(System.out::println);
        System.out.println(" ");
        
        System.out.println("Listar todos los modelos sin que se repitan");
        System.out.println("--------------------------------------");
        List<Modelo> sin_repetir = vehiculo.stream().
                map(Vehiculo::getModelo).distinct().
                collect(Collectors.toList());
        sin_repetir.forEach(System.out::println);
        System.out.println(" ");
        
        System.out.println("Listar de los vehiculos con mas de 2000 km e imprimir el objeto");
        System.out.println("--------------------------------------");
        List<String> resultado_v = vehiculo.stream().filter(v->v.getKm()>2000)
                .peek(v->System.out.println(v))
                .map(Vehiculo::getMatricula)
                .peek(v->System.out.println(v)).collect(Collectors.toList());
        resultado_v.forEach(System.out::println);
        System.out.println(" ");
        
        System.out.println("Vehiculos agrupados pro modelo");
        System.out.println("--------------------------------------");
        Map<Modelo, List<Vehiculo>> grupo_modelo = vehiculo.stream().collect(Collectors.groupingBy(Vehiculo::getModelo));
        grupo_modelo.forEach((K,V)->{
            System.out.println(" ");
            System.out.println("Modelo : " +K);
            V.forEach(System.out::println);
        });
        System.out.println(" ");
        
        System.out.println("Suma de todos los kilometros de todos los vehiculos");
        System.out.println("--------------------------------------");
        Integer suma_tot = vehiculo.stream().map(v->v.getKm()).reduce(0,Integer::sum);
        System.out.println(suma_tot);
        
        
        System.out.println("Listado de 2 vehiculos con kilometros menores o iguales a 10000");
        System.out.println("--------------------------------------");
        vehiculo.stream().filter(v->v.getKm()<=10000).map(Vehiculo::getKm).distinct().limit(2).forEach(System.out::println);
        System.out.println(" ");
        
    }
}
