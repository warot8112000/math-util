/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thangtran.mathutil.main;

import com.thangtran.mathutil.core.MathUtil;

/**
 *
 * @author maipisi
 */
public class Main {
    public static void main(String[] args) {
//        Thử nghiệm hàm tính giai thừa coi đúng như thiết kế hay không?
//Ta phải đưa các tình huống sử dụng hàm trong thực tế
//VD: -5, 0 , 20, 21 coi tính ra mấy
// --> Test case: Một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng
//giả lập hành vi xài của ai đó
//Test case: là một tình huống sử dụng app, xài app(hàm) mà nó bao hàm
//Input: data đầu vào cụ thể nào đó, Output: đầu ra ứng với xử lý của hàm/chức năng của app
//dĩ nhiên dùng đầu vào để xử lý
//Kì vọng: mong hàm sẽ trả về value nào đó ứng với input ở trên
//So sánh để xem xét kết quả có như kỳ vọng hay không?
        long expected = 120; // kỳ vọng hàm ói về 120 nếu tính 5!
        int n = 5; // input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
        
    }
}
