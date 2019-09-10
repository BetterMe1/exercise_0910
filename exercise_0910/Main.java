package exercise.exercise_0910;

/**
 * @Description:
 * @Author:Anan
 * @Date:2019/9/10
 */
//复数乘法
//83.3%
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            long[] arr1 = new long[2];
            long[] arr2 = new long[2];
            solution(str1,arr1);
            solution(str2,arr2);
            long a = arr1[0]*arr2[0]-arr1[1]*arr2[1];
            long b = arr1[0]*arr2[1] +arr1[1]*arr2[0];
            System.out.println(a+"+"+b+"i");
        }
    }
    private static void solution(String str, long[] arr) {//提取出两个数字
        int i = str.indexOf("+");
        int j = str.indexOf("i");
        if(i != -1){
            arr[0] = Integer.parseInt(str.substring(0,i));
        }
        if(j != -1){
            arr[1] = Integer.parseInt(str.substring(i+1,j));
        }
    }
}
//一年中的第几天
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("-");
        int[] num = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] nums = new int[str.length];
        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.parseInt(str[i]);
        }
        boolean flag = solution(nums[0]);
        int count = 0;
        for(int i=0; i<nums[1]-1; i++){
            count += num[i];
        }
        count+= nums[2];
        if(flag && nums[1] > 2){
            count++;
        }
        System.out.println(count);
    }
    private static boolean solution(int year){
        if((year%4==0 && year%100!=0 ) || year%400==0){
            return true;
        }
        return false;
    }
}
*/

//k个一组翻转链表
/*
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()){
            String str = sc.next();
            if(!str.equals("#")){
                list.add(Integer.parseInt(str));
            }else{
                break;
            }
        }
        int k = sc.nextInt()-1;
        int i=0;
        int j=i+k;
        int temp = 0;
        while (i<list.size() && j<list.size()){
            for(int m=i,n=j; m<n; m++,n--){
                temp = list.get(m);
                list.set(m,list.get(n));
                list.set(n,temp);
            }
            i=j+1;
            j=i+k;
        }
        for(int p=0; p<list.size(); p++){
            System.out.print(list.get(p));
            if(p != list.size()-1){
                System.out.print("->");
            }
        }
        System.out.println();
    }
}*/
