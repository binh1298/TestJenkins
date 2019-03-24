/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khangndn.main;

/**
 *
 * @author KHANG NGUYEN
 */
public class GradeManagement {
    public int checkGrade(double quiz1, double quiz2,double asm1, double asm2, double prac, double present, double fin)
    {
        if(quiz1==0 || quiz2==0 ||asm1==0 || asm2==0 || prac==0 || present==0 || fin<4 ) return 0;
        double ave= (quiz1+quiz2+asm1+asm2)*0.05+prac*0.2+ present*0.3+fin*0.3;
        if(ave>=5) return 1;
        else return 0;
    }
}
