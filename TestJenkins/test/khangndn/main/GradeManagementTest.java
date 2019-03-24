/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khangndn.main;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GradeManagementTest
{
    public GradeManagementTest() {
    }

    @Test
    public void testCheckGrade() {
        System.out.println("checkGrade");
        GradeManagement gm = new GradeManagement(0, 0, 0, 0, 0, 0, 0);
        assertTrue("0<=quiz1<=10 only!", gm.getQuiz1() >= 0 && gm.getQuiz1() <= 10);
        assertTrue("0<=quiz2<=10 only!", gm.getQuiz2() >= 0 && gm.getQuiz2() <= 10);
        assertTrue("0<=asm1<=10 only!", gm.getAsm1() >= 0 && gm.getAsm1() <= 10);
        assertTrue("0<=asm2<=10 only!", gm.getAsm2() >= 0 && gm.getAsm2() <= 10);
        assertTrue("0<=prac<=10 only!", gm.getPrac() >= 0 && gm.getPrac() <= 10);
        assertTrue("0<=present<=10 only!", gm.getPre() >= 0 && gm.getPre() <= 10);
        assertTrue("0<=fin<=10 only!", gm.getFin() >= 0 && gm.getFin() <= 10);
    }
}
