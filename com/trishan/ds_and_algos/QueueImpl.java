import java.util.Arrays;

public class QueueImpl {
  int[] queue;
  int front = -1;
  int rear = -1;
  int size;

  QueueImpl(int size) {
    this.size = size;
    queue = new int[size];
  }

  void enqueue(int el) {
    if (this.isFull()) {
      System.out.println("Queue is full! Can't add " + el + " to the queue");
      return;
    }
    if (front == -1) {
      front = 0;
    }
    rear++;
    queue[rear] = el;
    System.out.println("Pushed: " + el);
  }

  int dequeue() {
    if (this.isEmpty()) {
      System.out.println("Queue is empty!");
      return -1;
    }

    if (front == rear) {
      int el = queue[front];
      front = -1;
      rear = -1;
      return el;
    } else {
      return queue[front++];
    }
  }

  int peek() {
    if (this.isEmpty()) {
      System.out.println("Queue is empty!");
      return -1;
    }
    return queue[front];
  }

  boolean isFull() {
    return rear == size - 1;
  }

  boolean isEmpty() {
    return front == -1 && rear == -1;
  }

  void print() {
    System.out.println(Arrays.toString(queue));
  }
}
