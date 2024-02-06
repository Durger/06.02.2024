import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//Создайте класс очереди для работы с символьными значениями. Требуется создать реализации для операций
//над элементами:
//■ IsEmpty — проверка очереди на пустоту;
//■ IsFull — проверка очереди на заполнение;
//■ Enqueue — добавление элемента в очередь;
//■ Dequeue — удаление элемента из очереди;
//■ Show — отображение всех элементов очереди на экран.

        class queueForChar {
            int maxSize;
            char [] queueArray;
            int front;
            int rear;
            int nItems;

            public CharQueue (int size){
                maxSize = size;
                queueArray = new char[maxSize];
                front = 0;
                rear = -1;
                nItems = 0;
            }
            public boolean isEmpty(){
                return  (nItems == 0);
            }
            public boolean isFull(){
                return (nItems == maxSize);
            }
            public void enqueue (char value){
                if (isFull()){
                    System.out.println("Queue is full");
                    return;
                }
                rear++;
                if (rear == maxSize){
                    rear = 0;
                }
                queueArray [rear] = value;
                nItems++;
            }
            //удаление
            public char Dequeue(){
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return 0;
                }
                char temp = queueArray[front];
                front++;
                if (front == maxSize){
                    front = 0;
                }
                nItems --;
                return temp;
            }
            //вывод элементов
            public void show (){
                int count = 0;
                int index = front;
                while(count < nItems){
                    System.out.println(queueArray[index] + " ");{
                        index++;
                        if (index == maxSize){
                            index = 0
                        }
                        count++;
                    }
                    System.out.println();
                }
            }
        }


        }

    }
