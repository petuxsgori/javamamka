package prak_8;

public class realize  {
    public WaitList<Integer> kek=new WaitList<Integer>();
    public BoundedWaitList<Integer> orbidol= new BoundedWaitList<Integer>(10);
    public UnfairWaitList<Integer> kik=new UnfairWaitList<Integer>();
    public realize(){
        for(int i=0;i<11;i++) {
            orbidol.add((int) (Math.random() * 255));
            kik.add((int) (Math.random() * 255));
        }
        System.out.println("BoundedWaitList:  "+orbidol);
        System.out.println("UnfairWaitList:  "+kik);
        System.out.println("максимальный размер списка BoundedWaitList: "+orbidol.getCapacity());
        for(int i=0;i<5;i++) {
            kek.add(orbidol.remove());
            kek.add(kik.remove());
        }
        System.out.println("BoundedWaitList после удаления 5-ти первых элементов:  "+orbidol);
        System.out.println("UnfairWaitList после удаления 5-ти первых элементов:  "+kik);
        for(int i=0;i<5;i++) {
            orbidol.add(kek.remove());
            kik.add(kek.remove());
        }
        System.out.println("BoundedWaitList после добавления 5-ти изначально первых элементов в конец:  "+orbidol);
        System.out.println("UnfairWaitList после добавления 5-ти изначально первых элементов в конец:  "+kik);
        for(int i=0;i<100;i++){
            kik.remove((int) (Math.random() * 255));
        }
        System.out.println("после 100-ти попыток случайным образом удалить из очереди элемент,который совпадает с случайным числом,UnfairWaitList выглядит так:");
        System.out.println(kik);
    }
}
