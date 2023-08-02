/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thangtran.mathutil.test.core;

import com.thangtran.mathutil.core.MathUtil;
import java.text.NumberFormat;
import static junit.framework.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author maipisi
 */
public class MathUtilityTest {

    public MathUtilityTest() {

    }
    //        Đây là class sẽ dùng các hàm của thư viện/framwrok Junit
//để kiểm thử/kiểm tra code chính- hàm tinhGiaiThua() bên class core.MathUtil

//Có nhiều quy tắc đặt tên hàm kiểm thử, nhưng thường sẽ nói lên mục đích của các
//case/tình huống kiểm thử tình huống xài hàm theo kiểu thành công và thất bại!!!
//Hàm dưới đây là test thành coong, trả về ngon
//ta sẽ xài hàm kiểu well - đưa 5!, 6!, không chơi đưa -5!, 30!
//@Test JUnit sẽ phối hợp với JVM để chạy hàm này
//@Test phía hậu trường chính là public static void main()
//Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tình giai thừa    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình huống tử tế đầu vào, mày phải chạy đúng
        long expected = 1;
//            long actual = ; //gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);

//            So sánh expected vs .actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
//            hàm giúp so sánh 2 giá trị nào đó có giống nhau không
//nếu giống nhau thì thảy ra màu xanh đèn đường - đường thông -- code ngon ít nhất cho case đg test
//Còn màu đỏ nếu không giống nhau -> Hàm ý expected và actual không giống nhau
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(120, MathUtil.getFactorial(6));
    }
    
//    Hàm getF() ta thiết kế có 2 tình huống xử lý
//1. Đưa data tử tế trong [0..20] -> Tình đúng được n! - done
//2. Đưa data cà chớn, âm > 20; thiết kế của hàm là ném ra  ngoại lệ
//Tao kỳ vọng ngoại lệ xuất hiện khi n < 0 || n > 20    
//rất mong ngoại lệ xuaatss hiện với n cà chớn này    

//Nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ thì HÀM ĐÚNG như thiết kế
// --> Xanh phải xuất hiện
//nếu hàm nhận vòa n < 0 hoặc n > 20 và hàm éo ném ra ngoại lệ
//    --> Hàm chạy sai thiết kế, sai kỳ vọng - MÀU ĐỎ
//Test case:
//input: -5
//expected: IllegalArgumentException xuất hiện    
//tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu là những thứ
//không thể đo lường so sanhsh theo kiểu value mà chỉ có thể đo lường = cách
//chúng có xuất hiện hay không?
//    assertEquals() ko thẻ để so sánh 2 ngoại lệ
//          equals() là bằng nhau hay không
    
//    Màu đỏ, do hàm đúng là có ném ngoại lệ thật nhưng không phải là ngoại lệ như kỳ vọng
//    Thực sự kỳ vọng sai. ko phải ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArugrumentThrowsException() {
//        MathUtil.getFactorial(-5);
////        Hàm @test chạy, hay hàm getF() chạy sẽ ném về ngoại lệ NumberFormat...
//    }
    
//    @Test(expected = IllegalArgumentException.class)
//    public void testGetFactorialGivenWrongArugrumentThrowsException() {
//        MathUtil.getFactorial(-5);
//    }
    
//    Cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!
//    Xài lambda
//    Test case: Hàm sẽ ném về ngoại lệ nếu nhận vào 21
//    tui cần thấy màu xanh khi chơi với 21!
    
    @Test
    public void testGetFactorialGivenWrongArugrumentThrowsException_LambdaVersion() {
//        Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh, 
//                tham số 2: đoạn code văn ra ngoại lệ runable)
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5));
    }
//    
    
//    Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
//    có ném, tức là hàm chạy đúng thiết kế không? --> xanh
    @Test
    public void testGetFactorialGivenWrongArugrumentThrowsException_TryCatch() {
        
//        Chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
//            bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
//nhưng ko chắc ngoại lệ mình cần có xuất hiện hay không?
//có đoạn code kiểm soát đúng ngoại lệ IllegalArugrument xh
            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
        }
    }
}
