package zadachi;

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        String str = new String();
        int[] arr2 = new int[arr.length+3];
        arr2[0] = -1000;
        for (int i = 1; i < arr.length+1; i++) {
            arr2[i] = arr[i-1];
        }
        arr2[arr2.length-2] = 0;
        arr2[arr2.length-1] = 0;
        str += arr[0];
        for (int i = 2; i < arr2.length-2; i++) {
            if (arr2[i+1]-arr2[i] != 1 && arr2[i]-arr2[i-1] != 1){
                str += "," + arr2[i];
            }
            else if (arr2[i+1]-arr2[i] != 1 && arr2[i]-arr2[i-2] == 2){
                str += "-" + arr2[i];
            }
            else if (arr2[i+1]-arr2[i] == 1 && arr2[i]-arr2[i-1] != 1){
                str += "," + arr2[i];
            }
            else if (arr2[i+1]-arr2[i] != 1 && arr2[i]-arr2[i-2] != 2){
                str += "," + arr2[i];
            }
        }
        return str;
    }
}
