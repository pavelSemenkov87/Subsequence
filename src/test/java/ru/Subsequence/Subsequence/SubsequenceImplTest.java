package ru.Subsequence.Subsequence;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Павел on 21.08.2016.
 */
public class SubsequenceImplTest {

    @Test
    public void find() throws Exception {
        Subsequence subsequence = new SubsequenceImpl();
        assertEquals(true, subsequence.find(Arrays.asList("B", "A", "C", "D"), Arrays.asList("BD", "B", "ABC", "A", "M", "D", "M", "C", "DC", "D")));
    }
}