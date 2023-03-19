package Pragrammers.Level2;



public class three {
    static int[] location;
    static int answer = 0;
    public static void main(String[] args) {
        String S = "<><<>>";
        int len = 0;
        int arr[] = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)=='?') len++;
            arr[i] = S.charAt(i);
        }
        location = new int[len];
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)=='?'){
                location[count]=i;
                count++;
            }
        }
        getReturn(S,len,0,arr);
        System.out.println(answer);
    }

    private static void getReturn(String S,int len,int cnt,int[] arr) {
        if (len == cnt) {
            int task = check(arr);
            //System.out.println(task);
            answer=Math.max(answer,task);
        }else{

            arr[location[cnt]] = '<';
            getReturn(S,len,cnt+1,arr);
            arr[location[cnt]] = '>';
            getReturn(S,len,cnt+1,arr);

        }

    }

    private static int check(int[] arr) {

        int max = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='<'){
                if(i!=0&&arr[i-1]=='>'){
                    left = 0;
                    right = 0;
                }
                left++;
            }
            else right++;


            if (left >= 1&& right>=1) {
                int price = 0;
                if(left>right) price = right;
                else price = left;
                max = Math.max(price*2,max);
            }

        }
        return max;
    }
}
