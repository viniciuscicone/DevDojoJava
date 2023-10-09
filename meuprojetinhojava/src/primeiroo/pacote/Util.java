package primeiroo.pacote;

//filter em java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Util {
  public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
      // Filtrar números pares
      List<Integer> evenNumbers = numbers.stream()
                                       .filter(n -> n % 2 == 0)
                                       .collect(Collectors.toList());
      System.out.println("Pairs numbers: " + evenNumbers); // Saída: Números pares: [2, 4]
  }
}
