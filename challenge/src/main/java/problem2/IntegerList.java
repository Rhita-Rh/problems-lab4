package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int len_array;
    int num_elements;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.len_array = size;
        this.num_elements = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<this.num_elements; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
// IncreaseSize method
//-------------------------------------------------------
    public void IncreaseSize(){
        this.len_array *= 2;
        int[] newArray = new int[this.len_array];
        for(int i=0; i< num_elements; i++){
            newArray[i] = this.list[i];
        }
        this.list = newArray;
    }
    //-------------------------------------------------------
// addElement method
//-------------------------------------------------------
    public void addElement(int newVal){
        if(this.len_array <= this.num_elements){
            IncreaseSize();
        }
        this.list[num_elements] = newVal;
        num_elements ++;
    }
    //-------------------------------------------------------
// removeFirst method
//-------------------------------------------------------
    void removeFirst(int newVal){
        int index = -1;
        int i;
        for(i =0; i<this.num_elements; i++){
            if(list[i] == newVal){
                index = i;
                break; // first occurrence
            }
        }
        if(index != -1){
            this.num_elements --;
            for(int j =i; j<num_elements; j++){
                list[j] = list[j+1];
            }
            list[num_elements] = 0;
        }
    }
    //-------------------------------------------------------
// removeAll method
//-------------------------------------------------------
    void removeAll(int newVal){
        for(int i =0; i<this.num_elements; i++){
            if(list[i] == newVal){
                this.num_elements --;
                for(int j = i; j<num_elements; j++){
                    list[j] = list[j+1];
                }
                list[num_elements] = 0;
                i--; // we have consecutive redundant newVal
            }
        }

    }
}