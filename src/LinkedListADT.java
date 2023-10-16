import java.util.LinkedList;
public class LinkedListADT {

    public static void addElement(LinkedList<String> linkedList){
        linkedList.add("Mouse");
        linkedList.add("Cat");
        linkedList.add("Dog");
        System.out.println("LikedList : " + linkedList);
    }

    public static void addElementWithIndex(LinkedList<String> linkedList, int index, String valueElement){
        linkedList.add(index, valueElement);
        System.out.println("LikedList : " + linkedList);
    }

    public static void getElementByIndex(LinkedList<String> object, int index){
        String element = object.get(index);
        System.out.println("get Element  : " + element);
        System.out.println("LikedList : " + object);
    }

    public static void setElementValueByIndex(LinkedList<String> object, int index, String value){
        object.set(index, value);
        System.out.println("LikedList : " + object);
    }

    // viet tiep cac phuong thuc : clear, remove, contrains, indexOf, lastIndexOf
    // viet phuong thuc duyet qua cac phan tu cua LinkedList
    public static void scanElementLinkedList(LinkedList<String> object){
        for (int i = 0; i < object.size(); i++) {
            System.out.println("Element value : " + object.get(i));
        }

        for (String j : object) {
            System.out.println("Element value : " + j);
        }
    }
}
