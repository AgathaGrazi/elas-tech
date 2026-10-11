package org.example.aula11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hmap {
    static void main() {
        //

    HashMap<String, Integer> idades = new HashMap<>();
    idades.put("Ana", 37);
    idades.put("Carlos", 30);
    System.out.println(idades.get("Ana"));
    System.out.println(idades.containsKey("Ana"));
    System.out.println(idades.getOrDefault("bi", Integer.valueOf("Valor invalido")));
    System.out.println(idades.keySet());
    System.out.println(idades.values());

        ArrayList<String> lista = new ArrayList<>();
        HashMap<String, ArrayList> id = new HashMap<>();
        id.put("548965", lista);
        lista.add("senha de banco");
        System.out.println(id.get(548965));



}}

/* o primeiro é a chave e o segundo item é o valor
put(key, value);
get(); - mostra a posição, ou o valor da chave
 * getOrDefault(); - passar uma msg caso solicitar um valor que não está no código
 * KeySet(); - Irá passar todas as chaves
 * values(); - vai passar todos os valores
 * containsKey(); - vai validar se tem a chave
  * containsValue(); - vai validar se tem o valor
  remove();
  size();
  isEmputy();
 * putAll(Map.of()) - cadastrar vários valores*/