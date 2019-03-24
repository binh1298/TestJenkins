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

    double quiz1, quiz2, asm1, asm2, prac, fin, pre;

    public GradeManagement() {
    }

    public GradeManagement(double quiz1, double quiz2, double asm1, double asm2, double prac, double pre, double fin) {
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.asm1 = asm1;
        this.asm2 = asm2;
        this.prac = prac;
        this.fin = fin;
        this.pre = pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public double getPre() {
        return pre;
    }

    public void setQuiz1(double quiz1) {
        this.quiz1 = quiz1;
    }

    public void setQuiz2(double quiz2) {
        this.quiz2 = quiz2;
    }

    public void setAsm1(double asm1) {
        this.asm1 = asm1;
    }

    public void setAsm2(double asm2) {
        this.asm2 = asm2;
    }

    public void setPrac(double prac) {
        this.prac = prac;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }

    public double getQuiz1() {
        return quiz1;
    }

    public double getQuiz2() {
        return quiz2;
    }

    public double getAsm1() {
        return asm1;
    }

    public double getAsm2() {
        return asm2;
    }

    public double getPrac() {
        return prac;
    }

    public double getFin() {
        return fin;
    }

    public int checkGrade(double quiz1, double quiz2, double asm1, double asm2, double prac, double present, double fin) {
        if (quiz1 == 0 || quiz2 == 0 || asm1 == 0 || asm2 == 0 || prac == 0 || present == 0 || fin < 4) {
            return 0;
        }
        double ave = (quiz1 + quiz2 + asm1 + asm2) * 0.05 + prac * 0.2 + present * 0.3 + fin * 0.3;
        if (ave >= 5) {
            return 1;
        } else {
            return 0;
        }
    }

}
