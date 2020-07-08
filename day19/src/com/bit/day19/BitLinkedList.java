package com.bit.day19;

// 처리가 우선
// 장점 : insert,update, delete
// 단점 : read
public class BitLinkedList {

	private Node start;
	private int cnt=0;
	
	private class Node{
		Node next;
		Object val;
	}
	
	public Object get(int idx){
		// 0-> start.val
		// 1-> start.next.val
		// 2-> start.next.next.val
		Node temp=start;
		
		for(int i=0;i<idx ;i++){
			temp= temp.next;
		}
		return temp.val;
	}
	
	public int size(){
		return cnt;
	}
	
	public void add(Object val){
		cnt++;
		
		Node node= new Node();
		node.val =val;

		if(cnt==1){
			start =node;
		}else{
			Node temp=start;
			while(true){
				if(temp.next==null){
					break;
				}
				temp=temp.next;
			}
			
			temp.next=node;
		}
		
		
		
		
//		//1./////////////////////
//		Node node= new Node();
//		node.val=val;
//		start=node;
//		
//		//2./////////////////////
//		Node node = new Node();
//		node.val=val;
//		start.next=node;
//		
//		//3./////////////////////
//		Node node= new Node();
//		node.val=val;
//		start.next.next=node;
//		
//		//4./////////////////////
//		Node node= new Node();
//		node.val=val;
//		start.next.next.next=node;
		
		
	}
}
