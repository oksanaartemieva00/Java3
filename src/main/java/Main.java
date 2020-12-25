import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[]={"кот","бегает","быстро"};
        change(arr1,0,6);
        change(arr2,1,2);
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        makeList(arrayOfStrings);

        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();
        orange1.addFruit(new Orange(),10);
        orange2.addFruit(new Orange(),12);
        apple1.addFruit(new Apple(),8);
        apple2.addFruit(new Apple(),4);
        System.out.println("Начальный вес коробки №1: "+orange1.getWeight());
        System.out.println("Начальный вес коробки №2: "+orange2.getWeight());
        System.out.println("Начальный вес коробки №3: "+apple1.getWeight());
        System.out.println("Начальный вес коробки №4: "+apple2.getWeight());
        System.out.println("Коробка 1 равна коробке 3? Ответ: "+orange1.compare(apple1));
        System.out.println("Коробка 2 равна коробке 4? Ответ: "+orange2.compare(apple2));
        orange1.take(orange2);
        apple1.take(apple2);
        System.out.println("Конечный вес коробки №1: "+orange1.getWeight());
        System.out.println("Конечный вес коробки №2: "+orange2.getWeight());
        System.out.println("Конечный вес коробки №3: "+apple1.getWeight());
        System.out.println("Конечный вес коробки №4: "+apple2.getWeight());

    }
    public static void change(Object[] arr,int a1, int a2){
        Object sw = arr[a1];
        arr[a1]=arr[a2];
        arr[a2]=sw;
        System.out.println("Смена двух элементов массива местами: "+ Arrays.toString(arr));
    }
    public static <T> void makeList(T[]arr){
        ArrayList<T> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Результат преобразования массива: "+arrList);
    }
}
