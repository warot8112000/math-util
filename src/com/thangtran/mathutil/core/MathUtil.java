/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thangtran.mathutil.core;

/**
 *
 * @author maipisi
 */
public class MathUtil {
//    Trong class này cung cấp ra ngoài cho ai đó nhiều hàm xử lý toán học
//    clone class Math của JDK
//    Hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
//    chọn thiết kế là hàm static
    
//    Hàm tính giai thừa!!! 
//n! = 1.2.3.4... n
//không có gia thừa cho số âm
// 0! = 1! = 1 quy ước
//giai thùa hàm đồ thị dốc đứng, tăng nhanh về giá trị
//20 giai thừa là 18 con số 0, vừa kịp đủ cho kiểu long của Java
//21 giai thừa tràn kiểu long
//bài này quy ước tính n! trong khoảng từ 0 - 20!    
// Dùng giải pháp ném ngoại lệ khi khi đưa vào giá trị ngoài vùng   
   // public static long getFactorial(int n) {
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        if(n == 0 || n == 1)
//            return 1; //kết thúc sớm nếu nhận những giá trị đặc biệt
//        long product = 1; //tích nhân dồn, thuật toán con heo đất
//        for (int i = 2; i <= n; i++) {
//            product = product * i;
//        }
//        return product;
//    }
    
//    Học về đệ quy:
// là hiện tượng gọi lại chính mình với một quy mô khác
//    Ví dụ: Con búp bê Nga, giống nhau và lồng trong nhau
//    búp bê to, nhỏ hơn, nhỏ hơn nữa, nhỏ hơn nữa... đến điểm dừng

//Tình  giai thừa    
//n! = 1.2.3.4.5.6... n
//6! = 6 . 5!
//5! = 5 x 4! ; 4! = 4 . 3! ...  2 . 1!; 1! -> Điểm dừng
    
      public static long getFactorial(int n) {
          
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
          
        if(n == 0 || n == 1)
            return 1;
        return n * getFactorial(n - 1);
    }
}
