import main.java.MyList;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


public class MyListTest {

    @Test
    void testCreateArray() {
        MyList lists = mock(MyList.class);;
        when(lists.createArray()).thenReturn(new int[]{1, 1, 1, 1});

    }

    @Test
    void testAverageArray() {
        MyList lists = new MyList();
        assertThat(lists.averageArray(new int[]{1, 1, 1, 1})).isEqualTo(1.0);

    }

    @Test
    void testCompareArray() {
        MyList lists = new MyList();
        assertThat(lists.compareArray(7, 5)).isEqualTo("Первый список имеет большее среднее значение");
        assertThat(lists.compareArray(7, 10)).isEqualTo("Второй список имеет большее среднее значение");
        assertThat(lists.compareArray(10, 10)).isEqualTo("Средние значения равны");

    }




}

