/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocean.util.test;

import java.sql.SQLException;
import static ocean.util.MathUtility.*;
//chỉ có từ JDK 5, chỉ dành cho static
//tức là khi chơi trò import static, thì mọi hàm static trong class này
//khi gọi thì ko cần tên class chấm, gọi như C, vì hiểu ngầm đã chấm rồi
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    
    //class này là class xài bộ thư viện JUnit dùng để test code
    // theo dạng xanh - đỏ, thay vì nhìn bằng mắt như bên main() sout()
    // 2 file .jar đã dc add vào project này, và ta thoải mái xài
    // các hàm của nó
    // trong các hàm của thư viện này có n hàm đặc biệt đều có
    // tên xuất phát là assertX(expected và actual đưa vào)
    // nêu nó thấy expected ko có bằng actual, nó thảy màu đỏ
    //                          bằng        , nó thẩy màu xanh
    // quy tắc xanh đỏ: nếu tất cả xanh -> kết luận xanh
    //                   nếu có ít nhất 1 màu đỏ, éo quan tâm còn lại
    //                                    -> Kết luận ĐỎ
    //Đảm bảo: hàm chạy đúng mọi case, trg hợp
    @Test //biến hàm ngay sau đây thành public static void main()
    //mún chạy thì nhấn shift - f6
    //quy tắc đặt tên của nghề Tester, QC
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(1, getFactorial(0));
    }
    
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        //ngoại lệ ko phải là value để assert()
        //chỉ có thể chụp nó lại
        getFactorial(-5);
    }
}
