public class Main {
    public static void main(String[] args) {
        int arr[]= {5,2,3,0};
        int index = min(arr);
        System.out.println("gia tri nho nhat la: " + arr[index]);
    }
    public static int min(int arr[]){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;

    }

}