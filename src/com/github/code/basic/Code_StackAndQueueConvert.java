package com.github.code.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Title: Code_StackAndQueueConvert
 * @Description: 如何仅用队列结构实现栈结构？如何仅用栈结构实现队列结构？
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/7 19:44
 */
public class Code_StackAndQueueConvert {

    public static class TwoQueueStack {
        private Queue<Integer> data;
        private Queue<Integer> help;

        public TwoQueueStack() {
            this.data = new LinkedList<Integer>();
            this.help = new LinkedList<Integer>();
        }

        public void push(int pushInt) {
            data.add(pushInt);
        }

        public int pop() {
            if (data.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            while (data.size() > 1) {
                help.add(data.poll());
            }
            int res = data.poll();
            swap();
            return res;
        }

        public int peek() {
            if (data.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            while (data.size() > 1) {
                help.add(data.poll());
            }
            int res = data.poll();
            help.add(res);
            swap();
            return res;
        }

        public void swap() {
            Queue<Integer> tmp = help;
            help = data;
            data = tmp;
        }
    }


    public static class TwoStackQueue {
        private Stack<Integer> stackPush;
        private Stack<Integer> stackPop;

        public TwoStackQueue() {
            this.stackPush = new Stack<Integer>();
            this.stackPop = new Stack<Integer>();
        }

        public void push(int pushInt) {
            stackPush.push(pushInt);
        }

        public int poll() {
            if (stackPush.isEmpty() && stackPop.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            } else if (stackPop.isEmpty()) {
                while (!stackPush.isEmpty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();
        }

        public int peek() {
            if (stackPush.isEmpty() && stackPop.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            } else if (stackPop.isEmpty()) {
                while (!stackPush.isEmpty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.peek();
        }
    }
}
