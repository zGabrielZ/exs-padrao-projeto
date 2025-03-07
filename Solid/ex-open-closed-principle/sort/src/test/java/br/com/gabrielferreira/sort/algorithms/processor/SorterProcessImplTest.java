package br.com.gabrielferreira.sort.algorithms.processor;

import br.com.gabrielferreira.sort.algorithms.Sorter;
import br.com.gabrielferreira.sort.algorithms.impl.InsertionSortImpl;
import br.com.gabrielferreira.sort.algorithms.impl.MergeSortImpl;
import br.com.gabrielferreira.sort.algorithms.impl.SelectionSortImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SorterProcessImplTest {

    @Test
    @DisplayName("Deve executar o selection sort")
    void deveExecutarSelectionSort() {
        Sorter sorter = new SelectionSortImpl();

        SorterProcessor.process(sorter);

        Assertions.assertTrue(sorter.isExecuted());
    }

    @Test
    @DisplayName("Deve executar o insertion sort")
    void deveExecutarInsertionSort() {
        Sorter sorter = new InsertionSortImpl();

        SorterProcessor.process(sorter);

        Assertions.assertTrue(sorter.isExecuted());
    }

    @Test
    @DisplayName("Deve executar o merge sort")
    void deveExecutarMergeSort() {
        Sorter sorter = new MergeSortImpl();

        SorterProcessor.process(sorter);

        Assertions.assertTrue(sorter.isExecuted());
    }
}
