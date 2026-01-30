class FindMin {
    public static void main(String[] args) {
        int[] arr={4,24,12,17,25,3,20,7};
        int min=arr[0];
        for (int num:arr){
            if(num<min){
                min=num;
            }
        }
        System.out.println("Max is:" +min);
    }
}
