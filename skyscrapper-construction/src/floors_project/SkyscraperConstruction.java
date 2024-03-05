package floors_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class SkyscraperConstruction {
	int counter = 0;

	void floorsPlan(ArrayList<Integer> arr) {
		int current, next = 0, counter = 0;
		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i <= arr.size(); i++) {
			current = arr.get(i);
			if (i < arr.size() - 1)
				next = arr.get(i + 1);
			else {
				st.push(current);
				break;
			}
			if (current > (next + 1)) {
				counter++;
				System.out.println("Day: " + counter);
				System.out.println(current);
			} else if (current == next + 1) {
				counter++;
				System.out.println("Day: " + counter);
				System.out.println(current);
			} else {
				counter++;
				st.push(current);
				System.out.println("Day: " + counter);
			}
		}
		System.out.println("Day: " + (counter + 1));
		while (st.size() > 1 && st.peek() == (st.elementAt(1) + 1) || !st.isEmpty()) {
			System.out.print(st.pop() + " ");
		}
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			SkyscraperConstruction obj = new SkyscraperConstruction();
			System.out.print("Enter the total number of floors in the building: ");
			int n = scanner.nextInt();

			ArrayList<Integer> arr = new ArrayList<>();

			for (int day = 1; day <= n; day++) {
				System.out.print("Enter the floor size given on day " + day + ": ");
				int num = scanner.nextInt();
				arr.add(num);
			}

			obj.floorsPlan(arr);
		}

	}
}
