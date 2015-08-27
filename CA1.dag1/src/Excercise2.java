/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Hvis tråd 1 når at køre n++ en gang og tråd 2 så starter vil n i konsol-output'tet være ulige. De to tråde vil køre forskudt af hinanden.
// Syncronize sørger for at der kun er en tråd der kan have fat i n af gangen.

// kodelinierne 43-54 laver en løkke der printer n ud, når n er ulige. På den måde kan man se hvor højt n, når at køre før n er ulige og dermed de to tråde kører forskudt.



/**
 *
 * @author Rasmus
 */
public class Excercise2 {

    static Even even = new Even();

    public static void main(String[] args) {

        Thread t1 = new Thread1();
        Thread t2 = new Thread2();

        t1.start();
        t2.start();

    }

    public static class Even {

        private int n = 0;

        public synchronized int next() {
            n++;
            n++;
            return n;
        }
    }

//    private static class Thread1 extends Thread {
//
//        @Override
//        public void run() {
//            
//            while (true) {
//            int a = even.next();
//                if(a%2==1)
//                        System.out.println(a);
//            }
//        }
//    }

private static class Thread1 extends Thread {

        @Override
        public void run() {
            System.out.println(even.next());

        }
    }
        
    private static class Thread2 extends Thread {

        @Override
        public void run() {
            System.out.println(even.next());

        }
    }

}


