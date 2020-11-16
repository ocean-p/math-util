/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean.util;

/**
 *
 * @author DELL
 */
public class MathUtility {
    //fake class Math similar real
    //Math.sqrt() .abs() .pow() .sin() .PI
    public static final double PI = 3.1415; //xài MathUtility.PI
    
    //tính n!=1.2.3.4...n
    // 21! tran long roi, am giai thua ko tinh dc, vo nghia
    //0! = 1! = 1;
    //bai nay minh chi tinh qt trong khoang tu 0..20
    //neu dua n ca chon ,chui, ko them tinh
    public static long getFactorial(int n){
        //thứ 2 ông dạy tiếp, cấm vắng
        if(n<0 || n>20) throw new IllegalArgumentException("n must be between 0..20");
        
        if(n==0 || n==1) return 1; //dac biet
        
        //CPU chay lenh o cho nay, tuc la n =2..20, ko xai else
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
       //tự tin hàm chạy đúng như thiết kế
       // éo tin, phải test
       // có nhiều cách để test
       // kiểu gì cũng phải là mình: mính tính trc kết quả hầm cần trả về EXPECTED VALUE
       //                            mình gọi hàm coi nó chạy ra mấy, ACTUAL VALUE
       // so sánh coi EXPECTED VALUE == ACTUAL VALUE hay ko
       //                                     có bằng, hàm chạy đúng cho tính huống x
       //                                     ko bằng, hàm chạy sai cho th x
       //ví dụ:
       // tao nghĩ rằng 5! phải là 120 (expected)
       // giờ t gọi hàm getFactorial(5 đưa vào), coi kết quả ra mấy(actual)
       // nếu actual = 120, hàm đúng khớp vào kì vọng
       // case               n=5 hàm đúng
       // case               n=6 hàm.....
       //case                n=0 hàm .........
       //..............
       //làm các case mà mình nghĩ là ng dùng sẽ xài hàm như thế
       // rao gọi là test case
    }
}
