package zadachi;


import java.util.*;

public class Calculator {
    public static Double evaluate(String expression) {
        String[] str = expression.split(" ");
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str));

        ArrayList<String> list2 = new ArrayList<>();
        for (String s1 : expression.split(" ")) {
            list2.add(s1);
        }
        while (list2.size() != 1){
            Double result = 0d;
            if (list2.indexOf("/") != -1) {
                int index = list2.indexOf("/");
                result = Double.valueOf(list2.get(index - 1)) / Double.valueOf(list2.get(index + 1));
                list2.add(index - 1, String.valueOf(result));
                list2.remove(index + 2);
                list2.remove(index + 1);
                list2.remove(index);
            }
            else if (list2.indexOf("*") != -1) {
                int index = list2.indexOf("*");
                result = Double.valueOf(list2.get(index - 1)) * Double.valueOf(list2.get(index + 1));
                list2.add(index - 1, String.valueOf(result));
                list2.remove(index + 2);
                list2.remove(index + 1);
                list2.remove(index);
            }
            else if (list2.indexOf("-") != -1) {
                int index = list2.indexOf("-");
                int lastIndex = list2.lastIndexOf("-");
                if (index == 0) {
                    result = 0.0 - Double.valueOf(list2.get(index + 1));
                    list2.add(0, String.valueOf(result));
                    list2.remove(2);
                    list2.remove(1);
                }
                else if ((lastIndex-2>0) && (list2.get(lastIndex-2).equals("-"))){
                    result = Double.valueOf(list2.get(lastIndex + 1)) + Double.valueOf(list2.get(lastIndex - 1));
                    list2.add(lastIndex - 1, String.valueOf(result));
                    list2.remove(lastIndex + 2);
                    list2.remove(lastIndex + 1);
                    list2.remove(lastIndex);
                }
                else {
                    result = Double.valueOf(list2.get(index - 1)) - Double.valueOf(list2.get(index + 1));
                    list2.add(index - 1, String.valueOf(result));
                    list2.remove(index + 2);
                    list2.remove(index + 1);
                    list2.remove(index);
                }
            }
            else if (list2.indexOf("+") != -1) {
                int index = list2.indexOf("+");
                result = Double.valueOf(list2.get(index - 1)) + Double.valueOf(list2.get(index + 1));
                list2.add(index - 1, String.valueOf(result));
                list2.remove(index + 2);
                list2.remove(index + 1);
                list2.remove(index);
            }
        }
        return Double.valueOf(list2.get(0));
    }
}
