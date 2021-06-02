package fp.daw.exprog2021.ejercicio3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {

	public static void main(String[] args) {
//		[2, 13, -42, 21, 4, 9, 14, -3, 11, 5] 
		Queue<Integer> q = new LinkedList<>();
		q.offer(2);
		q.offer(13);
		q.offer(-42);
		q.offer(21);
		q.offer(4);
		q.offer(9);
		q.offer(14);
		q.offer(-3);
		q.offer(11);
		q.offer(5);
		System.out.println("q = head " + q + " tail");
		invertir(4, q);
		System.out.println("q = head " + q + " tail");

	}

	static void invertir(int n, Queue<Integer> cola) {
		Deque<Integer> pila = new LinkedList<>();
		while (n != 0) {
			pila.push(cola.poll());
			n--;
		}
		Queue<Integer> aux = new LinkedList<>();
		while (!cola.isEmpty())
			aux.offer(cola.poll());
		while (!pila.isEmpty())
			cola.offer(pila.poll());
		while (!aux.isEmpty())
			cola.offer(aux.poll());
	}

}
