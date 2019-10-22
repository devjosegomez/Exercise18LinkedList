package com.exercise18linkedlist.app;
import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		
		//LinkedList<Byte> myList = new LinkedList<Byte>();
		LinkedList miListita = new LinkedList();
		ArrayList<Short> miArrayList = new ArrayList<Short>();
		Stack<Integer> miPilita = new Stack<Integer>();
		PriorityQueue<Double> miColita = new PriorityQueue<Double>();
		HashMap<Integer, String> miDiccionario = new HashMap<Integer, String>();
		
		//miListita.add((byte)5);
		//miListita.set(1, (byte) 2);
		
		Iterator miIterator = miArrayList.iterator();
		while(miIterator.hasNext()) {
			System.out.println(miIterator.next());
		}
		
		for(Short mynumber : miArrayList){
			System.out.println(mynumber);
		}
		
	}

}
