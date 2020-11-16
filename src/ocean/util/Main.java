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
public class Main {
    public static void main(String[] args) {
        //kĩ thuật dùng bằng mắt các test case để kết luận
        // đúng sai
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        // kì vọng 120, m chạy thực tế ra cái gì tao lưu ở actual
        //so sánh=mắt
        System.out.println("5! ?expected: "+expected+"; actual: "+actual);
        System.out.println("6! ?expected: 720; actual: "+MathUtility.getFactorial(6));
        System.out.println("0! ?expected: 1; actual: "+MathUtility.getFactorial(0));
        
        //tao kì vọng m ném về ngoại lệ nếu t đưa âm giai thừa
        MathUtility.getFactorial(-5);
        //ko sout() vì chết ngay khi gọi hàm
        //chống mắt xem có đúng ngoại lệ mình cần như thiết kế để chửi thằng
        //xài hàm ko đúng cách
    }
}
// nhược ddiemr kĩ thuật này
// cần phải dùng mắt để so sánh từng trg hợp xài hàm: so expected và actual
// nếu test nhiều tình huống, mắt đủ mệt mỏi vi phải dò từng output

//cách nâng cao
// gom cả đám test case này lại, chạy 1 lượt nhu o trên
// máy so giùm ta lun expected và actual
//sau đó
//nếu tất cả các cases mà đếu đúng, thấy ra 1 màu xanh - đèn xanh - code ổn
// nếu tất cả các cases đều đúng, ngoại trừ 1,2 vài thằng nào đó
//expected khác actual, thấy ra 1 màu đỏ, hàm ý, hàm sai rồi
//                          hàm đúng gần hết, mà sai 1 vài, ko tin cậy xài hàm
// đỏ: chỉ có ít nhất 1 cặp expected actual ko bằng nhau, kết luận ngay hàm sai

//thay vì nhìn từng case, ta sẽ nhìn chỉ màu xanh hoặc màu đỏ là đủ rồi
// ta cần thêm bộ thư viện để giúp ta việc này
//bộ thư viện nó làm 2 việc: so sánh giùm actual vs. expected
//               tùy khớp -> màu xanh
//                ko khớp -> màu đỏ
// nó tự quét hết các case mà mình đã thiết kế để nó kết luận, mắt nhìn duy nhất màu
// bộ thư viện này chính là những file .JAR  .DLL dc add thêm vào project
// bộ thư viện này mang cái tên chung cho mọi ngôn ngữ lập trình - Unit Test
// riêng cho java: Junit, testNG
// c#: NUnit
// php: PHPUnit
//......
//đưa code lên server

