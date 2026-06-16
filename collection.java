
import java.util.*;
public class Main
{
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
ArrayList<String> names=new ArrayList<>();
names.add(in.nextLine());
names.add(in.nextLine());
for(String name:names)
{
    System.out.print(name);
}

List<Integer> list=new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.remove(0);
list.set(0,100);
//List.clear();
for(int arr:list)
{
    System.out.print(arr+" ");
}
System.out.println();
System.out.println(list.size());
//System.out.println(List.get(1));
list.clear();

List<Integer> list1=new LinkedList<>();
list.add(1);
list.add(2);
list.add(3);
list.addFirst(0);
list.addLast(4);
for(int linkedlist:list)
{
System.out.print(linkedlist);
}
System.out.println(list.get(1));
	}
}
