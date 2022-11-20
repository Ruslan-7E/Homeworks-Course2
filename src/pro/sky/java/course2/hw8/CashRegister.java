package pro.sky.java.course2.hw8;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class CashRegister {

    private static final List<String> NAMES = List.of(
            "Ivan Ivanov",
            "Peter Petrov",
            "Nikolay Nikolayev",
            "Alexey Alekseev",
            "Maria Sidorova",
            "Gleb Mikhaylov",
            "Michael Petrov",
            "Ivan Petrov",
            "Peter Ivanov",
            "Dimitry Dimitriev"
    );

    Queue<String> queue1 = new ArrayDeque<>();
    Queue<String> queue2 = new ArrayDeque<>();
}
