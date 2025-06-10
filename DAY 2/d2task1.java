import java.util.Arrays;

public class d2task1 {

public static void main(String[]args) {
int[] num= {3,5,9,4,6};
Arrays.sort(num);
System.out.println("before swappng:"+ Arrays.toString(num));
int start=0;
int end=num.length-1;
while(start<end) {
int temp=num[end];
num[end]=num[start];
num[start]=temp;

start ++;
end --;
}
System.out.println("after swapping:" + Arrays.toString(num));

}

}
