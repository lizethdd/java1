package metodosarraylist;
import java.util.*;

public class MetodosArrayList {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Métodos de Array List");
        //Clases envoltorio: Integer, Double, Boolean, Float 
     //   objetosInteger();
       // objetosString();
        objetosPersona();
    }
    public static void objetosPersona(){
        Persona p1=new Persona("456524E","Lopez","Sonia",4);
        Persona p2=new Persona("12387435D","Gomez","Luis",26);
        Persona p3=new Persona("45655524E","Sanchez","Carmen",31);
        Persona p4=new Persona("0258798G","Diaz","Susana",29);
        
        Persona p7=new Persona("45678923D","Kim","SoNoo",22);
        Persona p8=new Persona("45678923D","Park","Seoughn",27);
        Persona p9=new Persona("45678923D","Yang","Jungwon",24);
        ArrayList<Persona> persona1=new ArrayList<>();
        ArrayList<Persona> persona2=new ArrayList<>();
        persona1.add(p1);
        persona1.add(p9);
        persona1.add(p2);
       // persona1.add(p3);
                //VISUALIZAR ELEMENTOS DEL ARRAYLIST DE PERSONA1EN FILAS PARA ABAJO
        System.out.println("RECORRIDO HACIA DELANTE");
         for(int i=0;i<persona1.size();i++){
         System.out.println("\t"+persona1.get(i).toString());
    }System.out.println("");
    
    
        persona2.add(p4);
        persona2.add(p7);
        persona2.add(p8);
        persona2.add(p9);
               //VISUALIZAR ELEMENTOS DEL ARRAYLIST DE PERSONA1 EN COLUMNA PARA LA DER
        System.out.println("\t\t\t\t\t\t\tP2");
        System.out.print(persona2);

        persona1.addAll(persona2);
        System.out.println("");
              //VISUALIZAR ELEMENTOS DEL ARRAYLIST DE PERSONA1(7) FILAS PARA ABAJO
         System.out.println("POR COLECCION");
        for(Persona i: persona1){
             System.out.println("\t"+i);
        }System.out.println("");
        
         

       
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tSize all: ");
       //Size: Num de elementos de la colección
        System.out.println("Elementos de Persona1: "+persona1.size());
        System.out.println("Elementos de colList2: "+persona2.size());
           
        //clear: Vacía la colección
      // persona2.clear();
       // System.out.println(persona2);
       // System.out.println("\t\t\t\t\t\t\t\tisEmpty: ");
        //isEmpty si una colección no tiene o tiene elementos
       // System.out.println("Persona1 vacía: "+persona1.isEmpty());
        //System.out.println("Persona2 vacía: "+persona2.isEmpty());
        
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tContains: ");
        //Contains: saber si un objeto está contenido o no en una colección
        System.out.println("Persona1 contiene p3: "+persona1.contains(p3));
        
        System.out.println("");
        //Anadir elementos a la coleccion pero que no se dupliquen 
        if(persona1.contains(p3)){
            System.out.println("p3 ya esta en la coleccion");
        }else{
            System.out.println("p3 no esta en la coleccion");
            persona1.add(p3);
        }
        
        //Contains All: Si una colección esta dentro de otra
        System.out.println("Persona2 dentro de Persona1: "+persona1.containsAll(persona2));
        System.out.println("");
         //Distintas formas de recorrer el arrayList
        System.out.println("List Iterator hacia delante: ");
        ListIterator<Persona> ir2= persona1.listIterator();
        while(ir2.hasNext()){
            Persona var=ir2.next();
            System.out.println("\t"+var);
        }
        System.out.println("");
        
         System.out.println("\nList Iterator hacia atras: ");
        ir2= persona1.listIterator(persona1.size());//decir donde empieza
        while(ir2.hasPrevious()){
            Persona var=ir2.previous();
            System.out.println("\t"+var);
        }
        
       
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tRemove: ");
        //remove: Elimina el obejto entero, salvo que en Integer elimina la posición empezando en 0
        System.out.println("Eliminar p2: "+persona1.remove(p2));
        
        //Iterator visualiza o recorre array
        ir2= persona1.listIterator();
        while(ir2.hasNext()){
            Persona var=ir2.next();
            System.out.println("\t"+var);
        }
        System.out.println("");
        
        //removeAll: Elimina una colección de otra
      //persona1.removeAll(persona2);
        System.out.println(persona1);
        ir2= persona1.listIterator();
        while(ir2.hasNext()){
            Persona var=ir2.next();
            System.out.println("\t"+var);
        }
        
       
       System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tretainAll: ");
        //retainAll: Deja solo los elementos de la segunda colección
        persona1.retainAll(persona2);
        //System.out.println("Array List"+persona1);
        ir2= persona1.listIterator();
        while(ir2.hasNext()){
            Persona var=ir2.next();
            System.out.println("\t"+var);
        }     
         System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tObject toArray: ");
        //Object to array: Transforma el arraylist en array
        Object tb[]=persona1.toArray();
        System.out.println("");
        System.out.println("Array: "+Arrays.toString(tb));
        System.out.println("");
        for(int i=0; i<tb.length;i++){//para array solo, pero colList.size()
            System.out.println("\t"+tb[i]);//println uno debajo de otro, noponer
            }
        System.out.println("");
        System.out.println("");
     
        /*
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tIterator: ");
        //Iterator: recorrer arrayList
        Iterator<Persona> itr=persona2.iterator();
        while(itr.hasNext()){
            Persona var = itr.next();
            System.out.println(var);
        }*/
        
          
        System.out.println("");//Metodos solo de ArrayList: get, indexOf, lastIndexOf, remove set, sort, ListIterator
        System.out.println("\t\t\t\t\t\t\t\tAdd: ");
        System.out.println(persona1);
        System.out.println(persona2);
        persona2.add(0,p1);//en la pos 0 meta Sonia
        System.out.println(persona2);
        persona2.addAll(2,persona1);
        System.out.println(persona2);
        

        System.out.println("\t\t\t\t\t\t\t\tGET: ");
        System.out.println("Recorrido hacia adelante:");    
        //get: conseguir el elemento a elemento
        System.out.println(persona1.get(2).toString());
         //System.out.println("Recorrido hacia atras:");
        //for(int i=persona1.size()-1;i>=0;i--){
         //System.out.print("\t"+persona1.get(i));
        
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tIndexOF: ");
        //indexOfs
        System.out.println("Posicion empezando en 0 del primer p4: "+persona1.indexOf(p4));
        System.out.println("Posicion empezando en 0 del ultimo p4: "+persona2.lastIndexOf(p4));
        System.out.println("");
       
        System.out.println("\t\t\t\t\t\t\t\tRemoves: ");
        //Removes: quita el primero que encuentra o el elemento
        persona2.remove(3);
        ir2= persona2.listIterator();
        while(ir2.hasNext()){
            Persona var=ir2.next();
            System.out.println("\t"+var);
        }     
        
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tSet: ");
        
        //set: asigna un nuevo valor en la pos que yo le diga
        persona2.set(0,p9);
       ir2= persona2.listIterator();
        while(ir2.hasNext()){
            Persona var=ir2.next();
            System.out.println("\t"+var);
        }     
        System.out.println("");
        
       //sort: Ordenar en persona hay que decirle por que campo ordena
        System.out.println("\t\t\t\tSort: comparator");
       persona2.sort(new Comparator<Persona>(){
        @Override
        public int compare (Persona o1, Persona o2){ 
            String txt1=String.format("%-15s%03d",o1.getApellido(),o1.getEdad());//caracteres de espacios y digitos osea justificado
            String txt2=String.format("%-15s%03d",o2.getApellido(),o2.getEdad());
            System.out.println(txt2);
            return txt1.compareTo(txt2);
        }
   });
        System.out.println("");
        System.out.println("\nLISTITERATO HACIA DELANTE");
               ir2= persona2.listIterator();
        while(ir2.hasNext()){
            Persona var=ir2.next();
            System.out.println("\t"+var);
        }        
        
        
}
    public static void objetosString(){
         ArrayList<String> colList=new ArrayList<>();
        ArrayList<String> colList2=new ArrayList<>();
       /*Metodos para todas las colecciones:
        Add, size, clear, isEmpty, contains, addAll, containsAll
        remove, removeAll, retainAll, Iteratos, Object toArray
        */ 
        System.out.println("");
         System.out.println("");
          System.out.println("");
           System.out.println("");
            System.out.println("\t\t\tSTRING");
       //Add: añade elementos a una colección
       colList.add("Carlos");
       colList.add("Ana");
       colList.add("Rodrigo");
       colList.add("Susana");
       colList.add(null);
       colList.add("Diego");
       colList.add("Diego");
       System.out.println(colList);
        
       colList2.add("Ana");
       colList2.add("Susana");
       colList2.add("Diego");
       System.out.println(colList2);
       
       //AddAll: añade una colección a otra 
        colList.addAll(colList2);
        System.out.println(colList);
       
       //Size: Num de elementos de la colección
        System.out.println("Elementos de colList: "+colList.size());
        System.out.println("Elementos de colList2: "+colList2.size());
        
        //clear: Vacía la colección
       // colList2.clear();
       // System.out.println(colList2);
        
        //isEmpty si una colección no tiene o tiene elementos
        System.out.println("ColList vacía: "+colList.isEmpty());
        System.out.println("ColList2 vacía: "+colList2.isEmpty());
        
        //Contains: saber si un elemento está contenido o no en una colección
        System.out.println("ColList contiene Ana: "+colList.contains("Ana"));
        //Contains All: Si una colección esta dentro de otra
        System.out.println("ColList2 dentro de ColList: "+colList.containsAll(colList2));
        
        //remove: Elimina el elemento, salvo que en Integer elimina la posición empezando en 0
        System.out.println("Eliminar el Diego: "+colList.remove("Diego"));
        System.out.println(colList);
        
        //removeAll: Elimina una colección de otra
        //colList.removeAll(colList2);
        System.out.println(colList);
        
        //retainAll: Deja solo los elementos de la segunda colección
        colList.retainAll(colList2);
        System.out.println("Array List"+colList);
        
        //Iterator: recorrer arrayList
        Iterator<String> itr=colList.iterator();
        while(itr.hasNext()){
            String var = itr.next();
            System.out.println(var);
        }
        //Object to array: Transforma el arraylist en array
        Object tb[]=colList.toArray();
        System.out.println("Array: "+Arrays.toString(tb));
        System.out.println("");
        for(int i=0; i<tb.length;i++){//para array solo, pero colList.size()
            System.out.print("\t"+tb[i]);//println uno debajo de otro, noponer
            }
        System.out.println("");

        //Metodos solo de ArrayList: get, indexOf, lastIndexOf, remove set, sort, ListIterator
        colList.add(0,"Sonia");//en la pos 0 meta Sonia
         //get: conseguir el elemento a elemento
        System.out.println("Recorrido hacia adelante con DATOS PRIMITIVOS:");
        for(int i=0;i<colList.size();i++){
         System.out.print("\t"+colList.get(i));
    }
        System.out.println("");
         System.out.println("Recorrido hacia atras:");
        for(int i=colList.size()-1;i>=0;i--){
         System.out.print("\t"+colList.get(i));
    }
        System.out.println("");
        //indexOfs
        System.out.println("Posicion empezando en 0 del primer Diego: "+colList.indexOf("Diego"));
        System.out.println("Posicion empezando en 0 del ultimo Diego: "+colList.lastIndexOf("Diego"));
        //Removes
        System.out.println("Eliminar el : "+colList.remove(0));
        System.out.println(colList);
        //set: asigna un nuevo valor en la pos que yo le diga
        colList.set(2,"Emilio");
       System.out.println(colList);
        System.out.println("");
        /*persona1.sort(new Comparator<Persona>(){ @Override public int compare 
        (Persona o1, Persona o2){//o2,o1 orden descendente return o1.compareTo(o2); } });
        */
       //sort: Ordenar
       //Collections.sort(colList);//ordena menor a mayor
       //Collections.sort(colList,Collections.reverseOrder());//de mayor a menir
       //colList.sort((String o1, String o2)-> o1.compareTo(o2));//ordena orden asc 0-10
       //colList.sort((String o1, String o2)-> o2.compareTo(o1));//al reves
       
       colList.sort(new Comparator<String>(){
           @Override
           public int compare (String o1, String o2){//o2,o1 orden descendente
               return o1.compareTo(o2);
           }
       });
       
       System.out.println(colList); 
       
       //Distintas formas de recorrer el arrayList
        System.out.println("List Iterator hacia delante: ");
        ListIterator<String> ir2= colList.listIterator();
        while(ir2.hasNext()){
            String var=ir2.next();
            System.out.print("\t"+var);
        }
         System.out.println("\nList Iterator hacia atras: ");
        ir2= colList.listIterator(colList.size());//decir donde empieza
        while(ir2.hasPrevious()){
            String var=ir2.previous();
            System.out.print("\t"+var);
        }
        
        System.out.println("");
        System.out.println("Por colecciones");
        for(String i: colList){
             System.out.print("\t"+i);
        }System.out.println("");
    }
    public static void objetosInteger(){
        ArrayList<Integer> colList=new ArrayList<>();
        ArrayList<Integer> colList2=new ArrayList<>();
       /*Metodos para todas las colecciones:
        Add, size, clear, isEmpty, contains, addAll, containsAll
        remove, removeAll, retainAll, Iteratos, Object toArray
        */ 
       //Add: añade elementos a una colección
       colList.add(3);
       colList.add(1);
       colList.add(7);
       colList.add(9);
       colList.add(null);
       colList.add(5);
       colList.add(5);
       System.out.println(colList);
        
       colList2.add(3);
       colList2.add(7);
       colList2.add(5);
       System.out.println(colList2);
       
       //AddAll: añade una colección a otra 
        colList.addAll(colList2);
        System.out.println(colList);
       
       //Size: Num de elementos de la colección
        System.out.println("Elementos de colList: "+colList.size());
        System.out.println("Elementos de colList2: "+colList2.size());
        
        //clear: Vacía la colección
       // colList2.clear();
       // System.out.println(colList2);
        
        //isEmpty si una colección no tiene o tiene elementos
        System.out.println("ColList vacía: "+colList.isEmpty());
        System.out.println("ColList2 vacía: "+colList2.isEmpty());
        
        //Contains: saber si un elemento está contenido o no en una colección
        System.out.println("ColList contiene 9: "+colList.contains(5));
        //Contains All: Si una colección esta dentro de otra
        System.out.println("ColList2 dentro de ColList: "+colList.containsAll(colList2));
        
        //remove: Elimina el elemento, salvo que en Integer elimina la posición empezando en 0
        System.out.println("Eliminar el 3: "+colList.remove(3));
        System.out.println(colList);
        
        //removeAll: Elimina una colección de otra
        //colList.removeAll(colList2);
        System.out.println(colList);
        
        //retainAll: Deja solo los elementos de la segunda colección
        colList.retainAll(colList2);
        System.out.println("Array List"+colList);
        
        //Iterator: recorrer arrayList
        Iterator<Integer> itr=colList.iterator();
        while(itr.hasNext()){
            Integer var = itr.next();
            System.out.println(var);
        }
        //Object to array: Transforma el arraylist en array
        Object tb[]=colList.toArray();
        System.out.println("Array: "+Arrays.toString(tb));
        System.out.println("");
        for(int i=0; i<tb.length;i++){//para array solo, pero colList.size()
            System.out.print("\t"+tb[i]);//println uno debajo de otro, noponer
            }
        System.out.println("");

        //Metodos solo de ArrayList: get, indexOf, lastIndexOf, remove set, sort, ListIterator
        colList.add(0,8);//en la pos 0 meta el 8
        colList.addAll(5,colList2);//empezando de 0
        System.out.println(colList);
        System.out.println("Recorrido hacia adelante:");
        //get: conseguir el elemento a elemento
       
        for(int i=0;i<colList.size();i++){
         System.out.print("\t"+colList.get(i));
    }
        System.out.println("");
         System.out.println("Recorrido hacia atras:");
        for(int i=colList.size()-1;i>=0;i--){
         System.out.print("\t"+colList.get(i));
    }
        System.out.println("");
        //indexOfs
        System.out.println("Posicion empezando en 0 del primer 5: "+colList.indexOf(5));
        System.out.println("Posicion empezando en 0 del ultimo 5: "+colList.lastIndexOf(5));
        //Removes
        System.out.println("Eliminar el 3: "+colList.remove(3));
        System.out.println(colList);
        //set: asigna un nuevo valor en la pos que yo le diga
        colList.set(2,6);
       System.out.println(colList);
        System.out.println("");
       //sort: Ordenar
       //Collections.sort(colList);//ordena menor a mayor
       //Collections.sort(colList,Collections.reverseOrder());//de mayor a menir
       //colList.sort((Integer o1, Integer o2)-> o1.compareTo(o2));//ordena orden asc 0-10
       //colList.sort((Integer o1, Integer o2)-> o2.compareTo(o1));//al reves
       
       colList.sort(new Comparator<Integer>(){
           @Override
           public int compare (Integer o1, Integer o2){//o2,o1 orden descendente
               return o1.compareTo(o2);
           }
       });
       
       System.out.println(colList); 
       
       //Distintas formas de recorrer el arrayList
        System.out.println("List Iterator hacia delante: ");
        ListIterator<Integer> ir2= colList.listIterator();
        while(ir2.hasNext()){
            Integer var=ir2.next();
            System.out.print("\t"+var);
        }
         System.out.println("\nList Iterator hacia atras: ");
        ir2= colList.listIterator(colList.size());//decir donde empieza
        while(ir2.hasPrevious()){
            Integer var=ir2.previous();
            System.out.print("\t"+var);
        }
        
        System.out.println("");
        System.out.println("Por colecciones");
        for(Integer i: colList){
             System.out.print("\t"+i);
        }System.out.println("");
    }
}
