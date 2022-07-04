package Array;

public class ArrayDemo
{
    int arr[]=null;
    public ArrayDemo()
    {
        arr=new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.MIN_VALUE;
        }
    }

    //method to traverse through array
    public void traverse()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //method to print specific index value
    public void indexvalueprint(int index)
    {
        try {
            System.out.println(arr[index]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index");
        }
    }
    //method to search value in the given array
    public void searchinarray(int searchvalue)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==searchvalue)
            {
                System.out.println("value found");
                return;
            }
        }
        System.out.println("no match found");
    }
    //method to delete a value from array
    //user provide the value
    public void deletevalue(int index)
    {
        try
        {
            arr[index]=Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("out of range");
        }
    }
    //delete the complete array
    public void deletearray()
    {
        arr=null;
    }

    public static void main(String[] args) {
        ArrayDemo obj=new ArrayDemo();
        obj.traverse();
        obj.deletevalue(1);
        System.out.println("after deletion");
        obj.traverse();
        obj.indexvalueprint(2);
        obj.searchinarray(30);
        obj.deletearray();
    }
}
