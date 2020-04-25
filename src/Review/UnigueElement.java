package Review;

public class UnigueElement {
    public static void main(String[] args) {
            String [] myArray = {"Khaled","Valderama","Daoud","Khaled","Rasheed","Daoud","Valderama","Khaled"};
            sort(myArray);

            String last=null;
            for(int i = 0;i<myArray.length;i++) {
                if(last==null || !myArray[i].equals(last)) {
                    last = myArray[i];
                    System.out.print(last+", ");
                }
            }
        }

        /*
         * Very naive method to sort elements. You can improve this with a merge sort.
         * Arrays.sort() would do the same job in a better way.
         */
        public static void sort(String [] array) {
            String temp = null;

            for(int j=0;j<array.length;j++) {
                for(int i = 0; i<array.length-1;i++) {
                    if(array[i].compareTo(array[i+1])<0) {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
                }
            }
        }
    }

