import java.util.*;  // 100/100

public class _06_Square_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        ArrayList<Integer> myIntList = new ArrayList<>();

        for(String s : myList) {
            myIntList.add(Integer.valueOf(s));
        }

        List<Integer> resultList = new ArrayList<>();

        for (Integer aMyIntList : myIntList) {
            int num = aMyIntList;
            double sum = Math.sqrt(num);

            if (sum == (int) sum) {
                resultList.add(aMyIntList);
            }
        }

        Collections.sort(resultList);
        Collections.reverse(resultList);

        for (Integer aResultList : resultList) {
            System.out.print(aResultList + " ");
        }
    }
}
