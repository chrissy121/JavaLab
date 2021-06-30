package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and obj of superman

        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();
        
        //DOWNCASTING from worker to SuperMan
        SuperMan superMan =(SuperMan) worker;
        superMan.feedKid();
        superMan.work("Java DEV");
    }
}
