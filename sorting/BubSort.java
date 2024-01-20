public class BubSort{
    public static void main(String[] args) {
        int arr[]={2,5,1,8,5,3,3,0};

        for(int i =0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                //swap if left element is larger than right element
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
 
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" , ");
        }

    }
}
