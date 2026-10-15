
package com.korai.study.ch12;

import lombok.AllArgsConstructor;

public class CollectionMain02 {
    public static void main(String[] args) {
        CustomLinkedList<String> list1 = new CustomLinkedList<>();  // 객체 생성
        list1.add("자바");
        list1.add("자바2");
        list1.add("자바3");   //자바 1,2,3 이라는 데이터를 추가
        System.out.println(list1);
        System.out.println(list1.get(-1));
    }
}

// LinkedList -> 선형 리스트(단방향)
// 노드를 연결한다.
// 노드란? 연결된 다른 노드들의 주소와 저장할 값을 포함한 것

class CustomLinkedList<E> {
    @AllArgsConstructor
    private static class Node<E> {
        E item;
        Node<E> next;
    }

    private Node<E> head;  // 첫번째 노드
    private Node<E> tail; // 마지막 노드  노드를 만들면 리스트에 연결 해야함
    private int size;  // 다음 노드( 다음 공간 생성)


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            builder.append(current.item);
            if (i != size - 1) {
                builder.append(", ");
            }
            current = current.next;
        }
        builder.append("]");
        return builder.toString();
    }

    public void add(E e) {
        Node<E> newNode = new Node<>(e, null);

        if (head == null) {  // 처음엔 리스트가 비어있기 때문에 head 가 null이다
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public E get(int index) {
        if (!(index < size && index > -1)) {
            throw new IndexOutOfBoundsException("인덱스 범위를 초과하였습니다");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }
}
