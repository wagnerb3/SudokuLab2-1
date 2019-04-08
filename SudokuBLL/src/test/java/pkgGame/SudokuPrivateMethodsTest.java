package pkgGame;

import java.lang.reflect.Method;

import org.junit.Test;

import com.sun.tools.javac.code.Attribute.Array;

public class SudokuPrivateMethodsTest {
	@Test
	public void fillDiagonalRegionsTest() {
		System.out.println("fillDiagonalRegionsTest");
		int[][] puzzle = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		try {
			Sudoku s = new Sudoku(puzzle);
			s.printPuzzle();
			System.out.println();
			Method method = s.getClass().getDeclaredMethod("fillDiagonalRegions");
			method.setAccessible(true);
			method.invoke(s);
			s.printPuzzle();
		} catch (Exception e) {
			System.out.println("Your code is not working!");
		}
	}

	@Test
	public void setRegionTest() {
		System.out.println("setRegionTest");
		int[][] puzzle = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		try {
			Sudoku s = new Sudoku(puzzle);
			s.printPuzzle();
			System.out.println();
			Class[] parms = { int.class, int[].class };
			int[] set = { 1, 2, 3, 4 };
			Method method = s.getClass().getDeclaredMethod("setRegion", parms);
			method.setAccessible(true);
			method.invoke(s, 0, set);
			s.printPuzzle();
			System.out.println();
		} catch (Exception e) {
			System.out.println("Your code is not working!");
		}
	}

	@Test
	public void shuffleRegionTest() {
		System.out.println("shuffleRegionTest");
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		try {
			Sudoku s = new Sudoku(puzzle);
			s.printPuzzle();
			System.out.println();
			Class[] parms = { int.class };
			int[] set = { 1, 2, 3, 4 };
			Method method = s.getClass().getDeclaredMethod("shuffleRegion", parms);
			method.setAccessible(true);
			method.invoke(s, 0);
			s.printPuzzle();
			System.out.println();
		} catch (Exception e) {
			System.out.println("Your code is not working!");
		}
	}

	@Test
	public void shuffleArrayTest() {
		System.out.println();
		System.out.println("shuffleArrayTest");
		int[][] puzzle = { { 1 } };
		try {
			Sudoku s = new Sudoku(puzzle);
			Class[] parms = { int[].class };
			int[] set = { 1, 2, 3, 4 };
			for (int i = 0; i < set.length; i++) {
				System.out.print(set[i]);
			}
			System.out.println();
			Method method = s.getClass().getDeclaredMethod("shuffleArray", parms);
			method.setAccessible(true);
			method.invoke(s, set);
			for (int i = 0; i < set.length; i++) {
				System.out.print(set[i]);
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Your code is not working!");
		}
	}
}
