import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class EinstiegsbeispielTest {


    Einstiegsbeispiel bsp = new Einstiegsbeispiel();
    int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5};

    int[] arr2 = {1, 2, 2, 3, 4, 5, 5, 5, 5,};


    @Test
    public void TestHashMap() throws Exception {
        HashMap<Integer, Integer> EXPECTED = new HashMap<Integer, Integer>();
        EXPECTED.put(1, 3);
        EXPECTED.put(2, 3);
        EXPECTED.put(3, 4);
        EXPECTED.put(4, 2);
        EXPECTED.put(5, 1);

        HashMap<Integer, Integer> ACTUAL = Einstiegsbeispiel.getRepetitions(arr);

        Assertions.assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    public void TestHashMap2() throws Exception {
        HashMap<Integer, Integer> EXPECTED = new HashMap<Integer, Integer>();
        EXPECTED.put(1, 1);
        EXPECTED.put(2, 2);
        EXPECTED.put(3, 1);
        EXPECTED.put(4, 1);
        EXPECTED.put(5, 4);

        HashMap<Integer, Integer> ACTUAL = Einstiegsbeispiel.getRepetitions(arr2);

        Assertions.assertEquals(EXPECTED, ACTUAL);
    }


    @Test
    public void WrongInputTest() throws Exception {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        Assertions.assertThrows(Exception.class,
                () -> {
                    Einstiegsbeispiel.getRepetitions(arr);
                });

        System.out.println("Bitte eine sich Wiederholende Reihe eingeben");


    }

    @Test
    public void WrongInputTest2() throws Exception {

        int[] arr = {1, 7, 9};


        Assertions.assertThrows(Exception.class,
                () -> {
                    Einstiegsbeispiel.getRepetitions(arr);
                });


        System.out.println("Bitte eine sich Wiederholende Reihe eingeben");


    }


}
