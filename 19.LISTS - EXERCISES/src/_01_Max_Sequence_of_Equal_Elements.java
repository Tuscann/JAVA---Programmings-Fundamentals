import java.util.*; // 100/100

public class _01_Max_Sequence_of_Equal_Elements
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<Integer> myIntList = new ArrayList<>();

        for(String s : myList) {
            myIntList.add(Integer.valueOf(s));
        }

        int number = 0;
        int counter = 0;
        for (int i = 0; i < myIntList.size() ; i++) {
            int curentNum =myIntList.get(i);
            int curentCounter = 0;

            for (Integer aMyIntList : myIntList) {
                if (Objects.equals(myIntList.get(i), aMyIntList)) {
                    curentCounter++;
                }
            }

            if (curentCounter > counter) {
                number = curentNum;
                counter = curentCounter;
            }
        }

        for (int i = 0; i < counter; i++) {
            System.out.print(number + " ");
        }
    }
}
