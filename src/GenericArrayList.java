import java.util.Scanner;

public class GenericArrayList<T> {

    private T [] array;
    private int size;
    private int curr;


    public GenericArrayList() {

        this.array = (T[]) new Object[10];
        this.size = 0 ;
        this.curr = -1 ;

    }


    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrentSize() {
        return curr;
    }

    public void setCurrentSize(int currentSize) {
        this.curr = currentSize;
    }


    //  This Method adds an element in the ArrayList
    public void add(T element)
    {

        curr++;
        this.array[curr] = element;

        size = curr +1 ;



        if(size== array.length)
        {

            increaseSize();

        }

    }

    public void increaseSize()
    {

        T [] temp = (T[]) new Object [array.length + 1];

        for (int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }
        array = temp;

    }

    public void remove(int index)
    {
        for(int i = index; index < size; index++)
        {
            if(index==(size-1))
            {
                break;
            }

            else {
                this.array[index] = array[index + 1];
            }
        }

        System.out.println("Record Deleted Successfully");
        size--;
        curr--;

    }

    public void displayAll()
    {
        for(int i = 0; i < size; i++)
        {
            T contact = (T) array[i];
            System.out.println((i+1)+" : ");
            System.out.println(contact.toString());

        }

    }

    public void displaySpecific(int index)
    {
        T contact = (T) array[index];
        System.out.println(contact.toString());
    }


    public void sortbyName()
    {

        for(int i = 0; i < size-1 ; i++)
        {
            for(int j = 0; j< size-i-1 ; j++)
            {
                T obj;

                Contact contact1 = (Contact) array[j];
                Contact contact2 = (Contact) array[j+1];

                 if(contact1.getFName().toUpperCase().compareTo(contact2.getFName().toUpperCase()) > 0)

                {
                    obj = array[j];
                    array[j] = array[j+1];
                    array[j+1] = obj;

                }

            }
        }


    }

    public void sortbyID()
    {
        for(int i = 0; i < size-1; i++)
        {
            for(int j = 0; j<size-i-1; j++)
            {
                T object ;
                Contact contact1 = (Contact) array[j];
                Contact contact2 = (Contact) array[j+1];

                if(contact1.getId() > contact1.getId() )
                {
                    object = array[j+1];
                    array[j+1]= array[j];
                    array[j]=object;
                }
            }
        }

    }

    public int searchByName(String name)
    {
        int left = 0, right = size - 1;
        for(int i = 0 ; i < size; i++)
        {
            int middle = left + (right - left) / 2;
            Contact contact1 = (Contact) array[middle];
            int result = name.toUpperCase().compareTo(contact1.getFName().toUpperCase());
            // is x present at mid
            if (result == 0)
                return middle;
            //  x is greater so ignore left half
            if (result > 0)
                left = middle + 1;
                // x is smaller so ignore right half
            else
                right = middle - 1;
        }
        return -1;
    }


    public int searchbyID(int id)
    {
        int left = 0;
        int right=size-1;

        while( left <= right ){
            int mid = (left + right)/2;

            Contact contact1  = (Contact) array[mid];

            if ( contact1.getId() < id ){
                left = mid + 1;
            }
            else if ( contact1.getId() == id ){
                return mid;

            }else{
                right = mid - 1;
            }
            mid = (left + right)/2;
        }
        return -1;
    }

    public void update(int i)
    {
        Scanner input = new Scanner(System.in);
        Contact contact1 = (Contact) array[i];
        System.out.println("Enter Update First Name : ");
        String firstName = input.next();
        System.out.println("Enter Update Last Name");
        String lastName = input.next();
        contact1.setFName(firstName);
        contact1.setLName(lastName);
        System.out.println(" Updated Successfully");
    }

}
