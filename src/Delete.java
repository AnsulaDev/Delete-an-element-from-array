 class Delete {
    static int delete(int arr[],int n,int x){
        int i;
        for( i=0;i<n;i++){
            if(arr[i]==x){
                break;
            }
        }
        if(arr[i]==n){
            return n;
        }
        for(int j=i;j<n-1;j++){
            arr[j]= arr[j+1];
        }
        return n-1;
    }
    public static void main(String args[]){
        int arr[]={12,45,25,61,33};
        int n=5;
        int x =45;
        System.out.println("before deletetion");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        System.out.println("after deletetion");
        int a=delete(arr,n,x);
        for(int i=0;i<a;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
