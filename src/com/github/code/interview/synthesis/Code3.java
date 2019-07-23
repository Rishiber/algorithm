package com.github.code.interview.synthesis;

import java.util.Stack;

/**
 * @Title: Code3
 * @Description: 用两个栈实现队列（剑指Offer）
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/23 16:59
 */
public class Code3 {

    Stack<Integer> stackPush = new Stack<>();
    Stack<Integer> stackPop = new Stack<>();

    public void push(int node) {
        stackPush.push(node);
    }

    public int pop() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }
}

