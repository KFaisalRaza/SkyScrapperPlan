package floors_project;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	int size = 0;
	public boolean status = true;
	Deque<Integer> q = new LinkedList<>();
	ArrayList<Integer> floors = new ArrayList<>();

	public void compare(int[] arr) {
		int num1, num2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + 1])
				System.out.println("Day: " + arr[i]);
			else
				continue;
		}

	}

	public static void main(String[] args) {
		Main obj = new Main();
		// TODO Auto-generated method stub
		System.out.println("enter the total no of floors in the building");
		Scanner sc = new Scanner(System.in);
		obj.size = sc.nextInt();
		for (int i = 0; i < obj.size; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			obj.q.add(sc.nextInt());
		}
		
	   obj.print(obj.q);

		// for (int j = 0; j < obj.floors.length; j++) {
		int count = 0;
//		while (obj.checkStatus() != false && count != obj.size) {
//			for (int i = 0; i < obj.floors.size(); i++) {
//				int k = obj.floors.indexOf(i);
//				if (obj.q.isEmpty()) {
//					obj.q.push(k);
//				} else {
//					if (obj.q.peek() == k + 1) {
//						count++;
//						int num1;
//						num1 = obj.q.peek();
//						System.out.println("Day : " + (i));
//						while (num1 == k + 1 || num1 == k) {
//							obj.q.poll();
//							System.out.print(num1 + " ");
//
//							if (obj.q.peek() != null)
//								num1 = obj.q.peek();
//							else {
//								obj.q.push(k);
//								// obj.status = false;
//								break;
//							}
//						}
//
//					} else if (obj.q.peek() > k + 1) {
//						count++;
//						int num;
//						System.out.println();
//						System.out.println("Day : " + (i));
//						num = obj.q.poll();
//						System.out.println(num);
//						if (obj.floors.contains(num)) {
//							// obj.floors.remove(obj.floors.indexOf(num));
//							continue;
//						}
//						obj.q.push(k);
//					} else if (obj.q.peek() < k) {
//						obj.q.addFirst(k);
//					} else {
//						count++;
//						System.out.println("Day : " + (i));
//					}
//
//				}
//				if (obj.q.isEmpty() || obj.checkStatus() == false)
//					obj.status = false;
//
//			}
//
//		}
		
		
	}

	private void print(Deque<Integer> q2) {
		// TODO Auto-generated method stub
		int counter = 0;
		Iterator<Integer> itr = q2.iterator();
		while(itr.hasNext()||(!q2.isEmpty())) {
			
			int num1 = q2.peek();
			int num2 = itr.next();
			if(num1>num2 && num1!=num2) {
				counter++;
				System.out.println("Day: "+counter);
				System.out.print(q2.poll());
				
			}else if(q2.peek()==num2+1) {
				counter++;
				System.out.println("Day; "+counter);
				System.out.print(q2.poll()+" "+q2.poll());
				//counter++;
			}else if(num1<num2) {
				counter++;
				q2.addFirst(num2);
				//counter++;
			}
		}
		
	}

	public boolean checkStatus() {
		if (this.status)
			return true;
		else
			return false;
	}
}
