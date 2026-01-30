class FindMax {
    public static void main(String[] args) {
        int[] arr={4,24,12,17,25,20,7};
        int max=arr[0];
        for (int num:arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Max is:" +max);
    }
}
